package fatec_ipi_pooa_sabado_strategy;

import java.util.ArrayList;
import java.util.List;


public class Exemplo {

	public static void main(String[] args) {
		List <Duck> ducks = new ArrayList <>();
		
		ducks.add(new DonaldDuck());
		ducks.add(new RubberDuck());
		
		for (Duck duck : ducks) {
		duck.swim();
		}
	}
	
}
