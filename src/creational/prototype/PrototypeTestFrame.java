package creational.prototype;

import common.ui.ATestFrame;

import java.awt.*;


/**
 * PrototypeTestFrame Class
 *
 * @author Andrew S. Slepakurov
 * @version 07/08/2015
 */
public class PrototypeTestFrame extends ATestFrame {
    public PrototypeTestFrame() {
        super("Prototype Test Frame");
        initUI();
    }

    private void initUI() {
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
