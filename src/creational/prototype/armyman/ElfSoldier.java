package creational.prototype.armyman;

/**
 * ElfSoldier Class
 *
 * @author a.slepakurov
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

    @Override
    protected int incrementId() {
        return globalId++;
    }
}
