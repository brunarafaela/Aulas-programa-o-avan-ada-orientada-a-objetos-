package fatec_ipi_pooa_sabado_observer_monitoramento;

import java.util.ArrayList;
import java.util.List;

public class MediaDisplay implements DisplayElement, Observer{
	private List <Double> temperaturas = new ArrayList <>();
	
	private double somatorio = 0;
	private int cont;
	private double media = 0;
	
	@Override
	public void update (double t, double h, double p) {
		temperaturas.add(t);	
		if (temperaturas.size() >= 10) {
			cont = temperaturas.size()-1;
			for (int i=9;i>=0;i--) {
				somatorio = temperaturas.get(cont) + somatorio;
				cont = cont-1;
			}
			media = somatorio/10;
			display();
			somatorio = 0;
		}
	}
	
	@Override
	public void display() {
			System.out.println("=============================================================================================="); 
			System.out.printf("Média das 10 últimas temperaturas =  %.1f\u00B0C\n", media);
	}
}
