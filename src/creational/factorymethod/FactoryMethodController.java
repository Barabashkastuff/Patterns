package creational.factorymethod;

import javafx.fxml.Initializable;
import javafx.scene.control.SingleSelectionModel;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * AbstractFactoryController Class
 *
 * @author a.slepakurov
 * @version 8/10/15
 */
public class FactoryMethodController implements Initializable {

    private SingleSelectionModel<String> selectionModel;
    private boolean outputNeverChanged = true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
