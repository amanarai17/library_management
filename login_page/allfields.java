package login_page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

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
		setBounds(200, 200, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_0 = new JButton("Available books");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//creating object
				Available_books ab= new Available_books();
				ab.setVisible(true);
			}
			
		});
		btnNewButton_0.setBounds(203, 62, 133, 25);
		contentPane.add(btnNewButton_0);
		
		JButton btnNewButton_1 = new JButton("Issue Date");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //creating object
				issue_date isd = new issue_date();
				isd.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(202, 143, 134, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Return Date");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //creating object
				return_date rd = new return_date();
				rd.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(202, 230, 134, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Subjects");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //creating object
				subjects sub = new subjects();
				sub.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(202, 315, 134, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("logout");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frmLoginSystem = new JFrame("logout");
			    if(JOptionPane.showConfirmDialog(frmLoginSystem,"confirm if u want to logout","Login Systems",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
			    	System.exit(0);
			    }
			}
		});
		btnNewButton_4.setBounds(202, 403, 134, 25);
		contentPane.add(btnNewButton_4);
	}
}
