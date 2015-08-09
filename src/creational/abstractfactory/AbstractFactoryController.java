package creational.abstractfactory;

import creational.abstractfactory.character.Party;
import creational.abstractfactory.factory.ElfPartyCreator;
import creational.abstractfactory.factory.HumanPartyCreator;
import creational.abstractfactory.factory.IPartyCreator;
import creational.abstractfactory.factory.OrcPartyCreator;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * AbstractFactoryController Class
 *
 * @author a.slepakurov
 * @version 8/9/15
 */
public class AbstractFactoryController implements Initializable {
    @FXML
    private TextArea outputArea;
    @FXML
    private ComboBox<String> raceBox;

    private Map<String, IPartyCreator> partyMap;
    private SingleSelectionModel<String> selectionModel;
    private boolean outputNeverChanged = true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initMapping();
        selectionModel = raceBox.getSelectionModel();
        raceBox.setItems(FXCollections.observableArrayList("human", "elf", "orc"));
        selectionModel.select(0);
    }

    public void attack() {
        IPartyCreator creator = partyMap.get(selectionModel.getSelectedItem());
        String attackLog = getParty(creator).partyAttack();
        if (outputNeverChanged) {
            outputArea.setText(attackLog);
            outputNeverChanged = false;
        } else {
            outputArea.appendText(attackLog);
        }
    }

    private Party getParty(IPartyCreator creator) {
        return new Party(creator.createMage(), creator.createArcher(), creator.createWarrior());
    }

    private void initMapping() {
        partyMap = new HashMap<>();
        partyMap.put("human", new HumanPartyCreator());
        partyMap.put("elf", new ElfPartyCreator());
        partyMap.put("orc", new OrcPartyCreator());
    }
}
