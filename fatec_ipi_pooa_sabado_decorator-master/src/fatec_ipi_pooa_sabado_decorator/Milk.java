package fatec_ipi_pooa_sabado_decorator;

public class Milk extends CondimentDecorator {

	public Milk (Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public double cost() {
		return 2.5 + super.cost();
	}

}
