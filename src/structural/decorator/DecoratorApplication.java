package structural.decorator;

import common.ui.ACommonApplication;

/**
 * DecoratorApplication Class
 *
 * @author a.slepakurov
 * @version 8/14/2015
 */
public class DecoratorApplication extends ACommonApplication{

    public DecoratorApplication() {
        super("decorator.fxml", "Decorator Application", 500, 500);
    }

    public static void main(String[] args){
      launch(args);
    }
}
