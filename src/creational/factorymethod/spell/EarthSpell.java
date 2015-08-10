package creational.factorymethod.spell;

import creational.factorymethod.character.ACharacter;

/**
 * EarthSpell Class
 *
 * @author a.slepakurov
 * @version 8/6/2015
 */
public class EarthSpell extends ASpell {

    public EarthSpell(String name, ACharacter character) {
        super(name, SpellType.EARTH, character);
    }
}
