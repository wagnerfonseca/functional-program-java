package com.wagnerfonseca.model;

public class LinguagemProgramacao {
	
	private String nome;
	private String paradigma;
	private String criador;
	private int anoCriacao;
	
	public LinguagemProgramacao() {}
	
	public LinguagemProgramacao(String nome, String paradigma, String criador, int anoCriacao) {
		super();
		this.nome = nome;
		this.paradigma = paradigma;
		this.criador = criador;
		this.anoCriacao = anoCriacao;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public String getParadigma() {
		return paradigma;
	}

	public void setParadigma(String paradigma) {
		this.paradigma = paradigma;
	}
	
	public String getCriador() {
		return criador;
	}

	public void setCriador(String criador) {
		this.criador = criador;
	}

	public int getAnoCriacao() {
		return anoCriacao;
	}
	public void setAnoCriacao(int anoCriacao) {
		this.anoCriacao = anoCriacao;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", criador=" + criador + ", paradigmas=" + paradigma
				+ ", ano=" + anoCriacao + "]";
	}
	
		
	
}
