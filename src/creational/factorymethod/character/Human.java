package creational.factorymethod.character;

/**
 * Human Class
 *
 * @author a.slepakurov
 * @version 8/6/2015
 */
public class Human extends ACharacter {

    public Human() {
        super(RaceType.HUMAN);
    }

    public Human(String name) {
        super(name, RaceType.HUMAN);
    }
}
