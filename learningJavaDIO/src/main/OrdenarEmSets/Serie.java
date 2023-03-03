package main.OrdenarEmSets;

import java.util.Objects;

public class Serie {
	private String nome;
	private String genero;
	private Integer duracao;
	
	public Serie(String nome, String genero, Integer duracao) {
		this.nome = nome;
		this.genero = genero;
		this.duracao = duracao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public Integer getDuracao() {
		return duracao;
	}
	
	@Override
	public String toString() {
		return "{" +
				"Nome : " + this.nome +
				", Genero : " + this.genero +
				", Duração : " + this.duracao + "}";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Serie serie = (Serie) obj;
		return nome.equals(serie.nome) && genero.equals(serie.genero) && duracao.equals(serie.duracao);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, genero, duracao);
	}
}
