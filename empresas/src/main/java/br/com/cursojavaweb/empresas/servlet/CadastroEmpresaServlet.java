package br.com.cursojavaweb.empresas.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/* 
 * Tomcat é o Servlet Container e middleware 
 * Ele instancia as classes HttpServlet e chama seus métodos
 * 
 */

@WebServlet(urlPatterns = "/cadastrando") // loadOnStartup=1 -> a instancia será criada ao iniciar o tomcat
public class CadastroEmpresaServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	// somente para ver que o tomcat cria uma (singleton) instância da classe
	public CadastroEmpresaServlet() {
		System.out.println("Nova instância de CadastroEmpresaServlet criada!");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		String cnpj = req.getParameter("cnpj");
		String data = req.getParameter("data");
		
		Empresa empresa = new Empresa(nome, cnpj, data);

		BancoDados bd = new BancoDados();
		bd.adicionar(empresa);
		
		resp.sendRedirect("listaEmpresas");
		
	}
	
}
