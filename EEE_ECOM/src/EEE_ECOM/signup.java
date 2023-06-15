package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class signup {

	private JFrame frame;
	private JTextField tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
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
	public signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("signup");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(276, 23, 85, -6);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("signup");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(304, 23, 115, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(89, 106, 72, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("GENDER");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(84, 159, 91, 38);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DEPARTMENT");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(88, 221, 138, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("FAV PROG LAN");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(89, 273, 150, 25);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb = new JTextField();
		tb.setBounds(312, 99, 157, 20);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(311, 171, 132, -6);
		frame.getContentPane().add(comboBox);
		
		JRadioButton r1 = new JRadioButton("Female");
		r1.setFont(new Font("Tahoma", Font.BOLD, 13));
		r1.setBounds(310, 159, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Male");
		r2.setFont(new Font("Tahoma", Font.BOLD, 13));
		r2.setBounds(449, 159, 109, 23);
		frame.getContentPane().add(r2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(304, 226, -693, 96);
		frame.getContentPane().add(comboBox_1);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 13));
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "EEE", "ECE", "CSE", "IT", "IOT", "AIML", "CS", "DS"}));
		c1.setBounds(305, 226, 164, 20);
		frame.getContentPane().add(c1);
		
		JCheckBox cb1 = new JCheckBox("PYTHON");
		cb1.setFont(new Font("Tahoma", Font.BOLD, 13));
		cb1.setBounds(303, 275, 85, 23);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("java");
		cb2.setFont(new Font("Tahoma", Font.BOLD, 13));
		cb2.setBounds(421, 277, 72, 23);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("c");
		cb3.setFont(new Font("Tahoma", Font.BOLD, 13));
		cb3.setBounds(522, 277, 58, 23);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb.getText();
				String g;
				if(r1.isSelected())
				{
					g="Female";
				}
				else if(r2.isSelected())
				{
					g="Male";
				}
				else
				{
					g="invalid";
				}
				String b=(String) c1.getSelectedItem();
				String p;
				if(cb1.isSelected())
				{
					p="python";
				}
					else if(cb2.isSelected())
					{
						p="java";
				}
					else
					{
						p="c";
					}
				JOptionPane.showMessageDialog(btnNewButton,
						"Hello "+n+" \n gender :"+g+" \n Branch"+b+"\n programming"+p);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(243, 355, 118, 23);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 674, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
