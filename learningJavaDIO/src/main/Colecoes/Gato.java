package main.Colecoes;

public class Gato implements Comparable<Gato>{
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public String getCor() {
		return cor;
	}
	
	@Override
	public String toString() {
		String gato = "Nome : " + this.nome +
					  " Idade : " + this.idade +
					  " Cor : " + this.cor;
		return gato;
	}

	@Override
	public int compareTo(Gato gato) {
		return this.getIdade().compareTo(gato.getIdade());
	}
}
