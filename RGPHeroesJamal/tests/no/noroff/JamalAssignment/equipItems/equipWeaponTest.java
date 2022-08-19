package no.noroff.JamalAssignment.equipItems;

import static org.junit.jupiter.api.Assertions.*;

import no.noroff.JamalAssignment.items.Weapon;
import no.noroff.JamalAssignment.items.WeaponType;
import org.junit.jupiter.api.Test;

class EquipWeaponTest {

    @Test
    public void input_weapType_shouldReturnBoolean() throws Exception {
        // Arrange
        EquipWeapon equipWeapon= new EquipWeapon();
        boolean checkType =true;
        // Act
        boolean actual= equipWeapon.Equip(new Weapon("",0,WeaponType.SWORDS,0));
        // Assert
        assertEquals(checkType,actual);
    }




}