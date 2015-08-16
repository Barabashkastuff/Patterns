package structural.facade;

import common.ui.ACommonApplication;

/**
 * FacadeApplication Class
 *
 * @author a.slepakurov
 * @version 8/14/2015
 */
public class FacadeApplication extends ACommonApplication {
    public FacadeApplication() {
        super("facade.fxml", "Facade Application", 500, 500);
    }

    public static void main(String[] args){
      launch(args);
    }
}
