package quizapplication;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
     String name;
     JButton start, back;
     
    Rules( String name){
        this.name = name;
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
        JLabel heading = new JLabel ("Welcome " + name+ " to Simple Minds");
        heading.setBounds(30,20,700,35);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel rule1 = new JLabel(" --:: RULES FOR QUIZ ::-- ");
         rule1.setBounds(20,40,300,100);
        rule1.setFont(new Font("Tahoma", Font.PLAIN,20));
        add(rule1);
        
        JLabel rules = new JLabel ("RULES");
        rules.setBounds(10,70,500,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN,20));
        rules.setForeground(Color.BLACK);
        
        rules.setText(
            "<html>" + 
                "1. Answer Point to Point." + "<br><br>" +
                "2. Try to Answer Fast/Quick." + "<br><br>" + 
                "3. Every question have 15 second to answer."  + "<br><br>" +
                "4. Don't try to Cheat."  + "<br><br>" +
                "5. Do your best/Best of luck Champs." + "<br><br>" +
            "</html>" );
        
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250,500,120,25);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        start = new JButton("START");
        start.setBounds(400,500,120,25);
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
    setSize(1000,700);
    setLocation(350,100);
    setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
    if (ae.getSource() == start){
        setVisible(false);
        new Quiz(name);
    
    } else if (ae.getSource() == back){
    setVisible(false);
    new Login();
    }
        
    }
   
    public static void main (String args[]){
        
    new Rules("User");
        
    }
    
}
