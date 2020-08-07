package fatec_ipi_paoo_sabado_observer_bruna_rafaela;

public class Jose extends Pessoa {
	String a;

	@Override
	public void realizarAcao(Entregavel e) {
		System.out.printf("José recebeu: %s\n", e.conteudo);

	}
	
	public void setNewAssinatura(String a) {
		this.a = a;
	}
	
	public String getNewAssinatura() {
		return this.a;
	}

}