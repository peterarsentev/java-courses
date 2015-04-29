package ru.parsentev.servlets;

import com.sun.net.httpserver.HttpServer;
import ru.parsentev.models.User;
import ru.parsentev.store.UserCache;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO: comment
 * @author parsentev
 * @since 17.04.2015
 */
public class UserViewServlet extends HttpServlet {

	private final UserCache USER_CACHE = UserCache.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("users", this.USER_CACHE.values());
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/user/UserView.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	public void destroy() {
		super.destroy();
		USER_CACHE.close();
	}
}
