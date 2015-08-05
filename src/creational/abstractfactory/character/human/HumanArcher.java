package creational.abstractfactory.character.human;

import creational.abstractfactory.character.Archer;

/**
 * ElfArcher Class
 *
 * @author Andrew S. Slepakurov
 * @version 05/08/2015
 */
public class HumanArcher extends Archer {

    @Override
    public String shoot() {
        return shootArrow() ?
                String.format("Elf archer shoots, %d remains.", getArrows()) :
                String.format("Elf archer doesn\'t have enough arrows");
    }
}
