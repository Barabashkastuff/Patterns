package creational.abstractfactory.character;

/**
 * Mage Class
 *
 * @author a.slepakurov
 * @version 8/5/2015
 */
public abstract class Mage {
    private int mana;

    protected Mage() {
        this(100);
    }

    protected Mage(int mana) {
        this.mana = mana;
    }

    protected int getMana() {
        return mana;
    }

    protected final boolean castSpell(int mana) {
        if (this.mana - mana < 0) {
            return false;
        } else {
            this.mana -= mana;
            return true;
        }
    }

    public abstract String cast();
}
