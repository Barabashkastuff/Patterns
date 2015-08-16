package structural.adapter;

import common.ui.ACommonApplication;

/**
 * AdapterApplication Class
 *
 * @author a.slepakurov
 * @version 8/13/2015
 */
public class AdapterApplication extends ACommonApplication{
    public AdapterApplication() {
        super("adapter.fxml", "Adapter Application", 500, 380);
    }

    public static void main(String[] args){
      launch(args);
    }
}
