package creational.factorymethod.character;

/**
 * Human Class
 *
 * @author a.slepakurov
 * @version 06/08/2015
 */
public class Human extends ACharacter{

    public Human() {
        super(RaceType.HUMAN);
    }

    public Human(String name) {
        super(name, RaceType.HUMAN);
    }
}
