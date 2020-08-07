package fatec_ipi_paoo_sabado_decorator_figuras;


public class PreenchimentoPreto extends CorDePreenchimentoDecorator {
	
	public PreenchimentoPreto (Figura figura) {
		super(figura);
	}
	
	@Override
	public void desenhar() {
		System.out.println("PreenchimentoPreto");
	}
}	
