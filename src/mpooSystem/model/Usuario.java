package mpooSystem.model;

public class Usuario extends Pessoa{
	
	public String login;
	private String senha;
	

	public Usuario( String login, String senha, String nome, String cpf, String sexo) {
		super(nome, cpf, sexo);
		this.login = login;
		this.senha = senha;
	}

	public Usuario(String nome, String cpf, String login, String senha) {
		super(nome, cpf);
		this.login = login;
		this.senha = senha;
	}


	public String getLogin() {
		return login;
	}


	public String getSenha() {
		return senha;
	}


}
