package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;

public class Registration extends javax.swing.JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton createAccountButton;
    private JButton LOGINButton;


    public Registration(String title) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();

        createAccountButton.addKeyListener(new KeyAdapter() {


        });
        LOGINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new Login("Digital Library");
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }
}
