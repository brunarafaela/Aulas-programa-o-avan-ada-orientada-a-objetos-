package fatec_ipi_pooa_sabado_observer_monitoramento;

import java.text.NumberFormat;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	
	private String currentConditions;
	
	public void update (double t, double h, double p) {
		this.currentConditions = String.format(
				"Temperatura: %.1f\u00B0C, Humidade: %s, Pressão: %smmHg",
				t, 
				NumberFormat.getPercentInstance().format(h),
				p
				);
		display();
	}
	

	@Override
	public void display() {
		System.out.printf("Condições atuais: %s\n", currentConditions);
	}
	

}
