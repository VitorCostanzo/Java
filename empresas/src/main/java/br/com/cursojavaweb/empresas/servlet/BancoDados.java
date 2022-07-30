package br.com.cursojavaweb.empresas.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author vitor
 *
 *         Classe que iremos utilizar para simular um banco de dados
 */
public class BancoDados {

	private static List<Empresa> empresasCadastradas = new ArrayList<Empresa>();

	public void adicionar(Empresa empresa) {
		empresasCadastradas.add(empresa);
	}

	public static List<Empresa> getEmpresas() {
		return empresasCadastradas;
	}

	public void removeEmpresa(int idParam) {
		Iterator<Empresa> it = empresasCadastradas.iterator();
		
		while (it.hasNext()) {
			Empresa emp = it.next();
			
			if (emp.getId() == idParam) {
				it.remove();
			}
		}

	}

	public Empresa buscaEmpresaPeloId(int id) {
		for (Empresa empresa : empresasCadastradas) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
}
