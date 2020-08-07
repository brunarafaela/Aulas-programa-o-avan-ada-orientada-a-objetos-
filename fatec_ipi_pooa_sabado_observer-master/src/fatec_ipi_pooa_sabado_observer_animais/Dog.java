package fatec_ipi_pooa_sabado_observer_animais;

public class Dog extends Animal {

	@Override
	public void agir(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("au ");
		}
		System.out.println();

	}

}
