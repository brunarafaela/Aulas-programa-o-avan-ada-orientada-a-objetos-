package fatec_ipi_paoo_sabado_decorator_figuras;


public class PreenchimentoPrata extends CorDePreenchimentoDecorator {
	
	public PreenchimentoPrata (Figura figura) {
		super(figura);
	}
	
	@Override
	public void desenhar() {
		System.out.println("PreenchimentoPrata");
	}

}
