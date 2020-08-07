package fatec_ipi_pooa_sabado_observer_animais;

public class Mouse extends Animal {

	@Override
	public void agir(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("> ");
		}
		System.out.println();
	}

}
