package Classes;

import java.util.ArrayList;

public abstract class Personagem {
	
	private double pontoDeVida;
	private double pontosDeMana;
	private double resistenciaFisica;
	private double resistenciaMagica;
	private Arma armas;
	private String clase;
	public abstract void ataque(Personagem p, Arma a);
        public abstract void ataque(Personagem p, Magia m);
	public abstract void ataqueEspecial(Personagem p);
        public abstract void recuperaMana();
        public abstract void recuperaTotal();
      

public Personagem(double pontoDeVida, double pontosDeMana,double resistenciaFisica,
        double resistenciaMagica, Arma armas, String clase) {
		super();
		this.pontoDeVida = pontoDeVida;
		this.pontosDeMana = pontosDeMana;
		this.resistenciaFisica = resistenciaFisica;
		this.resistenciaMagica = resistenciaMagica;
		this.armas = armas;
		this.clase = clase;
	}

public String getClase() {
	return clase;
}

public void setClase(String clase) {
	this.clase = clase;
}

	//--------Pontos de Vida
	public double getPontoDeVida() {
		return pontoDeVida;
	}

	public void setPontoDeVida(double pontoDeVida) {
		this.pontoDeVida = pontoDeVida;
	}

//--------Pontos de Mana	
	public double getPontosDeMana() {
		return pontosDeMana;
	}

	public void setPontosDeMana(double pontosDeMana) {
		this.pontosDeMana = pontosDeMana;
	}

//----------Resistencia Magica
	public double getResistenciaMagica() {
		return resistenciaMagica;
	}

	public void setResistenciaMagica(double resistenciaMagica) {
		this.resistenciaMagica = resistenciaMagica;
	}

//--------------Armas	
	public Arma getArmas() {
		return armas;
	}

//-------------Pergunta e Responde	
	public void pergunta(String Pergunta){
		
	}
	
	public void Responde(String Resposta){
		
	}
	
//------------Resistencia F�sica	
	public double getResistenciaFisica() {
		return resistenciaFisica;
	}

	public void setResistenciaFisica(double resistenciaFisica) {
		this.resistenciaFisica = resistenciaFisica;
	}
        
        public void ataque(Magia m){
            
        }
        
}
