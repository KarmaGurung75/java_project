package java_project;

//import required classes and packages  
import javax.swing.*;  
import java.awt.*;  
import java.awt.EventQueue;
import java.lang.Exception;  
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class loginn {



  private JFrame loginframe;
  private JTextField username;
  private JTextField password;



  /**
   * Launch the application.
   */
  public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
          public void run() {
              try {
                  loginn window = new loginn();
                  window.loginframe.setVisible(true);
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }
      });
  }



  /**
   * Create the application.
   */
  public loginn() {
      initialize();
  }



  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
      loginframe = new JFrame();
      loginframe.getContentPane().setForeground(Color.BLACK);
      loginframe.getContentPane().setFont(new Font("Arial", Font.BOLD, 16));
      loginframe.getContentPane().setBackground(new Color(0, 51, 51));
      loginframe.setBounds(100, 100, 572, 367);
      loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      loginframe.getContentPane().setLayout(null);
      
      JLabel textlogin = new JLabel("PLEASE LOGIN !");
      textlogin.setBounds(253, 2, 170, 41);
      textlogin.setForeground(new Color(255, 255, 255));
      textlogin.setBackground(Color.PINK);
      textlogin.setFont(new Font("Arial", Font.BOLD, 20));
      loginframe.getContentPane().add(textlogin);
      
      JPanel panel_2 = new JPanel();
      panel_2.setBounds(44, 90, 96, 26);
      loginframe.getContentPane().add(panel_2);
      panel_2.setLayout(null);
      
      JLabel lblpassword = new JLabel("PASSWORD");
      lblpassword.setBounds(0, 0, 96, 26);
      panel_2.add(lblpassword);
      lblpassword.setFont(new Font("Arial", Font.BOLD, 14));
      lblpassword.setHorizontalAlignment(SwingConstants.CENTER);
      
      username = new JTextField();
      username.setBounds(229, 53, 131, 29);
      loginframe.getContentPane().add(username);
      username.setColumns(10);
      
      password = new JTextField();
      password.setBounds(229, 92, 131, 26);
      loginframe.getContentPane().add(password);
      password.setColumns(10);
      
      JButton btnregister = new JButton("NEW REGISTER");
      btnregister.setBounds(118, 219, 134, 34);
      btnregister.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              
          }
      });
      btnregister.setBackground(Color.WHITE);
      btnregister.setFont(new Font("Arial", Font.BOLD, 12));
      loginframe.getContentPane().add(btnregister);
      
      JButton btnlogin = new JButton("LOGIN");
      btnlogin.setBounds(136, 183, 104, 26);
      btnlogin.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
          }
      });
      btnlogin.setForeground(Color.BLACK);
      btnlogin.setBackground(Color.WHITE);
      btnlogin.setFont(new Font("Arial", Font.BOLD, 12));
      loginframe.getContentPane().add(btnlogin);
      
      JButton btnexit = new JButton("EXIT");
      btnexit.setBounds(415, 299, 65, 31);
      btnexit.setFont(new Font("Arial", Font.BOLD, 12));
      btnexit.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
               
          }
      });
      loginframe.getContentPane().add(btnexit);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBounds(44, 58, 92, 22);
      loginframe.getContentPane().add(panel_1);
      panel_1.setLayout(null);
      
      JLabel lblusername = new JLabel("USERNAME");
      lblusername.setBounds(0, 0, 92, 22);
      panel_1.add(lblusername);
      lblusername.setBackground(new Color(51, 0, 51));
      lblusername.setHorizontalAlignment(SwingConstants.CENTER);
      lblusername.setFont(new Font("Arial", Font.BOLD, 14));
      
      JLayeredPane layeredPane = new JLayeredPane();
      layeredPane.setBounds(32, 183, 172, -65);
      loginframe.getContentPane().add(layeredPane);
      
      JPanel panel_3 = new JPanel();
      panel_3.setBounds(54, 127, 86, 26);
      loginframe.getContentPane().add(panel_3);
      panel_3.setLayout(null);
      
      JLabel lblsector = new JLabel("SECTOR");
      lblsector.setForeground(new Color(0, 0, 0));
      lblsector.setBounds(10, 0, 76, 26);
      panel_3.add(lblsector);
      lblsector.setFont(new Font("Arial", Font.BOLD, 14));
      
   
          String sector[]={"Adminstration","Teacher","Student","Staff"};        
          JComboBox menu=new JComboBox(sector);    
          menu.setFont(new Font("Arial", Font.BOLD, 14));
          menu.setBounds(229, 129,131,26);    
          loginframe.getContentPane().add(menu);        
          loginframe.getContentPane().setLayout(null);
          
          JPanel panel = new JPanel();
          panel.setBounds(58, 48, 554, -21);
          loginframe.getContentPane().add(panel);
          
          JLabel lblpicture = new JLabel("");
          lblpicture.setIcon(new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\pm.jpg"));
          lblpicture.setBounds(0, 2, 490, 338);
          loginframe.getContentPane().add(lblpicture);
          loginframe.setSize(504,377);    
          loginframe.setVisible(true);         
      }    
  private static void addPopup(Component component, final JPopupMenu popup) {
  
}


	/**
	 * Initialize the contents of the frame.
	 */
	private void main() {
		loginframe = new JFrame();
		loginframe.setBounds(100, 100, 450, 300);
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
