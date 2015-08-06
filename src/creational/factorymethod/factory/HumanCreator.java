package creational.factorymethod.factory;

import creational.factorymethod.character.ACharacter;
import creational.factorymethod.character.Human;

/**
 * HumanCreator Class
 *
 * @author a.slepakurov
 * @version 06/08/2015
 */
public class HumanCreator implements ICharacterCreator{

    @Override
    public ACharacter create(String nickname) {
        return new Human(nickname);
    }
}
