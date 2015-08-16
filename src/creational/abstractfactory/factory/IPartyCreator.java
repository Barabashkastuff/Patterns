package creational.abstractfactory.factory;

import creational.abstractfactory.character.Archer;
import creational.abstractfactory.character.Mage;
import creational.abstractfactory.character.Warrior;

/**
 * PartyFabric Class
 *
 * @author a.slepakurov
 * @version 8/5/2015
 */
public interface IPartyCreator {
    Mage createMage();

    Archer createArcher();

    Warrior createWarrior();
}
