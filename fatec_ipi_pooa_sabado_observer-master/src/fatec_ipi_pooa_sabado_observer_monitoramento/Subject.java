package fatec_ipi_pooa_sabado_observer_monitoramento;

public interface Subject {
	public void addObserver (Observer observer);
	public void removeObserver (Observer observer);
	public void notifyObservers();
}
