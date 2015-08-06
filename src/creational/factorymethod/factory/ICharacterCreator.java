package creational.factorymethod.factory;

import creational.factorymethod.character.ACharacter;

/**
 * ICharacterCreator Interface
 *
 * @author a.slepakurov
 * @version 06/08/2015
 */
public interface ICharacterCreator {
    ACharacter create(String nickname);
}
