package login_page;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login_p{

	private JFrame frame;
	private JPasswordField password;
	protected JLabel txtPassword;
	protected JLabel txtUsername;
	protected JLabel name;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_p window= new login_p();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

     Connection connection=null;	

	/**
	 * Create the application.
	 */
	public login_p() {
		initialize();
		connection=sqliteConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 550, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setBounds(215, 21, 92, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setBounds(66, 80, 81, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setBounds(66, 146, 81, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		
		password = new JPasswordField();
		password.setBounds(253, 142, 119, 19);
		frame.getContentPane().add(password);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					
				try {
					String query="Select * from credentials where username=? and password=? ";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1,textField_1.getText() );
					pst.setString(2,password.getText() );
					
					ResultSet rs=pst.executeQuery();
					int count=0;
					while(rs.next())
					{
						count=count+1;
						
					}
					if(count==1)
					{
						JOptionPane.showMessageDialog(null, "Username and password is correct");
						allfields all = new allfields();
						all.setVisible(true);
					}
					else if(count>1)
					{
						JOptionPane.showMessageDialog(null, "Duplicate Username and password");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Username and password is not correct. Try Again!");
					}
					rs.close();
					pst.close();
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
				
				
				   //creating object
				
				
			}
				
		});
		btnNewButton.setBounds(116, 215, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    JFrame frmLoginSystem = new JFrame("exit");
			    if(JOptionPane.showConfirmDialog(frmLoginSystem,"confirm if u want to exit","Login Systems",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
			    	System.exit(0);
			    }
			}
		});

		btnNewButton_1.setBounds(298, 215, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 192, 505, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(80, 32, -131, 36);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(324, 51, 161, -109);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(30, 51, 1, 2);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(21, 51, 505, 2);
		frame.getContentPane().add(separator_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(252, 76, 120, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
