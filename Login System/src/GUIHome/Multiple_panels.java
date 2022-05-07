package GUIHome;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class Multiple_panels {

	private JFrame frame;
	private JPanel Tickets;
	private JPanel Inventory;
	private JPanel Tables;
	private JButton btnHome;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblNewLabel;
	private JButton btnLogin;
	private JPanel panel;
	private JLabel Username;
	private JLabel Password;
	private JLayeredPane layeredPane;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JButton btnEmployee;
	private JButton btnTickets;
	private JButton btnInventory;
	private JButton btnTables;
	private JButton btnLogOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Multiple_panels window = new Multiple_panels();
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
	public Multiple_panels() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1194, 712);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(1178, 0, -1177, 673);
		frame.getContentPane().add(layeredPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(-1176, 0, 1177, 673);
		layeredPane.add(panel_1);
		
		btnEmployee = new JButton("Employee");
		panel_1.add(btnEmployee);
		
		btnTickets = new JButton("Tickets");
		panel_1.add(btnTickets);
		
		btnInventory = new JButton("Inventory");
		panel_1.add(btnInventory);
		
		btnTables = new JButton("Tables");
		panel_1.add(btnTables);
		
		btnLogOut = new JButton("LogOut");
		panel_1.add(btnLogOut);
		
		panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 10, 10);
		layeredPane.add(panel_2);
		
		panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 10, 10);
		layeredPane.add(panel_3);
		
		panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 10, 10);
		layeredPane.add(panel_4);
		
		panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 10, 10);
		layeredPane.add(panel_5);
	}
}
