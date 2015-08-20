package behavioral.strategy;

import common.ui.ACommonApplication;

/**
 * StrategyApplication Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/20/2015
 */
public class StrategyApplication extends ACommonApplication {
    protected StrategyApplication() {
        super("strategy.fxml", "Strategy Application", 500, 500);
    }

    public static void main(String[] args){
      launch(args);
    }
}
