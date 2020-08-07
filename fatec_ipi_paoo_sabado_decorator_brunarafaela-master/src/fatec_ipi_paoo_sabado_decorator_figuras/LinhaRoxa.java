package fatec_ipi_paoo_sabado_decorator_figuras;

public class LinhaRoxa extends CorDaLinhaDecorator {
	
	public LinhaRoxa(Figura figura) {
		super(figura);
	}
	
	@Override
	public void desenhar() {
		System.out.println("LinhaRoxo");
	}

}
