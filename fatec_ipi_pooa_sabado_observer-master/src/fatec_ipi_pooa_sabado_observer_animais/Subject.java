package fatec_ipi_pooa_sabado_observer_animais;

public interface Subject {
	
	public void addObserver (Observer o);
	public void removeObserver (Observer o);
	public void notifyObservers();

}
