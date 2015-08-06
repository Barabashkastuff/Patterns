package creational.factorymethod.character;

/**
 * Orc Class
 *
 * @author a.slepakurov
 * @version 06/08/2015
 */
public class Orc extends ACharacter{

    public Orc() {
        super(RaceType.ORC);
    }

    public Orc(String name) {
        super(name, RaceType.ORC);
    }
}
