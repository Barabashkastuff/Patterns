package structural.bridge.soldiers;

import structural.bridge.attacks.IAttack;

/**
 * ASoldier Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/14/2015
 */
public abstract class ASoldier {
    protected IAttack attack;
    protected int health;

    protected ASoldier(IAttack attack) {
        this.attack = attack;
        this.health = 0;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract String attack();
}
