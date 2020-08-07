package fatec_ipi_pooa_sabado_decorator;

	
	public class Soy extends CondimentDecorator {
		
		public Soy(Beverage beverage) {
			super(beverage);
		}
		
		@Override
		public double cost() {
			return 3.2 + super.cost();
		}

	}
