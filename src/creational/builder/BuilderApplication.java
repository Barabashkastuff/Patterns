package creational.builder;

/**
 * BuilderApplication Class
 *
 * @author a.slepakurov
 * @version 8/9/15
 */

import common.ui.ACommonApplication;

public class BuilderApplication extends ACommonApplication {

    public BuilderApplication() {
        super("resources/builder.fxml", "Builder Application", 625, 360);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
