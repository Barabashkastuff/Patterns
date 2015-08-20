package behavioral.chainofresponsibility;

import common.ui.ACommonApplication;

/**
 * ChainOfResponsibilityApplication Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/18/2015
 */
public class ChainOfResponsibilityApplication extends ACommonApplication {
    protected ChainOfResponsibilityApplication() {
        super("chainofresponsibility.fxml", "Chain Of Responsibility", 500, 500);
    }

    public static void main(String[] args){
      launch(args);
    }
}
