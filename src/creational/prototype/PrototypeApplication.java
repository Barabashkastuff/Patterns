package creational.prototype;

import common.ui.ACommonApplication;

/**
 * PrototypeApplication Class
 *
 * @author a.slepakurov
 * @version 8/12/2015
 */
public class PrototypeApplication extends ACommonApplication{
    public PrototypeApplication() {
        super("prototype.fxml", "Prototype Application", 500, 415);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
