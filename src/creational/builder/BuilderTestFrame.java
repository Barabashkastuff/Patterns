package creational.builder;

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
public class BuilderTestFrame extends JFrame {

    private JTextArea textLabel;
    private JTextField nameField;
    private JTextField levelField;
    private JTextField subclassField;
    private JComboBox<String> classCombo;

    public BuilderTestFrame() {
        initUI();
    }

    private void initUI() {
        setTitle("Builder Test Frame");
        setSize(600, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2,3));
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
        p.add(nameField);
        p.add(textLabel);
        p.add(levelField);
        p.add(classCombo);
        p.add(createButton);
        p.add(subclassField);
        add(p);
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
