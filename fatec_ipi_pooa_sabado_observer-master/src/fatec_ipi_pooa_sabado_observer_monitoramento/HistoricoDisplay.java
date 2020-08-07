package fatec_ipi_pooa_sabado_observer_monitoramento;



import java.util.ArrayList;
import java.util.List;

public class HistoricoDisplay implements DisplayElement, Observer{

	private List <Double> temperaturas = new ArrayList <>();
	
	private int cont;
	private double historico = 0;
	
	@Override
	public void update (double t, double h, double p) {
		temperaturas.add(t);	
		if (temperaturas.size() >= 10) {
			cont = temperaturas.size()-1;
			for (int i=9;i>=0;i--) {
				historico = temperaturas.get(cont);
				cont = cont-1;
			display();
		}
	}
}
	
	@Override
	public void display() {
		System.out.println("=============================================================================================="); 
		System.out.printf("Histórico das 10 últimas temperaturas: %.1f\u00B0C\n", historico );
	}
}
