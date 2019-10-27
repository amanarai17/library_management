package login_page;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login_p {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField password;
	protected JLabel txtPassword;
	protected JLabel txtUsername;
	protected JLabel name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_p window = new login_p();
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
	public login_p() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 550, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("login page");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel.setBounds(179, 21, 92, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("username:");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(21, 80, 81, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("password:");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(21, 146, 81, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(158, 75, 113, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(158, 141, 119, 19);
		frame.getContentPane().add(password);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				     //creating object
					allfields all = new allfields();
					all.setVisible(true);
					
				
			
			}
				
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton.setBounds(46, 215, 85, 21);
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
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton_1.setBounds(196, 215, 85, 21);
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
	}
}
