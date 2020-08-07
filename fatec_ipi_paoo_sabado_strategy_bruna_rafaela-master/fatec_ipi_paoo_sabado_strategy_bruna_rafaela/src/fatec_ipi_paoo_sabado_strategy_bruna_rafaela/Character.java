package fatec_ipi_paoo_sabado_strategy_bruna_rafaela;

public abstract class Character {

	WeaponBehavior weapon;
	
	public void setWeaponBehavior(WeaponBehavior w) {
		this.weapon = w;
	}

	public void fight() {
		weapon.useWeapon();
	}
}