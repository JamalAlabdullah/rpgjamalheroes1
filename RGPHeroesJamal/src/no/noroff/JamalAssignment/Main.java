package no.noroff.JamalAssignment;


import no.noroff.JamalAssignment.heroes.*;
import no.noroff.JamalAssignment.items.Armor;
import no.noroff.JamalAssignment.items.ArmorType;
import no.noroff.JamalAssignment.items.Weapon;
import no.noroff.JamalAssignment.items.WeaponType;

public class Main {
    public static void main(String[] args) throws Exception {


        Warrior warrior = new Warrior("war4",1,new HeroAttribute(1,2,3));
        System.out.println(warrior);
        warrior.levelUp();
        System.out.println(warrior);
        warrior.levelUp();
        System.out.println(warrior);
        warrior.levelUp();
        System.out.println(warrior);


       Mage mage= new Mage("Mage",1,new HeroAttribute(1,1,8));
       System.out.println(mage);

        // Mage tries to equip a new weapon
        Mage magee = new Mage("Mage1",3,new HeroAttribute(3,4,5));
         mage.mageEquip(Slot.LEGS, new Weapon("weapon 1",1, WeaponType.STAFFS,4.7));
         System.out.println(magee);
        //---------------------------------------------------------------------
        // Ranger tries to equip a new weapon
        Ranger ranger = new Ranger("Ranger1",4,new HeroAttribute(1,2,3));
        ranger.rangerEquip(Slot.BODY,new Weapon("weapon 2",1,WeaponType.BOWS,3.5));
        System.out.println(ranger);
        //---------------------------------------------------------------------
        // Rogue tries to equip a new weapon
        Rogue rogue = new Rogue("Rogue 1",3,new HeroAttribute(1,2,3));
        rogue.roguerEquip(Slot.WEAPON,new Weapon("weapon 3",1,WeaponType.SWORDS,3.5));
        System.out.println(rogue);
        //---------------------------------------------------------------------
        // Warrior tries to equip a new weapon
        Warrior warrior6 = new Warrior("Warriro 1",2,new HeroAttribute(3,4,5));
        warrior6.warriorEquip(Slot.WEAPON,new Weapon("weapon 3",1,WeaponType.AXES,3.5));
        System.out.println(warrior6);

        // Warrior tries to equip armor 1
        Mage mage2 = new Mage("Mage 2",4,new HeroAttribute(3,4,5));
        mage2.mageEquipArmor(Slot.BODY,new Armor("armor1",3,null, ArmorType.CLOTH,10));
        System.out.println(mage2);
        // Warrior tries to equip armor 2
        Ranger ranger3= new Ranger("Ranger3",5,new HeroAttribute(1,2,3));
        ranger3.RangerEquipArmor(Slot.BODY,new Armor("armor1",3,null,ArmorType.LEATHER,15));
        System.out.println(ranger3);

        // warrior damage
        Warrior warrior3 = new Warrior("w1",1, new HeroAttribute(1,2,3));
       int result= warrior3.warriorDamage();
        System.out.println(result);

        /*
        Weapon weapon1 = new Weapon("Swords1", 1, WeaponType.SWORDS, 5, 3);
        warrior.setEquipment(Slot.WEAPON, weapon1);
        System.out.println(weapon1);


        Weapon hammers1 = new Weapon("Hammers1", 1, WeaponType.HAMMERS, 7, 1.8);
        warrior.setEquipment(Slot.WEAPON, hammers1);
        System.out.println(hammers1);


        Armor plate1 = new Armor("plate1", 1, Slot.BODY, ArmorType.PLATE, new HeroAttribute(1, 1, 4));
        warrior.setEquipment(Slot.HEAD, plate1);
        System.out.println(warrior);

         */











    }
}