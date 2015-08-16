package structural.adapter.adaptee;

import structural.adapter.character.Character;

/**
 * HealthIncreaser Class
 *
 * @author a.slepakurov
 * @version 8/11/2015
 */
public class HealthIncreaser {
    public void increaseHealth(Character character, int increaseBy) {
        if (character.getHealth() != 0) {
            character.setHealth((character.getHealth() + increaseBy > 100) ? 100 : character.getHealth() + increaseBy);
        }
    }
}
