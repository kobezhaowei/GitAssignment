/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 */
public class RoleGame {

	public static void main(String[] args) {
		Weapon sword = WeaponFactory.getWeapon("sword");
		System.out.println("Sword has " + sword.hit() + " of damage.");
		int armor = 20;
		System.out.println(
				"Swords was able to do " + sword.hit(armor) + " of damage due to an armor with " + armor + " points.");

		// TODO: Add the remainig weapons here
		// Arrow
		Weapon Arrow = WeaponFactory.getWeapon("Arrow");
		System.out.println("Arrow has " + Arrow.hit() + " of damage.");
		armor = 20;
		System.out.println(
				"Arrow was able to do " + Arrow.hit(armor) + " of damage due to an armor with " + armor + " points.");
		// Axe
		Weapon Axe = WeaponFactory.getWeapon("Axe");
		System.out.println("Axe has " + Axe.hit() + " of damage.");
		armor = 20;
		System.out.println(
				"Axe was able to do " + Axe.hit(armor) + " of damage due to an armor with " + armor + " points.");
		// MagicStaff
		Weapon MagicStaff = WeaponFactory.getWeapon("MagicStaff");
		System.out.println("MagicStaff has " + MagicStaff.hit() + " of damage.");
		armor = 20;
		System.out.println("MagicStaff was able to do " + MagicStaff.hit(armor) + " of damage due to an armor with "
				+ armor + " points.");

	}
}
