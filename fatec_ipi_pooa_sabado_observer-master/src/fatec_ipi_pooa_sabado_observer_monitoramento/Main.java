package fatec_ipi_pooa_sabado_observer_monitoramento;

public class Main {
	
	public static void main(String[] args) {
	WeatherData wd = new WeatherData();
	wd.addObserver(new CurrentConditionsDisplay());
	wd.addObserver(new ForecastDisplay());
	wd.addObserver(new StatsDisplay());
	wd.addObserver(new HeatIndexDisplay());
	wd.addObserver(new MediaDisplay());
	wd.addObserver(new HistoricoDisplay());
	wd.iniciar();
	}
}
