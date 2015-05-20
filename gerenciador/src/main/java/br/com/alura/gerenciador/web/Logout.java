package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Usuario;


public class Logout implements Task {
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//			throws ServletException, IOException {
//
//		req.getSession().removeAttribute("usuarioLogado");
//		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/logout.html");
//		dispatcher.forward(req, resp);
////		resp.sendRedirect("WEB-INF/paginas/logout.html");
//		// PrintWriter writer = resp.getWriter();
//		// writer.println("");
//	}

	@Override
	public String executa(ServletRequest req, ServletResponse resp) {
		((HttpServletRequest) req).getSession().removeAttribute("usuarioLogado");
		return "/WEB-INF/paginas/logout.html";
	}
}
