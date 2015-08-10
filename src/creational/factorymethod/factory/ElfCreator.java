package creational.factorymethod.factory;

import creational.factorymethod.character.ACharacter;
import creational.factorymethod.character.Elf;

/**
 * ElfCreator Class
 *
 * @author a.slepakurov
 * @version 8/6/2015
 */
public class ElfCreator implements ICharacterCreator{

    @Override
    public ACharacter create(String nickname) {
        return new Elf(nickname);
    }
}
