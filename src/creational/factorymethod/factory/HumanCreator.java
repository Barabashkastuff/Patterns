package creational.factorymethod.factory;

import creational.factorymethod.character.ACharacter;
import creational.factorymethod.character.Human;

/**
 * HumanCreator Class
 *
 * @author a.slepakurov
 * @version 8/6/2015
 */
public class HumanCreator implements ICharacterCreator{

    @Override
    public ACharacter create(String nickname) {
        return new Human(nickname);
    }
}
