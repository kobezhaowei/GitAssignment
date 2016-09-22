/**
 * 
 */

/**
 * @author Weidong Zhao
 *
 */
public class MagicStaff extends BasicWeapon implements Weapon {

	public MagicStaff() {
		super(80);
	}

	@Override
	public int hit() {
		return DAMAGE;
	}

	@Override
	public int hit(int armor) {
		int damage = DAMAGE - (int) (armor * 0.8);
		if (damage < 0) {
			return 0;
		}
		return damage;
	}

}
