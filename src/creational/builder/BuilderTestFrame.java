package creational.builder;

import common.ui.ATestFrame;
import creational.builder.character.Hero;
import creational.builder.character.HeroType;

import javax.swing.*;
import java.awt.*;

/**
 * BTestFrame Class
 *
 * @author a.slepakurov
 * @version 05/08/2015
 */
public class BuilderTestFrame extends ATestFrame {

    private JTextArea textLabel;
    private JTextField nameField;
    private JTextField levelField;
    private JTextField subclassField;
    private JComboBox<String> classCombo;

    public BuilderTestFrame() {
        super("Builder Test Frame", 2, 3);
        initUI();
    }

    private void initUI() {
        textLabel = new JTextArea("Nothing happened yet");
        textLabel.setPreferredSize(new Dimension(300, 100));
        classCombo = new JComboBox<String>();
        classCombo.addItem("mage");
        classCombo.addItem("archer");
        classCombo.addItem("warrior");
        JButton createButton = new JButton("Generate");
        nameField = new JTextField("nickname");
        levelField = new JTextField("42");
        subclassField = new JTextField("dancer");
        createButton.addActionListener((e) -> createUser());
        add(nameField);
        add(textLabel);
        add(levelField);
        add(classCombo);
        add(createButton);
        add(subclassField);
    }

    private void createUser(){
        Hero hero = new Hero.Builder()
                .putName(nameField.getText())
                .levelUp(levelField.getText())
                .putSubclass(subclassField.getText())
                .putType(HeroType.getType((String) classCombo.getSelectedItem()))
                .build();
        textLabel.setText(hero.toString());
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BuilderTestFrame();
            }
        });
    }
}
