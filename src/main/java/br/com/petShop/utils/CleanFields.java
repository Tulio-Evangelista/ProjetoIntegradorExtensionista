package br.com.petShop.utils;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CleanFields {
    public void cleanFields(JPanel... containers) {
        for (JPanel container : containers) {
            Component components[] = container.getComponents();
            for (Component component : components) {
                if (component instanceof JTextField) {
                    ((JTextField) component).setText(null);
                }
            }
        }
    }
}
