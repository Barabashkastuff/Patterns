package structural.adapter;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import structural.adapter.adapter.CharacterUpdaterAdapter;
import structural.adapter.adapter.IUpdateCharacterHealth;
import structural.adapter.character.Character;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * AdapterController Class
 *
 * @author a.slepakurov
 * @version 8/13/2015
 */
public class AdapterController implements Initializable {
    @FXML
    private TextArea outputArea;
    @FXML
    private TextField healthField;

    private IUpdateCharacterHealth healthUpdater;
    private Character character;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        healthUpdater = new CharacterUpdaterAdapter();
        character = new Character();
        outputArea.setText(character.toString());
    }

    public void increaseHealth() {
        if (validate()) {
            healthUpdater.updateHealth(character, Integer.parseInt(healthField.getText()));
            outputArea.appendText(character.toString());
        } else {
            outputArea.appendText("Input must be a positive integer.\n");
        }
    }

    public void decreaseHealth() {
        if (validate()) {
            healthUpdater.updateHealth(character, Integer.parseInt("-" + healthField.getText()));
            outputArea.appendText(character.toString());
        } else {
            outputArea.appendText("Input must be a positive integer.\n");
        }
    }

    private boolean validate() {
        return healthField.getText().matches("[0-9]+");
    }
}
