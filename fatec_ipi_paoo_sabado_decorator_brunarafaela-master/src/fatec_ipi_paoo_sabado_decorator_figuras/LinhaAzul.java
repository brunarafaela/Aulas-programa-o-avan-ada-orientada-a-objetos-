package fatec_ipi_paoo_sabado_decorator_figuras;

public class LinhaAzul extends CorDaLinhaDecorator {
	
	public LinhaAzul (Figura figura) {
		super(figura);
	}
	
	@Override
	public void desenhar() {
		System.out.println("LinhaAzul");
	}

}
