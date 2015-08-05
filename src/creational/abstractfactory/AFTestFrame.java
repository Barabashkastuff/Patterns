package creational.abstractfactory;

import creational.abstractfactory.character.Party;
import creational.abstractfactory.fabric.ElfPartyCreator;
import creational.abstractfactory.fabric.HumanPartyCreator;
import creational.abstractfactory.fabric.IPartyCreator;
import creational.abstractfactory.fabric.OrcPartyCreator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

/**
 * AFTestFrame Class
 *
 * @author a.slepakurov
 * @version 05/08/2015
 */
public class AFTestFrame extends JFrame {

    private JTextArea textLabel;

    public AFTestFrame() {
        initUI();
    }

    private void initUI() {
        setTitle("Absract Factory Test Frame");
        setSize(500, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        textLabel = new JTextArea("Nothing here");
        textLabel.setPreferredSize(new Dimension(300, 100));
        final Map<Integer, IPartyCreator> partyMap = new HashMap<Integer, IPartyCreator>();
        final JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.addItem("human");
        partyMap.put(0, new HumanPartyCreator());
        comboBox.addItem("elf");
        partyMap.put(1, new ElfPartyCreator());
        comboBox.addItem("orc");
        partyMap.put(2, new OrcPartyCreator());
        comboBox.setSelectedIndex(0);
        JButton button = new JButton("Attack");
        getContentPane().add(textLabel, BorderLayout.NORTH);
        getContentPane().add(comboBox, BorderLayout.CENTER);
        getContentPane().add(button, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeContent(partyMap.get(comboBox.getSelectedIndex()));
            }
        });
    }

    private void changeContent(IPartyCreator creator) {
        Party party = new Party(creator.createMage(), creator.createArcher(), creator.createWarrior());
        String attackLog = party.partyAttack();
        textLabel.setText(attackLog);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AFTestFrame();
            }
        });
    }
}
