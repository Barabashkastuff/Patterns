package structural.facade.imperialforce;

/**
 * Core Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/14/2015
 */
public class Core {
    private int power;

    public Core() {
        this.power = 0;
    }

    public void powerUp(int power) {
        this.power += power;
    }
}
