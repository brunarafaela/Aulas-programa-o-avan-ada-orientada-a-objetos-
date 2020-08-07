package fatec_ipi_paoo_sabado_decorator_figuras;

public class LinhaVermelha extends CorDaLinhaDecorator {

	public LinhaVermelha(Figura figura) {
		super(figura);
	}
	
	@Override
	public void desenhar() {
		System.out.println("LinhaVermelha");
	}

}
