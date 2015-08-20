package behavioral.visitor;

import common.ui.ACommonApplication;

/**
 * VisitorApplication Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/20/2015
 */
public class VisitorApplication extends ACommonApplication {
    protected VisitorApplication() {
        super("visitor.fxml", "Visitor Application", 500, 500);
    }

    public static void main(String[] args){
      launch(args);
    }
}
