package mpooSystem.model;

public class Administrador extends Usuario {

	private String chaveAcesso;

	public Administrador(String nome, String cpf, String login, String senha, String chaveAcesso) {
		super(nome, cpf, login, senha);
		this.chaveAcesso = chaveAcesso;
	}

	public Administrador(String login, String senha, String nome, String cpf, String sexo, String chaveAcesso) {
		super(login, senha, nome, cpf, sexo);
		this.chaveAcesso = chaveAcesso;
	}

	public String getChaveAcesso() {
		return chaveAcesso;
	}
	
}
