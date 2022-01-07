package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JPanel panel1;
    private JButton SHOWMEDIAButton;
    private JButton BORROWEDMEDIAButton;
    private JButton VIEWUSERSButton;
    private JButton TIMESIMULATIONButton;
    private JButton RECOMMANDATIONSButton;

    public Main() {

        SHOWMEDIAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);


            }
        });
        SHOWMEDIAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        BORROWEDMEDIAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        VIEWUSERSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
