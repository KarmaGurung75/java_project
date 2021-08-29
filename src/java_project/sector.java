package java_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sector {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sector window = new sector();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sector() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 637, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnback = new JButton("");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("select your field!!!");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 34));
		lblNewLabel_4.setBounds(153, 24, 321, 86);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("ADMIN");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(67, 373, 85, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("STUDENT");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBackground(new Color(0, 0, 0));
		lblNewLabel_3.setBounds(389, 377, 85, 18);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("TEACHER");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(235, 377, 85, 18);
		frame.getContentPane().add(lblNewLabel_2);
		btnback.setIcon(new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\back.jpg"));
		btnback.setBounds(0, 0, 62, 61);
		frame.getContentPane().add(btnback);
		
		JButton btnadmin = new JButton("");
		btnadmin.setIcon(new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\admin.jpg"));
		btnadmin.setFont(new Font("Arial", Font.BOLD, 20));
		btnadmin.setForeground(new Color(255, 255, 255));
		btnadmin.setBackground(new Color(0, 0, 0));
		btnadmin.setBounds(67, 281, 85, 86);
		frame.getContentPane().add(btnadmin);
		
		JButton btnteacher = new JButton("");
		btnteacher.setIcon(new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\teacher.jpg"));
		btnteacher.setFont(new Font("Arial", Font.BOLD, 18));
		btnteacher.setForeground(new Color(255, 255, 255));
		btnteacher.setBackground(new Color(0, 0, 0));
		btnteacher.setBounds(235, 282, 85, 85);
		frame.getContentPane().add(btnteacher);
		
		JButton btnstudent = new JButton("");
		btnstudent.setIcon(new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\student.jpg"));
		btnstudent.setFont(new Font("Arial", Font.BOLD, 18));
		btnstudent.setForeground(new Color(255, 255, 255));
		btnstudent.setBackground(new Color(0, 0, 0));
		btnstudent.setBounds(389, 282, 85, 85);
		frame.getContentPane().add(btnstudent);
		
		JButton btnexit = new JButton("EXIT");
		btnexit.setForeground(new Color(255, 255, 255));
		btnexit.setBackground(new Color(0, 0, 0));
		btnexit.setFont(new Font("Arial", Font.BOLD, 16));
		btnexit.setBounds(528, 391, 85, 40);
		frame.getContentPane().add(btnexit);
		
		JLabel lblpage = new JLabel("");
		lblpage.setIcon(new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\BG.png"));
		lblpage.setBounds(0, 0, 623, 441);
		frame.getContentPane().add(lblpage);
	}
}
