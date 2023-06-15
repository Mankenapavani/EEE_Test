package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class REGISTRATION_PAGE {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGISTRATION_PAGE window = new REGISTRATION_PAGE();
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
	public REGISTRATION_PAGE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(100, 100, 675, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBackground(new Color(255, 175, 175));
		lblNewLabel.setBounds(246, 25, 175, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(96, 112, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(96, 181, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phn no");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(96, 256, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		TextArea textArea = new TextArea();
		textArea.setBackground(Color.PINK);
		textArea.setBounds(246, 112, 186, 25);
		frame.getContentPane().add(textArea);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(246, 170, 196, 25);
		frame.getContentPane().add(textArea_1);
		
		TextArea textArea_2 = new TextArea();
		textArea_2.setBounds(246, 239, 210, 25);
		frame.getContentPane().add(textArea_2);
		
		Button button = new Button("submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login l=new login();
				l.setVisible(true);
				Component btnNewButton = null;
				JOptionPane.showMessageDialog(btnNewButton, "Done!");
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setBounds(241, 371, 70, 22);
		frame.getContentPane().add(button);
	}

	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(false);
		
	}
}
