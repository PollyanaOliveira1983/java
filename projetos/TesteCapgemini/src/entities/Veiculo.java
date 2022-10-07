package entities;

public class Veiculo {

	String marca;
	String cor;
	String placa;
	Integer velocidade;
	
	
	public Veiculo(String marca, String cor, String placa, Integer velocidade) {
		this.marca = marca;
		this.cor = cor;
		this.placa = placa;
		this.velocidade = velocidade;
	}

	
	
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public Integer getVelocidade() {
		return velocidade;
	}



	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}



	public Integer acelerar() {
		return velocidade * 2;
	}	

	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", cor=" + cor + ", placa=" + placa + ", velocidade=" + velocidade + "]";
	}
	
	
}
