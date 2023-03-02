package CarComparations;

public class Car implements Comparable<Car>{
	private String modelo;
	private Integer velMax;
	private Double aceleracao;
	private Integer cavalos;
	
	public Car(String modelo, Integer velMax, Double aceleracao, Integer cavalos) {
		this.modelo = modelo;
		this.velMax = velMax;
		this.aceleracao = aceleracao;
		this.cavalos = cavalos;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public Integer getVelMax() {
		return velMax;
	}
	
	public Integer getCavalos() {
		return cavalos;
	}
	
	public Double getAceleracao() {
		return aceleracao;
	}
	
	@Override
	public String toString() {
		String representacao = "Modelo : " + this.modelo;
		return representacao;
	}

	@Override
	public int compareTo(Car car) {
		int velMax = this.velMax.compareTo(car.getVelMax());
		if (velMax != 0) return velMax;
		
		int aceleracao = this.aceleracao.compareTo(car.getAceleracao());
		if (aceleracao != 0) return aceleracao;
		
		int cavalos = this.cavalos.compareTo(car.getCavalos());
		if (cavalos != 0) return cavalos;
		
		return this.modelo.compareToIgnoreCase(car.getModelo());
	}
	
}
