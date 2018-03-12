package Classes;

public class Humano extends Personagem{

	

	public Humano(double pontoDeVida, double pontosDeMana, double resistenciaFisica,
			double resistenciaMagica, Arma armas, String clase) {
		super(pontoDeVida, pontosDeMana, resistenciaFisica, resistenciaMagica, armas,clase);
		
	}

        @Override
	public void ataque(Personagem p, Arma a){
            double aux;
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
        
        @Override
	public void ataqueEspecial(Personagem p){
		
	}
        
        
        public void ataque(Magia m){
            if(this.getClase().equals("Mago")){
                this.setPontoDeVida(this.getPontoDeVida()+m.getCura());
                if(this.getPontoDeVida()>2500){
                    this.setPontoDeVida(2500);
                }
                this.setPontosDeMana(this.getPontosDeMana()-12);
            }else if(this.getClase().equals("Paladino")){
                this.setPontoDeVida(this.getPontoDeVida()+m.getCura());
                if(this.getPontoDeVida()>3200){
                    this.setPontoDeVida(3200);
                }
                this.setPontosDeMana(this.getPontosDeMana()-12);
            } else if((this.getClase().equals("Mago"))&&m.getNome().equals("Cura")){
                this.setPontoDeVida(this.getPontoDeVida()+m.getCura());
                if(this.getPontoDeVida()>2500){
                    this.setPontoDeVida(2500);
                }
                this.setPontosDeMana(this.getPontosDeMana()-16);
            }
	}

//------------Recupera Mana
        @Override
        public void recuperaMana(){
            this.setPontosDeMana(this.getPontosDeMana()+10);
            if((this.getClase().equals("Guerreiro"))&&(this.getPontosDeMana()>30)){
                this.setPontosDeMana(30);
            }else if((this.getClase().equals("Paladino"))&&(this.getPontosDeMana()>80)){
                this.setPontosDeMana(80);
            }else if((this.getClase().equals("Ladrão"))&&(this.getPontosDeMana()>50)){
                this.setPontosDeMana(50);
            }else if((this.getClase().equals("Mago"))&&(this.getPontosDeMana()>100)){
                this.setPontosDeMana(100);
            }
        }
        
//----------RECUPERA TOTAL QUANDO COMEÇA UMA NOVA PARTIDA.
    @Override
    public void recuperaTotal() {
    
        if(this.getClase().equals("Guerreiro")){
            this.setPontoDeVida(4000);
            this.setPontosDeMana(30);
        }else if(this.getClase().equals("Paladino")){
            this.setPontoDeVida(3200);
            this.setPontosDeMana(80);
        }else if(this.getClase().equals("Ladrão")){
            this.setPontoDeVida(2800);
            this.setPontosDeMana(50);
        }else if(this.getClase().equals("Mago")){
            this.setPontoDeVida(2500);
            this.setPontosDeMana(100);
        }
    }
}
