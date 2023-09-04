package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    Login(){
        setLayout(null);
        setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/b.png"));
        Image i2  = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel label  = new JLabel(i1);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text = new JLabel("Welcome to the ATM");
        text.setFont(new Font("Osward",Font.BOLD, 38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,400,40);
        add(cardno);
        JTextField cardtextfield = new JTextField();
        cardtextfield.setBounds(300,150,250,30);
        add(cardtextfield);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);
        JTextField pintextfield = new JTextField();
        pintextfield.setBounds(300,220,250,30);
        add(pintextfield);

        JButton login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        JButton clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        JButton signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230 ,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);







        getContentPane().setBackground(Color.white );

        setSize(800,400);
        setVisible(true);
        setLocation(350,200);

    }

    public static void main(String[] args){
        new Login();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
