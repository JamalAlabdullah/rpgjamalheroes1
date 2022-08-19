package no.noroff.JamalAssignment.heroes;
import no.noroff.JamalAssignment.HeroAttribute;
import no.noroff.JamalAssignment.items.Item;
import no.noroff.JamalAssignment.Slot;
import no.noroff.JamalAssignment.items.Armor;
import no.noroff.JamalAssignment.items.ArmorType;
import no.noroff.JamalAssignment.items.Weapon;
import no.noroff.JamalAssignment.items.WeaponType;

import java.util.ArrayList;
import java.util.HashMap;
public abstract class Hero {
    protected String name;
    protected int level;
    protected int levelAttributes;

    ArrayList<String> equipmet = new ArrayList<String>();
    ArrayList<String> weaponType = new ArrayList<String>();
    ArrayList<String> armorType = new ArrayList<String>();

    protected HeroAttribute heroAttribute2;
    protected HashMap<Slot, Item> items;

    // Arraylist to sum armorAttributes in equiped.
    ArrayList<String> armorList = new ArrayList<String>();

    public Hero(String name, int levelAttributes,HeroAttribute heroAttribute2) {
        this.name = name;
        this.level = 1;
        this.levelAttributes= levelAttributes;
        this.heroAttribute2 = heroAttribute2;
        this.items = new HashMap<Slot, Item>();
    }

    public void levelUp() {
        level+=1;
    }

    public int getLevelAttribtues() {return levelAttributes;}



    //Method to check the weapon type and required level for Mage
    // all these methods needs refactor

    public void  mageEquip(Slot slot, Weapon weapon) throws Exception{
        WeaponType weapTypeMage= weapon.getWeaponType();
        boolean ckeckType = (weapTypeMage.equals(WeaponType.WANDS) || weapTypeMage.equals(WeaponType.STAFFS));
        if ( ckeckType && weapon.getRequiredLevel() >= 1){System.out.println("You can equip the weapon");}
        else { System.out.println("You can not equip the weapon ");
            throw new Exception("It is not allowed for you to equip this type");}
        items.put(slot, weapon);
    }

    //Method to check the weapon type and required level for Ranger
    public void  rangerEquip(Slot slot, Weapon weapon) throws Exception{
        WeaponType weapTypeRanger= weapon.getWeaponType();
        boolean ckeckType = (weapTypeRanger.equals(WeaponType.BOWS));
        if ( ckeckType && weapon.getRequiredLevel() >= 1){System.out.println("You can equip the weapon");}
        else { System.out.println("You can not equip the weapon ");
            throw new Exception("It is not allowed for you to equip this type");}
        items.put(slot, weapon);
    }

    //Method to check the weapon type and required level for Rogue
    public void  roguerEquip(Slot slot, Weapon weapon) throws Exception{
        WeaponType weapTypeRogue= weapon.getWeaponType();
        boolean ckeckType =(weapTypeRogue.equals(WeaponType.DAGGERS) || weapTypeRogue.equals(WeaponType.SWORDS));
        if ( ckeckType && weapon.getRequiredLevel() >= 1){System.out.println("You can equip the weapon");}
        else { System.out.println("You can not equip the weapon ");
            throw new Exception("It is not allowed for you to equip this type");}
        items.put(slot, weapon);
    }
    //Method to check the weapon type and required level for Warrior
    public void  warriorEquip(Slot slot, Weapon weapon) throws Exception{
        WeaponType weapTypeWarrior= weapon.getWeaponType();
        boolean ckeckType =(weapTypeWarrior.equals(WeaponType.AXES) ||
                weapTypeWarrior.equals(WeaponType.SWORDS) ||weapTypeWarrior.equals(WeaponType.HAMMERS));
        if ( ckeckType && weapon.getRequiredLevel() >= 1){System.out.println("You can equip the weapon");}
        else { System.out.println("You can not equip the weapon ");
            throw new Exception("It is not allowed for you to equip this type");}
        items.put(slot, weapon);
    }

    //Method to check the Armor type and required level for Warrior
    // Will not continue with equip Armor methods for the rest of heroes, because
    // there should be better solution like to add all items in Arraylist and then make check
    public void  mageEquipArmor(Slot slot, Armor armor) throws Exception{
        ArmorType armorgg= armor.getArmorType();
        boolean checkTypeArmor = (armorgg.equals(ArmorType.CLOTH));
        if ( checkTypeArmor){
            items.put(slot, armor);
            armorList.add("CLOTH");
            System.out.println(armorList);
            System.out.println("You can equip the Armor");}
        else { System.out.println("You can not equip Armor ");
            throw new Exception("It is not allowed for you to equip this type");}

        System.out.println(items);
    }
    public void  RangerEquipArmor(Slot slot, Armor armor) throws Exception{
        ArmorType armorRang= armor.getArmorType();
        boolean ckeckTypeArmor = (armorRang.equals(ArmorType.LEATHER));
        if ( ckeckTypeArmor){
            items.put(slot, armor);
            armorList.add("LEATHER");
            //totaltotalAttributes();
            System.out.println("You can equip the Armor");}
        else { System.out.println("You can not equip Armor ");
            throw new Exception("It is not allowed for you to equip this type");}
        System.out.println(items);
    }


    // to check equipped items
    public static String equippedItems(Item item){
        // not finished
        return item.getName();
    }

    // to save weaponType in list
    public String weaponType(){
        // not finished
        return null;
    }

    // to save armorType in list
    public String armorType(){
        // not finished
        return null;
    }

    // To calculate the total attributes.
    public class Total{
        public int totalAttributes(){
            int totalAttribute;
            totalAttribute= getLevelAttribtues() + armorList.size();
            return totalAttribute;
        }


    }


    public static void display(){
       // not finished

    }


    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", level=" + level + "," +
                ", levelAttributes="+ levelAttributes+
                 heroAttribute2 + "\n"+
                ", items=" + items +
                '}';
    }
}


