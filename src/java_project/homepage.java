package java_project;

import java.awt.Color; 
import java.awt.Font; 
import javax.swing.*; 
  
public class homepage { 
    JFrame f; 
    JLabel lbl_title, lbl_image; 
    JTextPane text; 
    JButton btn_start; 
     
    public homepage() { 
        f=new JFrame("Home"); 
        f.getContentPane().setBackground(Color.BLACK); 
         
        lbl_title=new JLabel("ADVANCED SCHOOL MANAGEMENT SYSTEM"); 
        lbl_title.setFont(new Font("Arial", Font.BOLD, 25)); 
        lbl_title.setForeground(Color.YELLOW); 
        lbl_title.setBounds(60, 5, 630, 80); 
        f.add(lbl_title); 
         
        text=new JTextPane(); 
        text.setText("           Welcome to our Advanced School with advanced learning technologies. " 
                + "This school provides the friendly environment to study. " 
                + "When you enter this loving school consider yourself one of the special member of an extraordinary family."); 
        text.setFont(new Font("Arial", Font.PLAIN, 16)); 
        text.setForeground(Color.RED); 
        text.setBounds(40, 90, 600, 70); 
        f.add(text); 
         
        lbl_image=new JLabel(""); 
        lbl_image.setIcon(new ImageIcon("D:\\Sudi's folder\\School Management System\\pictures\\n.jpg")); 
        lbl_image.setBounds(40,180,600,350); 
        f.add(lbl_image); 
     
           btn_start=new JButton("START"); 
           btn_start.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18)); 
           btn_start.setForeground(new Color(30, 144, 255)); 
        btn_start.setBounds(293, 560, 100, 40); 
        f.add(btn_start); 
         
        f.setSize(700, 660); 
         f.setLayout(null); 
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         f.setVisible(true); 
    } 
     
    public static void main(String[] args) { 
        new homepage(); 
    } 
} 
        
