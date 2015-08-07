package creational.prototype.armyman;

/**
 * ElfSoldier Class
 *
 * @author Andrew S. Slepakurov
 * @version 07/08/2015
 */
public class ElfSoldier extends ASoldier{
    private static int globalId = 0;

    public ElfSoldier() {
        setId(incrementId());
        setWeapon("bow");
        setType(RaceType.ELF);
    }

    @Override
    public ElfSoldier clone() throws CloneNotSupportedException {
        return (ElfSoldier) super.clone();
    }

    private int incrementId() {
        return globalId++;
    }
}
