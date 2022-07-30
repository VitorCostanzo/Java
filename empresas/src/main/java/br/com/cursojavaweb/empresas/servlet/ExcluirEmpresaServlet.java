package br.com.cursojavaweb.empresas.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/excluirEmpresa")
public class ExcluirEmpresaServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int idParam = Integer.parseInt(req.getParameter("id"));
		
		BancoDados bd = new BancoDados();
		bd.removeEmpresa(idParam);
		
		resp.sendRedirect("listaEmpresas");
		
	}
	
}
