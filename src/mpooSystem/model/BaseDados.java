package mpooSystem.model;

import java.util.ArrayList;

public class BaseDados {

	private ArrayList<Pessoa> pessoas;
	
	public void createBase() {
		inicializarBase();
	}
	
	private void inicializarBase() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	private Pessoa buscarPessoa(String cpf) {
		 for(Pessoa pessoa : pessoas) {
			 if(pessoa.getCpf().equals(cpf)) return pessoa;
		 }
		 return null;
	}
	
	public boolean isPessoa(Pessoa pessoa) {
		for(Pessoa pessoaArray : pessoas) {
			 if(pessoaArray.getCpf().equalsIgnoreCase(pessoa.getCpf())
				&& pessoaArray.getNome().equalsIgnoreCase(pessoa.nome)
				&& pessoaArray.getSexo().equalsIgnoreCase(pessoa.getSexo())
				) return true;
		 }
		return false;
	}
	
	public boolean isUsuario(String login, String senha) {
		for(Pessoa pessoa : pessoas) {
			if(pessoa instanceof Usuario) {
				Usuario usuario = (Usuario)pessoa ;
				if(usuario.getLogin().equalsIgnoreCase(login) && usuario.getSenha().equals(senha) ) return true;
			}
		 }
		return false;
	}
	
	public boolean isUsuario(Usuario usuario) {
		for(Pessoa pessoa : pessoas) {
			if(pessoa instanceof Usuario) {
				Usuario usuarioCast = (Usuario)pessoa ;
				if(usuarioCast.getLogin().equalsIgnoreCase(usuario.getLogin()) && usuarioCast.getSenha().equals(usuario.getSenha()) ) return true;
			}
		 }
		return false;
	}
	
	public boolean isAdmin(String chaveAcesso) {
		for(Pessoa pessoa : pessoas) {
			if(pessoa instanceof Administrador) {
				Administrador administrador = (Administrador)pessoa ;
				if(administrador.getChaveAcesso().equals(chaveAcesso))return true;
			}
		 }
		return false;
	}
}
