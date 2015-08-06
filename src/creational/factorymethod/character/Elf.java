package creational.factorymethod.character;

/**
 * Elf Class
 *
 * @author a.slepakurov
 * @version 06/08/2015
 */
public class Elf extends ACharacter{

    public Elf() {
        super(RaceType.ELF);
    }

    public Elf(String name) {
        super(name, RaceType.ELF);
    }
}
