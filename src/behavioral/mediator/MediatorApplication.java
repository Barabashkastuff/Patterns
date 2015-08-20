package behavioral.mediator;

import common.ui.ACommonApplication;

/**
 * MediatorApplication Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/20/2015
 */
public class MediatorApplication extends ACommonApplication {
    protected MediatorApplication() {
        super("mediator.fxml", "Medialor Application", 500, 500);
    }

    public static void main(String[] args){
      launch(args);
    }
}
