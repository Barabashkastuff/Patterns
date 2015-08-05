package creational.builder;

import javax.swing.*;
import java.awt.*;

/**
 * BTestFrame Class
 *
 * @author Andrew S. Slepakurov
 * @version 05/08/2015
 */
public class BuilderTestFrame extends JFrame {

    private JTextArea textLabel;

    public BuilderTestFrame() {
        initUI();
    }

    private void initUI() {
        setTitle("Builder Test Frame");
        setSize(500, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        textLabel = new JTextArea("Nothing happened yet");
        textLabel.setPreferredSize(new Dimension(300, 100));
        final JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.addItem("mage");
        comboBox.addItem("archer");
        comboBox.addItem("warrior");
        JButton button = new JButton("Create");
        getContentPane().add(textLabel, BorderLayout.NORTH);
        getContentPane().add(comboBox, BorderLayout.CENTER);
        getContentPane().add(button, BorderLayout.SOUTH);
        button.addActionListener((e) -> createUser());
    }

    private void createUser(){}

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BuilderTestFrame();
            }
        });
    }
}
