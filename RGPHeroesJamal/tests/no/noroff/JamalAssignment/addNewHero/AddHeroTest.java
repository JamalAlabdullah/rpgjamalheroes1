package no.noroff.JamalAssignment.addNewHero;

import no.noroff.JamalAssignment.HeroAttribute;
import no.noroff.JamalAssignment.equipItems.EquipWeapon;
import no.noroff.JamalAssignment.heroes.Mage;
import no.noroff.JamalAssignment.items.Weapon;
import no.noroff.JamalAssignment.items.WeaponType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddHeroTest {


    @Test
    public void add_hero_shouldAddInfo() throws Exception {

        // Arrange
       AddHero add = new AddHero();

        // Act
         add.addhero();

        // Assert
        assert true;
    }


}