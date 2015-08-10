package creational.abstractfactory.character.orc;

import creational.abstractfactory.character.Archer;

/**
 * OrcArcher Class
 *
 * @author a.slepakurov
 * @version 8/5/2015
 */
public class OrcArcher extends Archer {

    @Override
    public String shoot() {
        return shootArrow() ?
                String.format("Orc archer shoots, %d remains.", getArrows()) :
                String.format("Orc archer doesn\'t have enough arrows");
    }
}
