
package fatec_ipi_paoo_sabado_decorator_figuras;


public class PreenchimentoAzul extends CorDePreenchimentoDecorator {
	
	public PreenchimentoAzul (Figura figura) {
		super(figura);
	}
	
	@Override
	public void desenhar() {
		System.out.println("PreenchimentoAzul");
	}

}
