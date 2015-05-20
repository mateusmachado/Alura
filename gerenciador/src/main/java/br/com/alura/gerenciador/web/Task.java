package br.com.alura.gerenciador.web;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public interface Task {

	String executa(ServletRequest req, ServletResponse resp);
}
