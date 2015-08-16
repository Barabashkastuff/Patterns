package common.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * ACommonApplication Class
 *
 * @author a.slepakurov
 * @version 8/10/2015
 */
public class ACommonApplication extends Application {

    private String resourcePath;
    private String title;
    private int width;
    private int heigth;

    protected ACommonApplication(String resourcePath, String title, int width, int heigth) {
        this.resourcePath = "resources/" + resourcePath;
        this.title = title;
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(resourcePath));
        primaryStage.setResizable(false);
        primaryStage.setTitle(title);
        primaryStage.setScene(new Scene(root, width, heigth));
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
