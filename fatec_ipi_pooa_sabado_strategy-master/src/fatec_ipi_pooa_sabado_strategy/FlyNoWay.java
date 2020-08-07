package fatec_ipi_pooa_sabado_strategy;

public class FlyNoWay implements FlyBehavior {

	@Override
	public  void fly() {
		System.out.println("Can't fly");
	}
	
}
