package creational.abstractfactory.character;

/**
 * Archer Class
 *
 * @author a.slepakurov
 * @version 05/08/2015
 */
public abstract class Archer {
    private int arrows;

    protected Archer() {
        this(10);
    }

    protected Archer(int arrows) {
        this.arrows = arrows;
    }

    protected int getArrows() {
        return arrows;
    }

    protected final boolean shootArrow() {
        if (arrows <= 0) {
            return false;
        } else {
            arrows--;
            return true;
        }
    }

    public abstract String shoot();
}
