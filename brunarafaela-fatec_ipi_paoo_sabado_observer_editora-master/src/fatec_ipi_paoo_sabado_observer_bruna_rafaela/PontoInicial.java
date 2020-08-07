package fatec_ipi_paoo_sabado_observer_bruna_rafaela;

public class PontoInicial {

	public static void main(String[] args) {
		Editora editora = new Editora();
		Joao joao = new Joao();
		Maria maria = new Maria();
		Jose jose = new Jose();
		joao.setAssinatura("Fim de semana");
		jose.setAssinatura("Diário ");
		maria.setAssinatura("Semanal");
		editora.addObserver(joao);
		editora.addObserver(maria);
		editora.addObserver(jose);
		editora.iniciar();
	}
}