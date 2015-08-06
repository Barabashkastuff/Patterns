package creational.factorymethod.factory;

import creational.factorymethod.character.RaceType;
import creational.factorymethod.spell.ASpell;

import java.util.HashMap;
import java.util.Map;

/**
 * ISpellCreator Class
 *
 * @author a.slepakurov
 * @version 06/08/2015
 */
public abstract class ASpellCreator {
    protected static Map<RaceType, ICharacterCreator> characterMap;

    public ASpell create(String name, RaceType raceType, String nickname) {
        if (characterMap == null) {
            initMapping();
        }
        return createCharacter(name, raceType, nickname);
    }

    protected abstract ASpell createCharacter(String name, RaceType raceType, String nickname);

    private void initMapping() {
        characterMap = new HashMap<>();
        characterMap.put(RaceType.HUMAN, new HumanCreator());
        characterMap.put(RaceType.ELF, new ElfCreator());
        characterMap.put(RaceType.ORC, new OrcCreator());
    }
}
