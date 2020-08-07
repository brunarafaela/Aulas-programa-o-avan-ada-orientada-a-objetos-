package fatec_ipi_pooa_sabado_observer_animais;

public class Duck extends Animal {

	@Override
	public void agir(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("O ");
		}
		System.out.println();
	}

}
