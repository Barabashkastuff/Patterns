package creational.singleton;

import common.ui.ACommonApplication;

/**
 * SingletonApplication Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/10/2015
 */
public class SingletonApplication extends ACommonApplication{
    public SingletonApplication() {
        super("resources/singleton.fxml", "Singleton Application", 500, 415);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
