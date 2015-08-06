package creational.factorymethod.spell;

import creational.factorymethod.character.ACharacter;

/**
 * WaterSpell Class
 *
 * @author a.slepakurov
 * @version 06/08/2015
 */
public class WaterSpell extends ASpell {

    public WaterSpell(String name, ACharacter character) {
        super(name, SpellType.WATER, character);
    }
}
