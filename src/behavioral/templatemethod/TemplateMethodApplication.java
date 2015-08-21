package behavioral.templatemethod;

import common.ui.ACommonApplication;

/**
 * TemplateMethodApplication Class
 *
 * @author Andrew S. Slepakurov
 * @version 8/20/2015
 */
public class TemplateMethodApplication extends ACommonApplication {
    protected TemplateMethodApplication() {
        super("templatemethod.fxml", "Template Method Application", 500, 500);
    }

    public static void main(String[] args){
      launch(args);
    }
}
