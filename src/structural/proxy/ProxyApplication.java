package structural.proxy;

import common.ui.ACommonApplication;

/**
 * ProxyApplication Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/17/2015
 */
public class ProxyApplication extends ACommonApplication {
    protected ProxyApplication() {
        super("proxy.fxml", "Proxy Application", 500, 500);
    }

    public static void main(String[] args){
      launch(args);
    }
}
