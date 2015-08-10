package creational.prototype.armyman;

/**
 * ASoldier Class
 *
 * @author a.slepakurov
 * @version 8/7/2015
 */
public abstract class ASoldier implements Cloneable {
    private int id;
    protected String weapon;
    protected RaceType type;

    private int getId() {
        return id;
    }

    private String getWeapon() {
        return weapon;
    }

    private RaceType getType() {
        return type;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    protected void setType(RaceType type) {
        this.type = type;
    }

    protected abstract int incrementId();

    @Override
    public String toString() {
        return String.format("%s soldier #%d attacked with a %s.", type.getName(), getId(), getWeapon());
    }

    @Override
    public ASoldier clone() throws CloneNotSupportedException {
        ASoldier soldier = (ASoldier) super.clone();
        soldier.setId(incrementId());
        return soldier;
    }
}
