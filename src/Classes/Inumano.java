package Classes;

import javax.swing.JOptionPane;

public class Inumano extends Personagem{

	

	public Inumano(double pontoDeVida, double pontosDeMana, 
                double resistenciaFisica, double resistenciaMagica, Arma armas, String clase) {
super(pontoDeVida, pontosDeMana, resistenciaFisica, resistenciaMagica, armas,clase);
		
	}

	
	
        @Override
	public void ataqueEspecial(Personagem p){
		
	}

	
        @Override
	public void ataque(Personagem p, Arma a){
            double aux;
            aux=0;
            aux = a.getDano() - p.getResistenciaFisica(); 
             
                aux = p.getPontoDeVida() - aux;
                p.setPontoDeVida(aux);
        
	}
	
        @Override
        public void ataque(Personagem p, Magia m){
		double aux;
            aux = m.getDano() - p.getResistenciaMagica(); 
             
                aux = p.getPontoDeVida() - aux;
                p.setPontoDeVida(aux);
                
            if((m.getNome().equals("Halito de Fogo"))||(m.getNome().equals("Envenenamento"))||(m.getNome().equals("Tempestade"))){
                this.setPontosDeMana(this.getPontosDeMana()-12);
            }else{
                this.setPontosDeMana(this.getPontosDeMana()-14);
            }
	}
        
//------------Recupera Mana
        @Override
        public void recuperaMana(){
         this.setPontosDeMana(this.getPontosDeMana()+10);
            if((this.getClase().equals("Dragão"))&&(this.getPontosDeMana()>40)){
                this.setPontosDeMana(40);
            }else if((this.getClase().equals("Animal"))&&(this.getPontosDeMana()>30)){
                this.setPontosDeMana(30);
            }else if(((this.getClase().equals("Zumbi"))&&(this.getPontosDeMana()>20))|| ((this.getClase().equals("Troll"))&&(this.getPontosDeMana()>100))){
                this.setPontosDeMana(20);
            }  
        }

//----------RECUPERA TOTAL QUANDO COMEÇA UMA NOVA PARTIDA.        
        @Override
    public void recuperaTotal() {
    
        if(this.getClase().equals("Dragão")){
            this.setPontoDeVida(3000);
            this.setPontosDeMana(40);
        }else if(this.getClase().equals("Animal")){
            this.setPontoDeVida(3200);
            this.setPontosDeMana(30);
        }else if(this.getClase().equals("Zumbi")){
            this.setPontoDeVida(2500);
            this.setPontosDeMana(20);
        }else if(this.getClase().equals("Troll")){
            this.setPontoDeVida(2800);
            this.setPontosDeMana(20);
        }
    }
}
