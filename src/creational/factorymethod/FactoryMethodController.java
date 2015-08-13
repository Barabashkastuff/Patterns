package creational.factorymethod;

import creational.factorymethod.character.RaceType;
import creational.factorymethod.factory.*;
import creational.factorymethod.spell.ASpell;
import creational.factorymethod.spell.SpellType;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * FactoryMethodController Class
 *
 * @author a.slepakurov
 * @version 8/10/15
 */
public class FactoryMethodController implements Initializable {

    @FXML
    private TextArea outputArea;
    @FXML
    private TextField nameField;
    @FXML
    private TextField spellNameField;
    @FXML
    private ComboBox<String> characterTypeBox;
    @FXML
    private ComboBox<String> spellTypeBox;

    private Map<SpellType, ASpellCreator> spellMap;
    private SingleSelectionModel<String> characterSelectionModel;
    private SingleSelectionModel<String> spellSelectionModel;
    private boolean outputNeverChanged = true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initMapping();
        characterTypeBox.setItems(FXCollections.observableArrayList("Orc", "Elf", "Human"));
        spellTypeBox.setItems(FXCollections.observableArrayList("air", "fire", "water", "earth"));
        characterSelectionModel = characterTypeBox.getSelectionModel();
        spellSelectionModel = spellTypeBox.getSelectionModel();
        characterSelectionModel.select(0);
        spellSelectionModel.select(0);
    }

    public void createSpell() {
        ASpell spell = spellMap.get(SpellType.getType(spellSelectionModel.getSelectedItem()))
                .create(spellNameField.getText(), RaceType.getType(characterSelectionModel.getSelectedItem()), nameField.getText());
        if (outputNeverChanged) {
            outputArea.setText(spell.toString());
            outputNeverChanged = false;
        } else {
            outputArea.appendText(spell.toString());
        }
    }

    private void initMapping() {
        spellMap = new HashMap<>();
        spellMap.put(SpellType.AIR, new AirSpellCreator());
        spellMap.put(SpellType.FIRE, new FireSpellCreator());
        spellMap.put(SpellType.WATER, new WaterSpellCreator());
        spellMap.put(SpellType.EARTH, new EarthSpellCreator());
    }
}
