package Exceções;

public class ErroNaoTerEscolhidoPersonagem extends Exception{
	
	private int cod;
	
	public ErroNaoTerEscolhidoPersonagem(int cod){
		this.cod=cod;
	}
	
	@Override
	public String toString(){
		return "Você deve escolher pelo menos um personagem!!!";
	}
}
