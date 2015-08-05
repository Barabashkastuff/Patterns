package creational.abstractfactory.character.human;

import creational.abstractfactory.character.Mage;

import java.util.Random;

/**
 * HumanMage Class
 *
 * @author a.slepakurov
 * @version 05/08/2015
 */
public class HumanMage extends Mage{
    private Random random = new Random();

    @Override
    public String cast() {
        int mana = random.nextInt(10);
        return castSpell(mana) ?
                String.format("Human mage attacks, spending %d mana - %d left.", mana, getMana()) :
                String.format("Human mage doesn\'t have enough mana to cast a %d mana spell.", mana);
    }
}
