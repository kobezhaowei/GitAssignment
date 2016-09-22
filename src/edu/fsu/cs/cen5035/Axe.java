/**
 * 
 */

/**
 * @author Weidong Zhao
 *
 */
public class Axe extends BasicWeapon implements Weapon {

	public Axe() {
		super(60);
	}

	@Override
	public int hit() {
		return DAMAGE;
	}

	@Override
	public int hit(int armor) {
		int damage;

		if (armor < 0) {
			return 0;
		} else if (armor > 0 && armor < 20) {
			damage = DAMAGE;
		} else {
			damage = DAMAGE - armor;
		}

		return damage;
	}

}
