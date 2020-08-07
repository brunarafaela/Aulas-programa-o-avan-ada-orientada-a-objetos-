package fatec_ipi_paoo_sabado_strategy_bruna_rafaela;

import java.util.ArrayList;
import java.util.List;


public class Exemplo {

	public static void main(String[] args) {
		List <Character> characters = new ArrayList <>();
		
		characters.add(new King());
		characters.add(new Knight());
		
		for (Character character : characters) {
			character.fight();
		}
	}
	
}