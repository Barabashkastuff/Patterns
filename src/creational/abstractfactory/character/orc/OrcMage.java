package creational.abstractfactory.character.orc;

import creational.abstractfactory.character.Mage;

import java.util.Random;

/**
 * OrcMage Class
 *
 * @author a.slepakurov
 * @version 8/5/2015
 */
public class OrcMage extends Mage {
    private Random random = new Random();

    @Override
    public String cast() {
        int mana = random.nextInt(10);
        return castSpell(mana) ?
                String.format("Orc mage attacks, spending %d mana - %d left.", mana, getMana()) :
                String.format("Orc mage doesn\'t have enough mana to cast a %d mana spell.", mana);
    }
}
