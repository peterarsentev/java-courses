package ru.parsentev.servlets;


import org.codehaus.jackson.map.ObjectMapper;
import ru.parsentev.form.UserForm;
import ru.parsentev.models.User;
import ru.parsentev.store.UserCache;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TODO: comment
 * @author parsentev
 * @since 25.04.2015
 */
public class CreateUserJsonServlet extends HttpServlet {

	private final UserCache USER_CACHE = UserCache.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.addHeader("Content-Type", "application/json; charset=utf-8");
		final ServletOutputStream out = resp.getOutputStream();
		out.print(new ObjectMapper().writeValueAsString(USER_CACHE.values()));
		out.flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.addHeader("Content-Type", "application/json; charset=utf-8");
		final UserForm form = new ObjectMapper().readValue(req.getInputStream(), UserForm.class);
		USER_CACHE.add(new User(USER_CACHE.generateId(), form.getLogin(), null));
		resp.getOutputStream().write("{'result' : 'true'}".getBytes());
	}
}
