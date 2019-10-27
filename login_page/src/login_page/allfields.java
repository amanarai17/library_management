package login_page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class allfields extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					allfields frame = new allfields();
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
	public allfields() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 550, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Available Books");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(202, 64, 134, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Issue Date");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(202, 153, 134, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Return Date");
		btnNewButton_2.setBounds(202, 230, 134, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Subjects");
		btnNewButton_3.setBounds(202, 322, 134, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("logout");
		btnNewButton_4.setBounds(202, 416, 134, 25);
		contentPane.add(btnNewButton_4);
	}
}
