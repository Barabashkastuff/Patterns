package creational.abstractfactory.character.elf;

import creational.abstractfactory.character.Archer;

/**
 * ElfArcher Class
 *
 * @author a.slepakurov
 * @version 05/08/2015
 */
public class ElfArcher extends Archer {

    @Override
    public String shoot() {
        return shootArrow() ?
                String.format("Elf archer shoots, %d remains.", getArrows()) :
                String.format("Elf archer doesn\'t have enough arrows");
    }
}
