package creational.singleton;

import creational.singleton.changer.CatchphraseChanger;
import creational.singleton.changer.NameChanger;
import creational.singleton.dude.AwesomeDude;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * SingletonController Class
 *
 * @author a.slepakurov
 * @version 8/10/15
 */
public class SingletonController implements Initializable {

    @FXML
    private TextArea outputArea;
    @FXML
    private TextField nameField;
    @FXML
    private TextField phraseField;

    private boolean outputNeverChanged = true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void changeDude() {
        try {
            NameChanger nameChanger = new NameChanger(nameField.getText());
            CatchphraseChanger catchphraseChanger = new CatchphraseChanger(phraseField.getText());
            nameChanger.start();
            catchphraseChanger.start();
            nameChanger.join();
            catchphraseChanger.join();
            if (outputNeverChanged) {
                outputArea.setText(AwesomeDude.getInstance().toString());
                outputNeverChanged = false;
            } else {
                outputArea.appendText(AwesomeDude.getInstance().toString());
            }
        } catch (InterruptedException e) {
            outputArea.setText("No changes for you, mate.");
        }
    }
}
