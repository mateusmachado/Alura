package br.com.alura.gerenciador.web;

import java.util.Collection;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

public class BuscaEmpresa implements Task {

	@Override
	public String executa(ServletRequest req, ServletResponse resp) {
		String filtro = req.getParameter("filtro");
		Collection<Empresa> empresas = new EmpresaDAO()
				.buscaPorSimilaridade(filtro);
		req.setAttribute("empresas", empresas);
		return "/WEB-INF/paginas/buscaEmpresa.jsp";
	}
}
