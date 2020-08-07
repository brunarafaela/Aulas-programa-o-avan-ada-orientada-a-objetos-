package fatec_ipi_pooa_sabado_decorator;

public abstract class CondimentDecorator extends Beverage {
	
	private Beverage beverage;
	
	public CondimentDecorator(Beverage beverage){
		setBeverage(beverage);
	}	
	
	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public Beverage getBeverage() {
		return beverage;
	}
	
	@Override
	public double cost() {
		return beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " with " + getClass().getSimpleName();
	}
}
