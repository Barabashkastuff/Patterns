package creational.factorymethod.spell;

import creational.factorymethod.character.ACharacter;

/**
 * FireSpell Class
 *
 * @author a.slepakurov
 * @version 8/6/2015
 */
public class FireSpell extends ASpell {

    public FireSpell(String name, ACharacter character) {
        super(name, SpellType.FIRE, character);
    }
}
