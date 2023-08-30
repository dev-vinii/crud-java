package br.com.fiap.main;

import java.sql.Connection;

import br.com.fiap.dao.Conexao;

import br.com.fiap.bean.*;
import br.com.fiap.dao.*;

public class TesteInserir {

	public static void main(String[] args) {

		var con = Conexao.abrirConexao();
		
		var cb = new Carro();
		var cd = new CarroDAO(con);
		
		//Testando o método inserir
		cb.setPlaca("JKK1900");
		cb.setCor("Preto");
		cb.setDescricao("Carro 1");
		System.out.println(cd.inserir(cb));
		
		Conexao.fecharConexao(con);
	}

}
