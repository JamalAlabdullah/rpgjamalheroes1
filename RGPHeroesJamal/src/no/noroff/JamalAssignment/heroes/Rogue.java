package no.noroff.JamalAssignment.heroes;


import no.noroff.JamalAssignment.HeroAttribute;

public class Rogue extends Hero {

    static int rogueStrength = 2, rogueDexterity = 6, intelligenceInit = 1;
    static int rogueStrengthUp = 1, rogueDexterityUp = 4, rogueIntelligenceUp = 1;

    public Rogue(String name, int levelAttributes, HeroAttribute heroAttribute2) {
        super(name, levelAttributes, heroAttribute2);
    }

    public static int getRogueStrength() {
        return rogueStrength;
    }

    public static void setRogueStrength(int rogueStrength) {
        Rogue.rogueStrength = rogueStrength;
    }

    public static int getRogueDexterity() {
        return rogueDexterity;
    }

    public static void setRogueDexterity(int rogueDexterity) {
        Rogue.rogueDexterity = rogueDexterity;
    }

    public static int getIntelligenceInit() {
        return intelligenceInit;
    }

    public static void setIntelligenceInit(int intelligenceInit) {
        Rogue.intelligenceInit = intelligenceInit;
    }

    public static int getRogueStrengthUp() {
        return rogueStrengthUp;
    }

    public static void setRogueStrengthUp(int rogueStrengthUp) {
        Rogue.rogueStrengthUp = rogueStrengthUp;
    }

    public static int getRogueDexterityUp() {
        return rogueDexterityUp;
    }

    public static void setRogueDexterityUp(int rogueDexterityUp) {
        Rogue.rogueDexterityUp = rogueDexterityUp;
    }

    public static int getRogueIntelligenceUp() {
        return rogueIntelligenceUp;
    }

    public static void setRogueIntelligenceUp(int rogueIntelligenceUp) {
        Rogue.rogueIntelligenceUp = rogueIntelligenceUp;
    }


    @Override
    public void levelUp() {
        super.levelUp();


    }

    @Override
    public String toString() {
        return "Rogue{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", levelAttributes=" + levelAttributes +
                ", heroAttribute2=" + heroAttribute2 +
                '}';
    }
}
