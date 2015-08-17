package structural.flyweight;

import common.ui.ACommonApplication;

/**
 * FlyweightApplication Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/17/2015
 */
public class FlyweightApplication extends ACommonApplication {
    protected FlyweightApplication() {
        super("flyweight.fxml", "Flyweight application", 500, 500);
    }

    public static void main(String[] args){
      launch(args);
    }
}
