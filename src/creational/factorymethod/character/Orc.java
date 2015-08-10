package creational.factorymethod.character;

/**
 * Orc Class
 *
 * @author a.slepakurov
 * @version 8/6/2015
 */
public class Orc extends ACharacter{

    public Orc() {
        super(RaceType.ORC);
    }

    public Orc(String name) {
        super(name, RaceType.ORC);
    }
}
