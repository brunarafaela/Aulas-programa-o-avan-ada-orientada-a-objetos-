package fatec_ipi_paoo_sabado_decorator_figuras;

import java.util.Random;

public abstract class CorDePreenchimentoDecorator extends Figura {

private Figura figura;
	
	public CorDePreenchimentoDecorator (Figura figura) {
		setFigura(figura);
	}
	
	public void setFigura (Figura figura) {
		this.figura = figura;
	}
	
	public Figura getFigura() {
		return figura;
	}
	
	@Override
	public void desenhar() {
		
	}
	
	public Figura randomF() {
		Random gerador = new Random();
		int fundo = gerador.nextInt(4);
		switch(fundo) {
			case 0:
				new PreenchimentoAmarelo(figura);
			case 1:
				new PreenchimentoAzul(figura);
			case 2:
				new PreenchimentoPrata(figura);
			case 3:
				new PreenchimentoPreto(figura);
			}
		return figura;	
	}

}


