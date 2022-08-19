package no.noroff.JamalAssignment.heroes;


import no.noroff.JamalAssignment.HeroAttribute;
import no.noroff.JamalAssignment.items.Weapon;
import no.noroff.JamalAssignment.items.WeaponType;

public class Warrior extends Hero {

    int warriordamage;

    static int warriorsStrength = 5, warriorDexterity = 2, warriorIntelligence = 1;
    static int warriorStrengthUp = 3, warriorDexterityUp = 2, warriorIntelligenceUp = 1;

    public Warrior(String name, int levelAttributes, HeroAttribute heroAttribute2) {
        super(name, levelAttributes, heroAttribute2);
    }

    public void setWarriordamage(int warriordamage) {
        this.warriordamage = warriordamage;
    }

    public static int getWarriorsStrength() {
        return warriorsStrength;
    }

    public static void setWarriorsStrength(int warriorsStrength) {
        Warrior.warriorsStrength = warriorsStrength;
    }

    public static int getWarriorDexterity() {
        return warriorDexterity;
    }

    public static void setWarriorDexterity(int warriorDexterity) {
        Warrior.warriorDexterity = warriorDexterity;
    }

    public static int getWarriorIntelligence() {
        return warriorIntelligence;
    }

    public static void setWarriorIntelligence(int warriorIntelligence) {
        Warrior.warriorIntelligence = warriorIntelligence;
    }

    public static int getWarriorStrengthUp() {
        return warriorStrengthUp;
    }

    public static void setWarriorStrengthUp(int warriorStrengthUp) {
        Warrior.warriorStrengthUp = warriorStrengthUp;
    }

    public static int getWarriorDexterityUp() {
        return warriorDexterityUp;
    }

    public static void setWarriorDexterityUp(int warriorDexterityUp) {
        Warrior.warriorDexterityUp = warriorDexterityUp;
    }

    public static int getWarriorIntelligenceUp() {
        return warriorIntelligenceUp;
    }

    public static void setWarriorIntelligenceUp(int warriorIntelligenceUp) {
        Warrior.warriorIntelligenceUp = warriorIntelligenceUp;
    }

    public int getWarriordamage() {
        HeroAttribute heroAttribute = new HeroAttribute(1,2,3);
        int warriorstrength= heroAttribute.getStrength();
        return warriordamage * warriorstrength ;
    }
    // calculate warrior damage
    public int warriorDamage(){
        Weapon weapon1= new Weapon("weapon",1, WeaponType.BOWS,2.3);

       int result= (int) (weapon1.getWeaponDamage() * (1 + getWarriordamage()/100));

        return result;
    }

    @Override
    public void levelUp() {
       super.levelUp();


    }



}
