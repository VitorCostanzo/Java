package br.com.cursojavaweb.empresas.servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/listaEmpresas", "/listaDeEmpresas"})
public class ListaEmpresasServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Empresa> empresas = BancoDados.getEmpresas();
		
		req.setAttribute("empresas", empresas);
		RequestDispatcher rd = req.getRequestDispatcher("/lista-empresas.jsp");
		rd.forward(req, resp);
	}

}
