package structural.bridge;

import common.ui.ACommonApplication;

/**
 * BridgeApplication Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/14/2015
 */
public class BridgeApplication extends ACommonApplication{
    public BridgeApplication() {
        super("bridge.fxml", "Bridge Application", 560, 400);
    }

    public static void main(String[] args){
      launch(args);
    }
}
