package no.noroff.JamalAssignment.heroes;


import no.noroff.JamalAssignment.HeroAttribute;

public class Ranger extends Hero {
    static int rangerStrength = 1, rangerDexterity = 7, rangerIntelligence = 1;
    static int rangerStrengthUp = 1, rangerDexterityUp = 5, rangerIntelligenceUp = 1;

    public Ranger(String name, int levelAttributes, HeroAttribute heroAttribute2) {
        super(name, levelAttributes, heroAttribute2);
    }

    public static int getRangerStrength() {
        return rangerStrength;
    }

    public static void setRangerStrength(int rangerStrength) {
        Ranger.rangerStrength = rangerStrength;
    }

    public static int getRangerDexterity() {
        return rangerDexterity;
    }

    public static void setRangerDexterity(int rangerDexterity) {
        Ranger.rangerDexterity = rangerDexterity;
    }

    public static int getRangerIntelligence() {
        return rangerIntelligence;
    }

    public static void setRangerIntelligence(int rangerIntelligence) {
        Ranger.rangerIntelligence = rangerIntelligence;
    }

    public static int getRangerStrengthUp() {
        return rangerStrengthUp;
    }

    public static void setRangerStrengthUp(int rangerStrengthUp) {
        Ranger.rangerStrengthUp = rangerStrengthUp;
    }

    public static int getRangerDexterityUp() {
        return rangerDexterityUp;
    }

    public static void setRangerDexterityUp(int rangerDexterityUp) {
        Ranger.rangerDexterityUp = rangerDexterityUp;
    }

    public static int getRangerIntelligenceUp() {
        return rangerIntelligenceUp;
    }

    public static void setRangerIntelligenceUp(int rangerIntelligenceUp) {
        Ranger.rangerIntelligenceUp = rangerIntelligenceUp;
    }

    @Override
    public void levelUp() {
        super.levelUp();


    }

    @Override
    public String toString() {
        return "Ranger{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", levelAttributes=" + levelAttributes +
                ", heroAttribute2=" + heroAttribute2 +
                '}';
    }
}
