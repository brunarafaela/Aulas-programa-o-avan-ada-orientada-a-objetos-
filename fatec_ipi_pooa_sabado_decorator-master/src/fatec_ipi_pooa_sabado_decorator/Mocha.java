package fatec_ipi_pooa_sabado_decorator;

public class Mocha extends CondimentDecorator {

	public Mocha (Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public double cost() {
		return 4.7 + super.cost();
	}

}
