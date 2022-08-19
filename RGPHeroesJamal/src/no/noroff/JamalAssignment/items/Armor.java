package no.noroff.JamalAssignment.items;

import no.noroff.JamalAssignment.Slot;

public class Armor extends Item {
    ArmorType armorType;
    int  armorAttribute;

    public Armor(String name, int requiredLevel, Slot slot, ArmorType armorType, int armorAttribute) {
        super(name, requiredLevel, slot);
        this.armorType = armorType;
        this.armorAttribute = armorAttribute;
    }

    public ArmorType getArmorType() {
        return armorType;
    }



    @Override
    public String toString() {
        return "Armor{" +
                "ArmorType=" + armorType +
                ", ArmorAttribute=" + armorAttribute +
                ", Name='" + name + '\'' +
                ", RequiredLevel=" + requiredLevel +
                ", Slot=" + slot +
                '}';
    }
}
