package fatec_ipi_paoo_sabado_observer_bruna_rafaela;

public abstract class Pessoa implements Observer{
	
	public abstract void realizarAcao(Entregavel e);

	public void update(Entregavel e) {
		realizarAcao(e);
	}

	public abstract void setNewAssinatura (String a);
	
	public void setAssinatura (String a) {	
		setNewAssinatura(a);
	}
	
	public abstract String getNewAssinatura ();
	
	public String getAssinatura() {
		return getNewAssinatura();
	}

}