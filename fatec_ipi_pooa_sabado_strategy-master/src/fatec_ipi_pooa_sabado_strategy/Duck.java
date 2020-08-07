package fatec_ipi_pooa_sabado_strategy;

public abstract class Duck {

		FlyBehavior flyBehavior;
		
		QuackBehavior quackBehavior;
		
		public void swim () {
			System.out.println("swimming");
		}
		
		public abstract void display();

}

