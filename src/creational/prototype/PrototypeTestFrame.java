package creational.prototype;

import common.ui.ATestFrame;
import creational.prototype.armyman.ASoldier;
import creational.prototype.armyman.ElfSoldier;
import creational.prototype.armyman.HumanSoldier;
import creational.prototype.armyman.OrcSoldier;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


/**
 * PrototypeTestFrame Class
 *
 * @author a.slepakurov
 * @version 07/08/2015
 */
public class PrototypeTestFrame extends ATestFrame {
    private List<ASoldier> soldiers;
    private JTextArea textArea;

    public PrototypeTestFrame() {
        super("Prototype Test Frame", 2, 3);
        initList();
        initUI();
    }

    private void initUI() {
        JButton attackButton = new JButton("Attack");
        JButton elfButton = new JButton("Recruit elf");
        JButton orcButton = new JButton("Recruit orc");
        JButton humanButton = new JButton("Recruit human");
        textArea = new JTextArea("Nothing happened yet");
        JScrollPane scroll = new JScrollPane(textArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        attackButton.addActionListener((e) -> {
            attack();
        });
        elfButton.addActionListener((e) -> {
            cloneElf();
        });
        orcButton.addActionListener((e) -> {
            cloneOrc();
        });
        humanButton.addActionListener((e) -> {
            cloneHuman();
        });
        add(elfButton);
        add(orcButton);
        add(humanButton);
        add(scroll);
        add(attackButton);
    }

    private void initList() {
        soldiers = new ArrayList<>();
        soldiers.add(new ElfSoldier());
        soldiers.add(new OrcSoldier());
        soldiers.add(new HumanSoldier());
    }

    private void attack() {
        StringBuilder message = new StringBuilder("");
        soldiers.forEach((soldier) -> {
            message.append(soldier.toString()).append("\n");
        });
        textArea.setText(message.toString());
    }

    private void cloneElf() {
        try {
            soldiers.add(soldiers.get(0).clone());
        } catch (CloneNotSupportedException e) {
            textArea.setText("No cloning for you");
        }
    }

    private void cloneOrc() {
        try {
            soldiers.add(soldiers.get(1).clone());
        } catch (CloneNotSupportedException e) {
            textArea.setText("No cloning for you");
        }
    }

    private void cloneHuman() {
        try {
            soldiers.add(soldiers.get(2).clone());
        } catch (CloneNotSupportedException e) {
            textArea.setText("No cloning for you");
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrototypeTestFrame();
            }
        });
    }
}
