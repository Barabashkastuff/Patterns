package structural.proxy.nuclear;

import javafx.scene.image.Image;

/**
 * BombProxy Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/18/2015
 */
public class BombProxy implements IBoom {

    private String name;
    private String tntEquivalent;
    private String fileName;
    private Bomb realBomb;

    public BombProxy(String name, String tntEquivalent, String fileName) {
        this.name = name;
        this.tntEquivalent = tntEquivalent;
        this.fileName = fileName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTntEquivalent(String tntEquivalent) {
        this.tntEquivalent = tntEquivalent;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Image explode() {
        if (realBomb == null) {
            realBomb = new Bomb(name, tntEquivalent, fileName);
        }
        return realBomb.explode();
    }
}
