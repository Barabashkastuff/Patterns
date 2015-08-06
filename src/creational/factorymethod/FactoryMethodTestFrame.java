package creational.factorymethod;

import common.ui.ATestFrame;
import creational.factorymethod.character.RaceType;
import creational.factorymethod.factory.*;
import creational.factorymethod.spell.ASpell;
import creational.factorymethod.spell.SpellType;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * FactoryMethodTestFrame Class
 *
 * @author a.slepakurov
 * @version 05/08/2015
 */
public class FactoryMethodTestFrame extends ATestFrame {

    private JTextArea textLabel;
    private JTextField nickField;
    private JTextField spellNameField;
    private JComboBox<String> classBox;
    private JComboBox<String> spellType;

    private Map<SpellType, ASpellCreator> spellMap;

    public FactoryMethodTestFrame() {
        super("Factory Method Test Frame", 800, 300, 2, 3);
        initUI();
    }

    private void initUI() {
        textLabel = new JTextArea("Nothing happened yet");
        textLabel.setPreferredSize(new Dimension(300, 100));
        classBox = new JComboBox<String>();
        classBox.addItem("Orc");
        classBox.addItem("Wlf");
        classBox.addItem("Human");
        spellType = new JComboBox<String>();
        spellType.addItem("air");
        spellType.addItem("fire");
        spellType.addItem("water");
        spellType.addItem("earth");
        JButton createButton = new JButton("Generate");
        nickField = new JTextField("nickname");
        spellNameField = new JTextField("name");
        createButton.addActionListener((e) -> createSpell());
        add(nickField);
        add(textLabel);
        add(spellNameField);
        add(classBox);
        add(createButton);
        add(spellType);
    }

    private void createSpell() {
        if (spellMap == null) {
            initMapping();
        }
        ASpell spell = spellMap.get(SpellType.getType((String) spellType.getSelectedItem()))
                .create(spellNameField.getText(), RaceType.getType((String) classBox.getSelectedItem()), nickField.getText());
        textLabel.setText(spell.toString());
    }

    private void initMapping() {
        spellMap = new HashMap<>();
        spellMap.put(SpellType.AIR, new AirSpellCreator());
        spellMap.put(SpellType.FIRE, new FireSpellCreator());
        spellMap.put(SpellType.WATER, new WaterSpellCreator());
        spellMap.put(SpellType.EARTH, new EarthSpellCreator());
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FactoryMethodTestFrame();
            }
        });
    }
}
