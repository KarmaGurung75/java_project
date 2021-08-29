package java_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class teacher {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacher window = new teacher();
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
	public teacher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 100, 0));
		frame.setBounds(100, 100, 972, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TEACHER MANAGEMENT");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(197, 10, 521, 52);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 42));
		
		/*JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 76, 379, 52);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);*/
		
		JLabel lblNewLabel_1 = new JLabel("MANAGE INFORMATION");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 72, 379, 52);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 32));
		
		JLabel lblNewLabel_2 = new JLabel("TEACHER'S DETAILS");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(417, 80, 326, 37);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 32));
		
		JPanel panel = new JPanel();
		panel.setBounds(409, 138, 539, 395);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("USERNAME");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 138, 143, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("AGE");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_4.setBounds(10, 182, 143, 27);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("EXPERIENCE");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_5.setBounds(10, 219, 143, 34);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("QUALIFICATION");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_6.setBounds(10, 263, 143, 31);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(213, 138, 176, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 178, 176, 31);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(213, 219, 176, 34);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(213, 263, 176, 31);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(213, 304, 176, 31);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("GENDER");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_7.setBounds(10, 304, 143, 31);
		frame.getContentPane().add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBounds(10, 488, 95, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_1.setBounds(115, 488, 142, 45);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_2.setBounds(267, 488, 122, 45);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_8 = new JLabel("EMAIL");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_8.setBounds(10, 345, 143, 31);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("CONTACT");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_9.setBounds(10, 386, 143, 31);
		frame.getContentPane().add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setBounds(213, 345, 176, 31);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(213, 386, 176, 30);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("SHOW ALL");
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton_3.setBounds(794, 87, 154, 45);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_10 = new JLabel("DOB");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_10.setBounds(10, 427, 143, 31);
		frame.getContentPane().add(lblNewLabel_10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(213, 426, 176, 32);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\bak.png"));
		lblNewLabel_11.setBounds(0, 0, 958, 543);
		frame.getContentPane().add(lblNewLabel_11);
	}
}
