package creational.prototype.armyman;

/**
 * OrcSoldier Class
 *
 * @author Andrew S. Slepakurov
 * @version 07/08/2015
 */
public class OrcSoldier extends ASoldier {
    private static int globalId = 0;

    public OrcSoldier() {
        setId(incrementId());
        setWeapon("sword");
        setType(RaceType.ORC);
    }

    @Override
    public OrcSoldier clone() throws CloneNotSupportedException {
        return (OrcSoldier) super.clone();
    }

    private int incrementId() {
        return globalId++;
    }
}
