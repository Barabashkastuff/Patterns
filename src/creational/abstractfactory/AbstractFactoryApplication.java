package creational.abstractfactory;

/**
 * AbstractFactoryApplication Class
 *
 * @author a.slepakurov
 * @version 8/9/15
 */

import common.ui.ACommonApplication;

public class AbstractFactoryApplication extends ACommonApplication {

    public AbstractFactoryApplication() {
        super("abstractfactory.fxml", "Absract Factory Application", 750, 400);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
