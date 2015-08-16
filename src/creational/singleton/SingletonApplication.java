package creational.singleton;

import common.ui.ACommonApplication;

/**
 * SingletonApplication Class
 *
 * @author a.slepakurov
 * @version 8/10/2015
 */
public class SingletonApplication extends ACommonApplication{
    public SingletonApplication() {
        super("singleton.fxml", "Singleton Application", 500, 415);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
