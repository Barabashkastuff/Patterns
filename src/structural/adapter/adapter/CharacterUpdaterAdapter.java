package structural.adapter.adapter;

import structural.adapter.adaptee.HealthDecreaser;
import structural.adapter.adaptee.HealthIncreaser;
import structural.adapter.character.Character;

/**
 * CharacterUpdaterAdapter Class
 *
 * @author a.slepakurov
 * @version 8/11/2015
 */
public class CharacterUpdaterAdapter
        //class adapter
        extends HealthIncreaser implements IUpdateCharacterHealth {
    //  object adapter
    private HealthDecreaser healthDecreaser;

    public CharacterUpdaterAdapter() {
        healthDecreaser = new HealthDecreaser();
    }

    @Override
    public void updateHealth(Character character, int updateBy) {
        if (updateBy < 0) {
            healthDecreaser.decreaseHealth(character, Math.abs(updateBy));
        } else {
            super.increaseHealth(character, updateBy);
        }
    }
}
