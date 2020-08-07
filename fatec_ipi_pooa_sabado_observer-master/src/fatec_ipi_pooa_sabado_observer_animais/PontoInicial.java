package fatec_ipi_pooa_sabado_observer_animais;

public class PontoInicial {

	public static void main(String[] args) {
		GeradorDeInteiros geradorDeInteiros = 
				new GeradorDeInteiros();
		Dog d = new Dog();
		Cat c = new Cat();
		Mouse m = new Mouse();
		Duck du = new Duck();
		geradorDeInteiros.addObserver(d);
		geradorDeInteiros.addObserver(c);
		geradorDeInteiros.addObserver(m);
		geradorDeInteiros.addObserver(du);
		geradorDeInteiros.iniciar();
	}

}
