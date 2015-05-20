package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/executa")
public class Controller extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {

		String task = req.getParameter("task");
		if (task == null)
			throw new IllegalArgumentException("Do you forgot, parameter???");

		try {
			task = "br.com.alura.gerenciador.web." + task;
			Class<?> tipo = Class.forName(task);
			Task instance = (Task) tipo.newInstance();
			String pagina = instance.executa(req, resp);
			RequestDispatcher dispatcher = req.getRequestDispatcher(pagina);
			dispatcher.forward(req, resp);
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException e) {
			throw new ServletException(e);
		}

	}

}
