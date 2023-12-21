package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules,exit;
    JTextField name1;
     
    Login () {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading = new JLabel ("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name = new JLabel ("Enter Your Nmae");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,22));
        name.setForeground(Color.BLUE);
        add(name);
        
        name1  = new JTextField();
        name1.setBounds(735,200,300,25);
        name1.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(name1);
        
        rules = new JButton("RULES");
        rules.setBounds(735,270,120,25);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        exit = new JButton("EXIT");
        exit.setBounds(900,270,120,25);
        exit.setBackground(Color.BLUE);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
      
        
        
        setSize(1200,500);
        setLocation(200,200);
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource() == rules){
            String name = name1.getText();
        setVisible(false);
        new Rules(name);
        
        } else if (ae.getSource() == exit) {
              setVisible(false);
              
    }
            
    
    }
    
    public static void main(String[] args){
        
        new Login();
        
    }
    
}
