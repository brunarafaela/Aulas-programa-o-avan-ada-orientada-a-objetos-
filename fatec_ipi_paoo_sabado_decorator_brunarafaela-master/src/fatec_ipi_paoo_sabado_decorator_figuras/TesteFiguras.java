package fatec_ipi_paoo_sabado_decorator_figuras;

import java.util.Random;

public class TesteFiguras {

	public static void main(String[] args) {

		Random gerador = new Random();
		CorDaLinhaDecorator cdld = null;
		CorDePreenchimentoDecorator cdfd = null;
		int escolhas = gerador.nextInt(2);
		int valor = gerador.nextInt(3);
		
		Figura figura = null;
		switch (valor) {
			case 0:
				figura = new Quadrado();
				break;
			case 1:
				figura = new Retangulo();
				break;
			case 2:
				figura = new Circulo();
				break;
		}
	
		if (valor == 0) {
			figura.desenhar();
		}
		else if (valor == 1) {
			if (escolhas == 0) {
				cdld.randomL();
				figura.desenhar();
			}
			else {
				cdfd.randomF();
				figura.desenhar();
			}
		}
		else {
			cdld.randomL();
			cdfd.randomF();
			figura.desenhar();
		}
		
	}
}





