package creational.abstractfactory.fabric;

import creational.abstractfactory.character.Archer;
import creational.abstractfactory.character.Mage;
import creational.abstractfactory.character.Warrior;

/**
 * PartyFabric Class
 *
 * @author a.slepakurov
 * @version 05/08/2015
 */
public interface IPartyCreator {
    Mage createMage();
    Archer createArcher();
    Warrior createWarrior();
}
