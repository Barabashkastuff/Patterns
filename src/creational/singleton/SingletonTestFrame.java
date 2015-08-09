package creational.singleton;

import common.ui.ATestFrame;
import creational.singleton.changer.CatchphraseChanger;
import creational.singleton.changer.NameChanger;
import creational.singleton.dude.AwesomeDude;

import javax.swing.*;
import java.awt.*;

/**
 * SingletonTestFrame Class
 *
 * @author a.slepakurov
 * @version 8/9/15
 */
public class SingletonTestFrame extends ATestFrame {

    private JTextField nameField;
    private JTextField phraseField;
    private JTextArea textArea;

    public SingletonTestFrame() throws HeadlessException {
        super("Singleton Test Frame", 2, 2);
        initUI();
    }

    private void initUI() {
        nameField = new JTextField("dude");
        phraseField = new JTextField("Duke Nukem must die!");
        textArea = new JTextArea("Nothing happened yet");
        JScrollPane scroll = new JScrollPane(textArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JButton changeButton = new JButton("Change and output");
        changeButton.addActionListener((l) -> changeDude());
        add(nameField);
        add(phraseField);
        add(scroll);
        add(changeButton);
    }

    private void changeDude() {
        try {
            NameChanger nameChanger = new NameChanger(nameField.getText());
            CatchphraseChanger catchphraseChanger = new CatchphraseChanger(phraseField.getText());
            nameChanger.start();
            catchphraseChanger.start();
            nameChanger.join();
            catchphraseChanger.join();
            textArea.setText(AwesomeDude.getInstance().toString());
        } catch (InterruptedException e) {
            textArea.setText("No changes for you, mate.");
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SingletonTestFrame();
            }
        });
    }
}
