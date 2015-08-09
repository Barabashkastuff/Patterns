package creational.singleton.changer;

import creational.singleton.dude.AwesomeDude;

/**
 * NameChanger Class
 *
 * @author a.slepakurov
 * @version 8/9/15
 */
public class NameChanger extends Thread {

    private String name;

    public NameChanger(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        AwesomeDude.getInstance().setName(name);
    }
}
