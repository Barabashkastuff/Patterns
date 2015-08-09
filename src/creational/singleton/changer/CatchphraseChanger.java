package creational.singleton.changer;

import creational.singleton.dude.AwesomeDude;

/**
 * CatchphraseChanger Class
 *
 * @author a.slepakurov
 * @version 8/9/15
 */
public class CatchphraseChanger extends Thread {
    private String catchphrase;

    public CatchphraseChanger(String catchphrase) {
        this.catchphrase = catchphrase;
    }

    @Override
    public void run() {
        AwesomeDude.getInstance().setCatchphrase(catchphrase);
    }
}
