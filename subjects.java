package login_page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;


public class subjects extends JFrame {

	private JPanel contentPane;  

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					subjects frame = new subjects();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public subjects() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnAddNewSubject = new JButton("Add new book");
		btnAddNewSubject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newbook nb = new newbook();
				nb.setVisible(true);
				
				
				
					// TODO: handle exception
				
				
			}
		});
		btnAddNewSubject.setBounds(82, 192, 143, 23);
		contentPane.add(btnAddNewSubject);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allfields all = new allfields();
				all.setVisible(true);
				
			}
		});
		btnBack.setBounds(253, 192, 89, 23);
		contentPane.add(btnBack);
		
		JLabel lblChooseASubject = new JLabel("Choose a subject");
		lblChooseASubject.setBounds(82, 34, 134, 39);
		contentPane.add(lblChooseASubject);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Data Structures");
		comboBox.addItem("FAFL");
		comboBox.addItem("Computer Organization");
		comboBox.addItem("Computer Networks");
		comboBox.setSelectedItem(null);
		
		comboBox.setBounds(82, 100, 134, 22);
		contentPane.add(comboBox);
	}
}