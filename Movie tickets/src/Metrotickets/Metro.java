package Metrotickets;
//jkfdhgiih
//khjhiofhf
//57654
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Metro {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metro window = new Metro();
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
	public Metro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame =new JFrame();
		frame.setBounds(100, 100, 559, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Metro Tickets");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(128, 11, 173, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel V1 = new JLabel("Name:");
		V1.setFont(new Font("Arial Black", Font.BOLD, 12));
		V1.setBounds(10, 52, 69, 23);
		frame.getContentPane().add(V1);
		
		JLabel S1 = new JLabel("Source:");
		S1.setFont(new Font("Arial Black", Font.BOLD, 13));
		S1.setBounds(10, 95, 69, 14);
		frame.getContentPane().add(S1);
		
		JLabel D1 = new JLabel("Destination:");
		D1.setFont(new Font("Arial Black", Font.BOLD, 13));
		D1.setBounds(10, 130, 93, 14);
		frame.getContentPane().add(D1);
		
		JLabel V2 = new JLabel("Tickets:");
		V2.setFont(new Font("Arial Black", Font.BOLD, 13));
		V2.setBounds(10, 170, 126, 14);
		frame.getContentPane().add(V2);
		

		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Ameerpet", "Miyapur", "Khairtabad"}));
		cb1.setBounds(156, 93, 120, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Nagole", "Habsiguda", "Uppal"}));
		cb2.setBounds(156, 128, 120, 22);
		frame.getContentPane().add(cb2);
		
		tb2 = new JTextField();
		tb2.setBounds(156, 169, 120, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		tb1 = new JTextField();
		tb1.setBounds(156, 54, 120, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=tb1.getText();
				String Source= (String)cb1.getSelectedItem();
				String Destination=(String) cb2.getSelectedItem();
				String Tickets=tb2.getText();
				int nt=Integer.parseInt(Tickets);
				int bill=0;
				if(Source.equals(Destination))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Please Check Destination");
		        }
				else {
					bill=bill+nt*45;
					JOptionPane.showMessageDialog(btnNewButton, "Name "+Name+"\n Source"+Source+"\n Destination"+Destination+"\n Bill"+bill);
					
					
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "Name  "+Name+ 
						"\n Source "+Source+"\n Destination"+Destination+"\n num of tickts"+Tickets+ "\n amount "+bill);
				if(res==YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CONFIRMED");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING canceled");
				}
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(156, 214, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\ms-dhoni-details_5398b9b9f.jpg"));
		lblNewLabel_1.setBounds(-56, 11, 342, 0);
		frame.getContentPane().add(lblNewLabel_1);
		
	}
}
