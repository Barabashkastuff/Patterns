package creational.prototype;

import creational.prototype.armyman.ASoldier;
import creational.prototype.armyman.ElfSoldier;
import creational.prototype.armyman.HumanSoldier;
import creational.prototype.armyman.OrcSoldier;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * PrototypeController Class
 *
 * @author a.slepakurov
 * @version 8/12/15
 */
public class PrototypeController implements Initializable {

    @FXML
    private TextArea outputArea;

    private List<ASoldier> soldiers;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initList();
    }

    public void cloneElf() {
        try {
            soldiers.add(soldiers.get(0).clone());
        } catch (CloneNotSupportedException e) {
            outputArea.setText("No cloning for you");
        }
    }

    public void cloneOrc() {
        try {
            soldiers.add(soldiers.get(1).clone());
        } catch (CloneNotSupportedException e) {
            outputArea.setText("No cloning for you");
        }
    }

    public void cloneHuman() {
        try {
            soldiers.add(soldiers.get(2).clone());
        } catch (CloneNotSupportedException e) {
            outputArea.setText("No cloning for you");
        }
    }

    public void attack() {
        StringBuilder message = new StringBuilder("");
        soldiers.forEach((soldier) -> {
            message.append(soldier.toString()).append("\n");
        });
        outputArea.setText(message.toString());
    }

    private void initList() {
        soldiers = new ArrayList<>();
        soldiers.add(new ElfSoldier());
        soldiers.add(new OrcSoldier());
        soldiers.add(new HumanSoldier());
    }
}
