package structural.composite;

import common.ui.ACommonApplication;

/**
 * CompositeApplication Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/14/2015
 */
public class CompositeApplication extends ACommonApplication{

    public CompositeApplication() {
        super("composite.fxml", "Composite Application", 500, 500);
    }

    public static void main(String[] args){
      launch(args);
    }
}
