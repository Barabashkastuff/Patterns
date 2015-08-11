package creational.builder;

import creational.builder.character.Hero;
import creational.builder.character.RaceType;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * BuilderController Class
 *
 * @author a.slepakurov
 * @version 8/9/15
 */
public class BuilderController implements Initializable {

    @FXML
    private ComboBox<String> raceBox;
    @FXML
    private TextArea outputArea;
    @FXML
    private TextField nameField;
    @FXML
    private Slider levelSlider;
    @FXML
    private Label levelLabel;
    @FXML
    private TextField subclassField;
    private SingleSelectionModel<String> selectionModel;
    private boolean outputNeverChanged = true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        selectionModel = raceBox.getSelectionModel();
        raceBox.setItems(FXCollections.observableArrayList(RaceType.names()));
        selectionModel.select(0);
    }


    public void generate() {
        Hero hero = new Hero.Builder()
                .putName(nameField.getText())
                .levelUp(String.valueOf((int) levelSlider.getValue()))
                .putSubclass(subclassField.getText())
                .putType(RaceType.getType(selectionModel.getSelectedItem()))
                .build();
        if (outputNeverChanged) {
            outputArea.setText(hero.toString());
            outputNeverChanged = false;
        } else {
            outputArea.appendText(hero.toString());
        }
    }

    public void updateLevelLabel() {
        levelLabel.setText(String.valueOf((int) levelSlider.getValue()));
    }
}
