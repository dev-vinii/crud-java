package br.com.fiap.main;

import br.com.fiap.bean.Carro;
import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.Conexao;

public class TesteAlterar {

	public static void main(String[] args) {
		
		var con = Conexao.abrirConexao();
		
		var cb = new Carro();
		var cd = new CarroDAO(con);
		cb.setPlaca("JKK1900");
		cb.setCor("Rosa");
		cb.setDescricao("Carro da barbie");
		System.out.println(cd.alterar(cb));
		
		Conexao.fecharConexao(con);

	}

}
