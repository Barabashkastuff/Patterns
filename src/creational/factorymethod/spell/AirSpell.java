package creational.factorymethod.spell;

import creational.factorymethod.character.ACharacter;

/**
 * AirSpell Class
 *
 * @author a.slepakurov
 * @version 8/6/2015
 */
public class AirSpell extends ASpell {

    public AirSpell(String name, ACharacter character) {
        super(name, SpellType.AIR, character);
    }
}
