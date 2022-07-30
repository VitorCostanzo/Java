package br.com.cursojavaweb.empresas.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/mostrarEmpresa")
public class MostrarEmpresaServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String idParam = req.getParameter("id");
		int id = Integer.parseInt(idParam);
		
		BancoDados bd = new BancoDados();
		Empresa empresa = bd.buscaEmpresaPeloId(id);
		
		req.setAttribute("empresa", empresa);
		RequestDispatcher rd = req.getRequestDispatcher("/editar-empresa.jsp");
		rd.forward(req, resp);
	}
	
}
