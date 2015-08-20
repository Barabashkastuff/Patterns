package behavioral.iterator;

import common.ui.ACommonApplication;

/**
 * IteratorApplication Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/20/2015
 */
public class IteratorApplication extends ACommonApplication {
    protected IteratorApplication() {
        super("iterator.fxml", "Iteratorn Application", 500, 500);
    }

    public static void main(String[] args){
      launch(args);
    }
}
