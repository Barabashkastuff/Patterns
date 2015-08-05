package creational.abstractfactory.character.elf;

import creational.abstractfactory.character.Mage;

import java.util.Random;

/**
 * ElfMage Class
 *
 * @author barabashka
 * @version 05/08/2015
 */
public class ElfMage extends Mage{
    private Random random = new Random();

    @Override
    public String cast() {
        int mana = random.nextInt(10);
        return castSpell(mana) ?
                String.format("Elf mage attacks, spending %d mana - %d left.", mana, getMana()) :
                String.format("Elf mage doesn\'t have enough mana to cast a %d mana spell.", mana);
    }
}
