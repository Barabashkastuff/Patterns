package creational.abstractfactory;

import common.ui.ATestFrame;
import creational.abstractfactory.character.Party;
import creational.abstractfactory.factory.ElfPartyCreator;
import creational.abstractfactory.factory.HumanPartyCreator;
import creational.abstractfactory.factory.IPartyCreator;
import creational.abstractfactory.factory.OrcPartyCreator;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * AFTestFrame Class
 *
 * @author a.slepakurov
 * @version 05/08/2015
 */
public class AbstractFactoryTestFrame extends ATestFrame {

    private JTextArea textLabel;

    private Map<String, IPartyCreator> partyMap;

    public AbstractFactoryTestFrame() {
        super("Absract Factory Test Frame", 600, 300, 3, 1);
        initUI();
    }

    private void initUI() {
        textLabel = new JTextArea("Nothing happened yet");
        textLabel.setPreferredSize(new Dimension(300, 100));
        final JComboBox<String> raceBox = new JComboBox<>();
        raceBox.addItem("human");
        raceBox.addItem("elf");
        raceBox.addItem("orc");
        raceBox.setSelectedIndex(0);
        JButton button = new JButton("Attack");
        add(textLabel);
        add(raceBox);
        add(button);
        button.addActionListener((e) -> {
            if (partyMap == null) {
                initMapping();
            }
            changeContent(partyMap.get((String) raceBox.getSelectedItem()));
        });
    }

    private void changeContent(IPartyCreator creator) {
        Party party = new Party(creator.createMage(), creator.createArcher(), creator.createWarrior());
        String attackLog = party.partyAttack();
        textLabel.setText(attackLog);
    }

    private void initMapping() {
        partyMap = new HashMap<>();
        partyMap.put("human", new HumanPartyCreator());
        partyMap.put("elf", new ElfPartyCreator());
        partyMap.put("orc", new OrcPartyCreator());
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AbstractFactoryTestFrame();
            }
        });
    }
}
