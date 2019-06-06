package entidades;

public class Aeronave {

	private String nome;
	
	public Aeronave() {	};
	
	public Aeronave(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
}
