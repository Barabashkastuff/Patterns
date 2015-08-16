package structural.adapter.adaptee;

import structural.adapter.character.Character;

/**
 * HealthDecreaser Class
 *
 * @author a.slepakurov
 * @version 8/11/2015
 */
public class HealthDecreaser {
    public void decreaseHealth(Character character, int decreaserBy) {
        character.setHealth((character.getHealth() < decreaserBy) ? 0 : character.getHealth() - decreaserBy);
    }
}
