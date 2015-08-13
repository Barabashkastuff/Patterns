package structural.adapter;

import common.ui.ACommonApplication;

/**
 * AdapterApplication Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/13/2015
 */
public class AdapterApplication extends ACommonApplication{
    public AdapterApplication(String resourcePath, String title, int width, int heigth) {
        super("adapter.fxml", title, width, heigth);
    }

    public static void main(String[] args){
      launch(args);
    }
}
