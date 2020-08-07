package fatec_ipi_pooa_sabado_decorator;

import java.util.Scanner;

public class Cafeteria {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String menuBebidas = "1 - Espresso\n2 - Dark Roast House Blend\n3 - Decaf\n4 - House Blend\n";
		String menuCondimentos = "1 - Mocha\n2 - Whip\n3 - Milk\n4 - Soy\n0 - Chega de Condimentos";
		
		int opBebida,opCond;
		do {
			System.out.println(menuBebidas);
			opBebida = leitor.nextInt();
			Beverage bebida = null;
			switch (opBebida) {
			case 1:
				bebida = new DarkRoast();
				break;
			case 2:
				bebida = new HouseBlend();
				break;
			case 3:
				bebida = new Decaf();
				break;
			case 4:
				bebida = new Espresso();
				break;
				
			}
			do {
				System.out.println(menuCondimentos);
				opCond = leitor.nextInt();
				switch (opCond) {
				case 1:
					bebida = new Milk(bebida);
					break;
				case 2:
					bebida = new Soy (bebida);
					break;
				case 3:
					bebida = new Mocha (bebida);
					break;
				case 4:
					bebida = new Whip (bebida);
					break;
				case 0:
					System.out.println(bebida.getDescription());
					break;
				}
			}while (opCond != 0);
		}while (opBebida != 0);
		leitor.close();
	}

}
