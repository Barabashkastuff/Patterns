package creational.abstractfactory.character;

/**
 * Warrior Class
 *
 * @author a.slepakurov
 * @version 8/5/2015
 */
public abstract class Warrior {
    private double stamina;

    protected Warrior() {
        this(9.9);
    }

    protected Warrior(double stamina) {
        this.stamina = stamina;
    }

    protected double getStamina() {
        return stamina;
    }

    protected final boolean swingSword(double stamina) {
        if (this.stamina - stamina < 0) {
            return false;
        } else {
            this.stamina -= stamina;
            return true;
        }
    }

    public abstract String attack();
}
