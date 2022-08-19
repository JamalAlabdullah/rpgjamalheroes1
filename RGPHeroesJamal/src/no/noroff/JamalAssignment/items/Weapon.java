package no.noroff.JamalAssignment.items;

import no.noroff.JamalAssignment.Slot;

public class Weapon extends Item {
    private WeaponType weaponType;

    private double weaponDamage;

    public Weapon(String name, int requiredLevel, WeaponType weaponType, double weaponDamage) {
        super(name, requiredLevel, Slot.LEGS);
        this.weaponType = weaponType;
        this.weaponDamage = weaponDamage;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public double getWeaponDamage() {
        return weaponDamage;
    }



    @Override
    public String toString() {
        return "\n          {Slot: " + getSlot() + ", WeaponType: " + getWeaponType() + ", Name: "
                + getName() + ", Required Level: " + getRequiredLevel() + ", Damage: " + getWeaponDamage()  +
                 "}";
    }
}