package fatec_ipi_paoo_sabado_decorator_figuras;

import java.util.Random;

public abstract class CorDaLinhaDecorator extends Figura {
	
	private Figura figura;
	
	public CorDaLinhaDecorator (Figura figura) {
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
	
	public Figura randomL () {
		Random gerador = new Random();
		int linha = gerador.nextInt(4);
		switch (linha) {
			case 0:
				new LinhaAzul(figura);
			case 1:
				new LinhaRoxa(figura);
			case 2:
				new LinhaVerde(figura);
			case 3:
				new LinhaVermelha(figura);
			}
		return figura;
	}

}
