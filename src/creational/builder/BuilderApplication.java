package creational.builder;

/**
 * AbstractFactoryApplication Class
 *
 * @author a.slepakurov
 * @version 8/9/15
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BuilderApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("resources/builder.fxml"));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Builder Application");
        primaryStage.setScene(new Scene(root, 625, 360));
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
