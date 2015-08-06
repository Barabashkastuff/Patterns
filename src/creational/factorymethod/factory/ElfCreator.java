package creational.factorymethod.factory;

import creational.factorymethod.character.ACharacter;
import creational.factorymethod.character.Elf;

/**
 * ElfCreator Class
 *
 * @author a.slepakurov
 * @version 06/08/2015
 */
public class ElfCreator implements ICharacterCreator{

    @Override
    public ACharacter create(String nickname) {
        return new Elf(nickname);
    }
}
