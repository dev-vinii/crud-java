package br.com.fiap.main;

import br.com.fiap.bean.Carro;
import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.Conexao;

public class TesteExcluir {

	public static void main(String[] args) {
		
		var con = Conexao.abrirConexao();
		
		var cb = new Carro();
		var cd = new CarroDAO(con);
		cb.setPlaca("JKK1900");
		
		System.out.println(cd.excluir(cb));
		
		Conexao.fecharConexao(con);

	}

}
