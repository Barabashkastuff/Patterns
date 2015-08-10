package common.ui;

import javax.swing.*;
import java.awt.*;

/**
 * ATestFrame Class
 *
 * @author a.slepakurov
 * @version 8/6/2015
 */
public class ATestFrame extends JFrame {
    public ATestFrame(String title) throws HeadlessException {
        super(title);
        setSize(600, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));
    }

    public ATestFrame(String title, int rows, int cols) {
        this(title);
        setLayout(new GridLayout(rows, cols));
    }

    public ATestFrame(String title, int width, int height, int rows, int cols) {
        this(title, width, height);
        setSize(width, height);
        setLayout(new GridLayout(rows, cols));
    }
}
