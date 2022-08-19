package no.noroff.JamalAssignment.heroes;

import no.noroff.JamalAssignment.HeroAttribute;

public class Mage extends Hero {

    static int mageStrength = 1, mageDexterity = 1, mageIntelligence = 8;
    static int mageStrengthUp = 1, mageDexterityUp = 1, mageIntelligenceUp = 5;

    public Mage(String name, int levelAttributes, HeroAttribute heroAttribute2) {
        super(name, levelAttributes, heroAttribute2);
    }

    public static int getMageStrength() {
        return mageStrength;
    }

    public static void setMageStrength(int mageStrength) {
        Mage.mageStrength = mageStrength;
    }

    public static int getMageDexterity() {
        return mageDexterity;
    }

    public static void setMageDexterity(int mageDexterity) {
        Mage.mageDexterity = mageDexterity;
    }

    public static int getMageIntelligence() {
        return mageIntelligence;
    }

    public static void setMageIntelligence(int mageIntelligence) {
        Mage.mageIntelligence = mageIntelligence;
    }

    public static int getMageStrengthUp() {
        return mageStrengthUp;
    }

    public static void setMageStrengthUp(int mageStrengthUp) {
        Mage.mageStrengthUp = mageStrengthUp;
    }

    public static int getMageDexterityUp() {
        return mageDexterityUp;
    }

    public static void setMageDexterityUp(int mageDexterityUp) {
        Mage.mageDexterityUp = mageDexterityUp;
    }

    public static int getMageIntelligenceUp() {
        return mageIntelligenceUp;
    }

    public static void setMageIntelligenceUp(int mageIntelligenceUp) {
        Mage.mageIntelligenceUp = mageIntelligenceUp;
    }

    @Override
    public void levelUp() {

    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", levelAttributes=" + levelAttributes +
                ", heroAttribute2=" + heroAttribute2 +
                ", items=" + items +
                '}';
    }
}