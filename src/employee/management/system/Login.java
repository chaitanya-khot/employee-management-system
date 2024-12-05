package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.black;

public class Login extends JFrame implements ActionListener {

    JTextField tusername;
    JPasswordField tpassword;
    JButton login, back;

    Login(){

        JLabel username = new JLabel("Username"); // to make text visible on frame
        username.setBounds(40,20,100,30);
        add(username);

        tusername = new JTextField();
        tusername.setBounds(150, 20, 150, 30);
        add(tusername);

        JLabel password = new JLabel("Password"); // to make text visible on frame
        password.setBounds(40,70,100,30);
        add(password);

        tpassword = new JPasswordField();
        tpassword.setBounds(150, 70, 150, 30);
        add(tpassword);

        login = new JButton("LOGIN");
        login.setBounds(150, 140, 150, 30);
        login.setOpaque(true);  // Ensures the background is not transparent
        login.setContentAreaFilled(true);  // Ensures the background is filled with the color
        login.setBorderPainted(false);  // Removes the border for a clean look
        login.setBackground(Color.BLACK);  // Sets the background color to black
        login.setForeground(Color.WHITE);  // Sets the text color to white
        login.addActionListener(this);
        add(login);

        back = new JButton("BACK");
        back.setBounds(150, 180, 150, 30);
        back.setOpaque(true);  // Ensures the background is not transparent
        back.setContentAreaFilled(true);  // Ensures the background is filled with the color
        back.setBorderPainted(false);  // Removes the border for a clean look
        back.setBackground(Color.BLACK);  // Sets the background color to black
        back.setForeground(Color.WHITE);  // Sets the text color to white
        back.addActionListener(this);
        add(back);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i22 = i11.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel imgg = new JLabel(i33);
        imgg.setBounds(350, 10, 600, 400);
        add(imgg);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/LoginB.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0, 0, 600, 300);
        add(img);


        setSize(600, 300);
        setLocation(300, 200);
        setLayout(null); // by default border layout
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login){

        } else if (e.getSource() == back) {
            System.exit(90);
        }
    }

    public static void main(String[] args) {
        new Login();

    }
}
