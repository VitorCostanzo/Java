package br.com.cursojavaweb.empresas.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/editarEmpresa")
public class EditarEmpresaServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int idParam = Integer.parseInt(req.getParameter("id"));
		String nomeParam = req.getParameter("nome");
		String cnpjParam = req.getParameter("cnpj");
		String dataParam = req.getParameter("data");
		
		BancoDados bd = new BancoDados();
		Empresa empresa = bd.buscaEmpresaPeloId(idParam);
		
		empresa.setId(idParam);
		empresa.setNome(nomeParam);
		empresa.setCnpj(cnpjParam);
		empresa.setData(dataParam);
		
		resp.sendRedirect("listaEmpresas");
	}

}
