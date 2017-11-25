package org.paradigma.ex2;


public class Cientista {
	
	private String nome;
	private int anoNascimento;
	private int idade;
	private String paisOrigem;
	private String sexo;
	private String pesquisaInvencao;	
	
	public Cientista(String nome, int anoNascimento, String paisOrigem, String sexo, String pesquisaInvencao) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.paisOrigem = paisOrigem;
		this.sexo = sexo;
		this.pesquisaInvencao = pesquisaInvencao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getPesquisaInvencao() {
		return pesquisaInvencao;
	}
	public void setPesquisaInvencao(String pesquisaInvencao) {
		this.pesquisaInvencao = pesquisaInvencao;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int diferencaPorAno(final Cientista outro) {
		return this.anoNascimento - outro.getAnoNascimento();
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s", anoNascimento, nome);
	}

}
