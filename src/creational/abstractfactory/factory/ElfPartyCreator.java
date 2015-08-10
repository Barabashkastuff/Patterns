package creational.abstractfactory.factory;

import creational.abstractfactory.character.Archer;
import creational.abstractfactory.character.Mage;
import creational.abstractfactory.character.Warrior;
import creational.abstractfactory.character.elf.ElfArcher;
import creational.abstractfactory.character.elf.ElfMage;
import creational.abstractfactory.character.elf.ElfWarrior;

/**
 * ElfPartyCreator Class
 *
 * @author barabashka
 * @version 8/5/2015
 */
public class ElfPartyCreator implements IPartyCreator {
    private Mage mage;
    private Archer archer;
    private Warrior warrior;

    @Override
    public Mage createMage() {
        if (mage == null) {
            mage = new ElfMage();
        }
        return mage;
    }

    @Override
    public Archer createArcher() {
        if (archer == null) {
            archer = new ElfArcher();
        }
        return archer;
    }

    @Override
    public Warrior createWarrior() {
        if (warrior == null) {
            warrior = new ElfWarrior();
        }
        return warrior;
    }
}
