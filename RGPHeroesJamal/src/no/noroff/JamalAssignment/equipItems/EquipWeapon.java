package no.noroff.JamalAssignment.equipItems;

import no.noroff.JamalAssignment.items.Weapon;
import no.noroff.JamalAssignment.items.WeaponType;

public class EquipWeapon {


    public boolean Equip(Weapon weapon) throws Exception{
        WeaponType weapType= weapon.getWeaponType();
        boolean ckeckType =(weapType.equals(WeaponType.DAGGERS) || weapType.equals(WeaponType.SWORDS));
        if ( ckeckType){
            System.out.println("You can equip the weapon");}
        else { System.out.println("You can not equip the weapon ");
            throw new Exception("It is not allowed for you to equip this type");}

        return ckeckType;
    }







}
