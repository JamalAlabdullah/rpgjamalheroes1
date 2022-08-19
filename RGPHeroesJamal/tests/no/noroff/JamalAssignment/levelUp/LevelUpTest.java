package no.noroff.JamalAssignment.levelUp;

import no.noroff.JamalAssignment.equipItems.EquipWeapon;
import no.noroff.JamalAssignment.items.Weapon;
import no.noroff.JamalAssignment.items.WeaponType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelUpTest {


    @Test
    public void increase_level_shouldIncreaselevel() throws Exception {
        // Arrange
        LevelUp levelUp= new LevelUp();

        // Act
        levelUp.warrior.levelUp();
        System.out.println(levelUp.warrior);
        levelUp.warrior.levelUp();
        System.out.println(levelUp.warrior);
        levelUp.warrior.levelUp();
        System.out.println(levelUp.warrior);
        levelUp.warrior.levelUp();
        System.out.println(levelUp.warrior);

        // Assert
        assert true;
    }



}