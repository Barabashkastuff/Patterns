package creational.prototype.armyman;

/**
 * HumanSoldier Class
 *
 * @author a.slepakurov
 * @version 08/08/2015
 */
public class HumanSoldier extends ASoldier {

    public HumanSoldier() {
        setId(incrementId());
        setWeapon("dagger");
        setType(RaceType.HUMAN);
    }

    @Override
    protected int incrementId() {
        return -1;
    }

    @Override
    public ASoldier clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
