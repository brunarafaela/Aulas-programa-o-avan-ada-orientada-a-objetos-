package fatec_ipi_pooa_sabado_decorator;

public abstract class Beverage {
	
	public String getDescription() {
		return getClass().getSimpleName();
	}
	
	public abstract double cost();
	
}