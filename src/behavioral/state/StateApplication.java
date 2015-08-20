package behavioral.state;

import common.ui.ACommonApplication;

/**
 * StateApplication Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/20/2015
 */
public class StateApplication extends ACommonApplication {
    protected StateApplication() {
        super("state.fxml", "State Application", 500, 500);
    }

    public static void main(String[] args){
      launch(args);
    }
}
