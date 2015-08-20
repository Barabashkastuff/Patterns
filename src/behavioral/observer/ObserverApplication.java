package behavioral.observer;

import common.ui.ACommonApplication;

/**
 * ObserverApplication Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/20/2015
 */
public class ObserverApplication extends ACommonApplication {
    protected ObserverApplication() {
        super("observer.fxml", "Observer Application", 500, 500);
    }

    public static void main(String[] args){
      launch(args);
    }
}
