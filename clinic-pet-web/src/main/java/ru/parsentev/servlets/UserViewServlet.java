package ru.parsentev.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.parsentev.store.UserStorage;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TODO: comment
 * @author parsentev
 * @since 17.04.2015
 */
@Controller
public class UserViewServlet extends HttpServlet {

	@Autowired
	private UserStorage storage;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("users", this.storage.values());
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/user/UserView.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	public void destroy() {
		super.destroy();
		storage.close();
	}
}
