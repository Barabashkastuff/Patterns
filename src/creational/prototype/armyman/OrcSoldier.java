package creational.prototype.armyman;

/**
 * OrcSoldier Class
 *
 * @author a.slepakurov
 * @version 07/08/2015
 */
public class OrcSoldier extends ASoldier {
    private static int globalId = 0;

    public OrcSoldier() {
        setId(globalId);
        setWeapon("sword");
        setType(RaceType.ORC);
    }

    @Override
    public OrcSoldier clone() throws CloneNotSupportedException {
        return (OrcSoldier) super.clone();
    }

    @Override
    protected int incrementId() {
        return globalId++;
    }
}
