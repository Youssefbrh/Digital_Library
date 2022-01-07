package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends javax.swing.JFrame {


    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton LOGINButton;
    private JButton createAccountButton;
    private JPanel Jpanel_Login;

    public Login(String title) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(Jpanel_Login);
        this.pack();


        LOGINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new Registration("Digital Library");
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Login("Digital Library");
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
