package creational.factorymethod.factory;

import creational.factorymethod.character.RaceType;
import creational.factorymethod.spell.ASpell;
import creational.factorymethod.spell.WaterSpell;

/**
 * WaterSpellCreator Class
 *
 * @author a.slepakurov
 * @version 8/6/2015
 */
public class WaterSpellCreator extends ASpellCreator {

    @Override
    protected ASpell createCharacter(String name, RaceType raceType, String nickname) {
        return new WaterSpell(name, characterMap.get(raceType).create(nickname));
    }
}
