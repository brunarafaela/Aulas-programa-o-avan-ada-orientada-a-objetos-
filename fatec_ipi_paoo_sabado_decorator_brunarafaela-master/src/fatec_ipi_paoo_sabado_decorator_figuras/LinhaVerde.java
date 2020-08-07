package fatec_ipi_paoo_sabado_decorator_figuras;


public class LinhaVerde extends CorDaLinhaDecorator {

	public LinhaVerde (Figura figura) {
		super(figura);
	}
	
	@Override
	public void desenhar() {
		System.out.println("LinhaVerde");
	}

}
