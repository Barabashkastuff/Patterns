package structural.adapter;

import structural.adapter.adaptee.HealthDecreaser;
import structural.adapter.adaptee.HealthIncreaser;

/**
 * CharacterUpdaterAdapter Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/11/2015
 */
public class CharacterUpdaterAdapter
        //class adapter
        extends HealthIncreaser implements IUpdateCharacterHealth{
//  object adapter
    private HealthDecreaser healthDecreaser;

    public CharacterUpdaterAdapter() {
       healthDecreaser = new HealthDecreaser();
    }

    @Override
    public int updateHealth(int current, int updateBy) {
        return (updateBy < 0) ? healthDecreaser.decreaseHealth(current, updateBy) : super.increaseHealth(current, updateBy);
    }
}
