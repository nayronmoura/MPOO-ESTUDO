package mpooSystem.model;

public class Pessoa{
	public String nome;
	private String cpf;
	String sexo;


	public Pessoa(String nome, String cpf, String sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "Nome: " +nome+" Cpf: "+cpf+" Sexo: "+sexo;
	}

}
