package fatec_ipi_paoo_sabado_decorator_figuras;

public class PreenchimentoAmarelo extends CorDePreenchimentoDecorator {
	
	public PreenchimentoAmarelo (Figura figura) {
		super(figura);
	}
	
	@Override
	public void desenhar() {
		System.out.println("PreenchimentoAmarelo");
	}
	
}
