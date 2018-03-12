package Classes;

public class Magia {
	
	private String nome;
	private int dano;
	private int cura;
	private int gastoMana;
	
	public Magia(String nome, int dano, int cura, int gastoMana){
		this.nome=nome;
		this.dano=dano;
		this.cura=cura;
		this.gastoMana=gastoMana;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getDano() {
		return dano;
	}
	
	public void setDano(int dano) {
		this.dano = dano;
	}
	
	public int getCura() {
		return cura;
	}
	
	public void setCura(int cura) {
		this.cura = cura;
	}
	
	public int getGastoMana() {
		return gastoMana;
	}
	
	public void setGastoMana(int gastoMana) {
		this.gastoMana = gastoMana;
	}
	
	
}
