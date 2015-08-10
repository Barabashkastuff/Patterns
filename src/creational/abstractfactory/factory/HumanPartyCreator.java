package creational.abstractfactory.factory;

import creational.abstractfactory.character.Archer;
import creational.abstractfactory.character.Mage;
import creational.abstractfactory.character.Warrior;
import creational.abstractfactory.character.human.HumanArcher;
import creational.abstractfactory.character.human.HumanMage;
import creational.abstractfactory.character.human.HumanWarrior;

/**
 * HumanPartyCreator Class
 *
 * @author a.slepakurov
 * @version 8/5/2015
 */
public class HumanPartyCreator implements IPartyCreator {
    private Mage mage;
    private Archer archer;
    private Warrior warrior;

    @Override
    public Mage createMage() {
        if (mage == null) {
            mage = new HumanMage();
        }
        return mage;
    }

    @Override
    public Archer createArcher() {
        if (archer == null) {
            archer = new HumanArcher();
        }
        return archer;
    }

    @Override
    public Warrior createWarrior() {
        if (warrior == null) {
            warrior = new HumanWarrior();
        }
        return warrior;
    }
}
