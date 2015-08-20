package behavioral.memento;

import common.ui.ACommonApplication;

/**
 * MementoApplication Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/20/2015
 */
public class MementoApplication extends ACommonApplication {
    protected MementoApplication() {
        super("memento.fxml", "Memento Application", 500, 500);
    }

    public static void main(String[] args){
      launch(args);
    };
}
