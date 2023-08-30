package br.com.fiap.main;

import br.com.fiap.bean.Carro;
import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.Conexao;

public class TesteListaTodos {

	public static void main(String[] args) {

		var con = Conexao.abrirConexao();
		
		var cd = new CarroDAO(con);
		var lista = cd.listarTodos();
		
		if (lista != null) {
			for (Carro carro : lista) {
				System.out.println("Placa: " + carro.getPlaca());
				System.out.println("Cor: " + carro.getCor());
				System.out.println("Descrição: " + carro.getDescricao());
			}
		}
		
		Conexao.fecharConexao(con);
		
	}

}
