package no.noroff.JamalAssignment.addNewHero;

import no.noroff.JamalAssignment.HeroAttribute;
import no.noroff.JamalAssignment.heroes.Mage;

public class AddHero {


public void addhero(){

    Mage mage= new Mage("Mage",1,new HeroAttribute(1,1,8));
    System.out.println(mage);
}

}
