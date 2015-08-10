package creational.factorymethod.factory;

import creational.factorymethod.character.ACharacter;

/**
 * ICharacterCreator Interface
 *
 * @author a.slepakurov
 * @version 8/6/2015
 */
public interface ICharacterCreator {
    ACharacter create(String nickname);
}
