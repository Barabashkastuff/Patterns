package creational.factorymethod.factory;

import creational.factorymethod.character.RaceType;
import creational.factorymethod.spell.ASpell;
import creational.factorymethod.spell.AirSpell;

/**
 * AirSpellCreator Class
 *
 * @author a.slepakurov
 * @version 06/08/2015
 */
public class AirSpellCreator extends ASpellCreator {

    @Override
    protected ASpell createCharacter(String name, RaceType raceType, String nickname) {
        return new AirSpell(name, characterMap.get(raceType).create(nickname));
    }
}
