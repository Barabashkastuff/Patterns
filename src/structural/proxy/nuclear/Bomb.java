package structural.proxy.nuclear;

import javafx.scene.image.Image;

/**
 * Bomb Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/18/2015
 */
public class Bomb implements IBoom {

    private String name;
    private String tntEquivalent;
    private String fileName = null;

    public Bomb(String name, String tntEquivalent, String fileName) {
        this.name = name;
        this.tntEquivalent = tntEquivalent;
        this.fileName = fileName;
    }

    @Override
        public Image explode() {
            return null;
        }
}
