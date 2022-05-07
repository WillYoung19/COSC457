import java.awt.EventQueue;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyGUI {

	private JFrame frame;
	private JLayeredPane layeredPane;
	private JPanel pnlHome;
	private JPanel pnlEmployee;
	private JPanel pnlTables;
	private JPanel pnlInventory;
	private JPanel pnlTickets;
	private JButton btnHome;
	private JButton btnHome_1;
	private JButton btnHome_2;
	private JButton btnHome_3;
	private JTextField txtSjkdlad;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JPanel pnlTable1;
	private Container layeredPane_1;
	private JLayeredPane layeredPane_2;
	private JPanel pnlTble1E;
	private JPanel pnlTbl1F;
	private JButton btnNewButton_1;
	private JLayeredPane layeredPane_3;
	private JPanel pnlTbl2E;
	private JButton btnNewButton_2;
	private JPanel pnlTbl2F;
	private JButton btnNewButton_3;
	private JLayeredPane layeredPane_4;
	private JPanel pnlTbl3E;
	private JButton btnNewButton_4;
	private JPanel pnlTbl3F;
	private JButton btnNewButton_5;
	private JLayeredPane layeredPane_5;
	private JPanel pnlTbl4E;
	private JButton btnNewButton_6;
	private JPanel pnlTbl4F;
	private JButton btnNewButton_7;
	private JLabel lblNewLabel_4_3;
	private JLayeredPane layeredPane_6;
	private JPanel pnlTbl5E;
	private JButton btnNewButton_8;
	private JPanel pnlTbl5F;
	private JButton btnNewButton_9;
	private JLabel lblNewLabel_4_4;
	private JLayeredPane layeredPane_7;
	private JPanel pnlTbl6E;
	private JButton btnNewButton_10;
	private JPanel pnlTbl6F;
	private JButton btnNewButton_11;
	private JLayeredPane layeredPane_8;
	private JPanel pnlTbl7E;
	private JButton btnNewButton_12;
	private JPanel pnlTbl7F;
	private JButton btnNewButton_13;
	private JLayeredPane layeredPane_9;
	private JPanel pnlTbl8E;
	private JButton btnNewButton_14;
	private JPanel pnlTbl8F;
	private JButton btnNewButton_15;
	private JLayeredPane layeredPane_10;
	private JPanel pnlTbl9E;
	private JButton btnNewButton_16;
	private JPanel pnlTbl9F;
	private JButton btnNewButton_17;
	private JLayeredPane layeredPane_11;
	private JPanel pnlTbl10E;
	private JButton btnNewButton_18;
	private JPanel pnlTbl10F;
	private JButton btnNewButton_19;
	private JLayeredPane layeredPane_12;
	private JPanel pnlTbl11E;
	private JButton btnNewButton_20;
	private JPanel pnlTbl11F;
	private JButton btnNewButton_21;
	private JLayeredPane layeredPane_13;
	private JPanel pnlTbl12E;
	private JButton btnNewButton_22;
	private JPanel pnlTbl12F;
	private JButton btnNewButton_23;
	private JLayeredPane layeredPane_14;
	private JPanel pnlTbl13E;
	private JButton btnNewButton_24;
	private JPanel pnlTbl13F;
	private JButton btnNewButton_25;
	private JLayeredPane layeredPane_15;
	private JPanel pnlTbl14E;
	private JButton btnNewButton_26;
	private JPanel pnlTbl14F;
	private JButton btnNewButton_27;
	private JLayeredPane layeredPane_16;
	private JPanel pnlTbl15E;
	private JButton btnNewButton_28;
	private JPanel pnlTbl15F;
	private JButton btnNewButton_29;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_4_5;
	private JLabel lblNewLabel_4_6;
	private JLabel lblNewLabel_4_7;
	private JLabel lblNewLabel_4_8;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_4_9;
	private JLabel lblNewLabel_4_10;
	private JLabel lblNewLabel_4_11;
	private JLabel lblNewLabel_4_12;

	/*
	 * DB Variable
	 */

	final String ID = "wyoung10";
	final String PW = "COSC*nv8kr";
	final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/" + ID + "db";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found " + e);
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGUI window = new MyGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					System.out.println("Error when creating connection ");
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 810, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 794, 460);
		frame.getContentPane().add(layeredPane);

		pnlTables = new JPanel();
		pnlTables.setBackground(Color.GRAY);
		pnlTables.setBounds(0, 0, 794, 460);
		layeredPane.add(pnlTables);

		btnHome_1 = new JButton("Home");
		btnHome_1.setBounds(696, 11, 88, 31);
		btnHome_1.setBackground(new Color(255, 255, 204));
		btnHome_1.setForeground(new Color(153, 0, 51));
		btnHome_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnHome_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_Screen(pnlHome);
			}
		});
		pnlTables.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("Table 1");
		lblNewLabel_4.setForeground(new Color(255, 250, 205));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4.setBounds(67, 69, 76, 14);
		pnlTables.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("Table 2");
		lblNewLabel_4_1.setForeground(new Color(255, 250, 205));
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(210, 69, 76, 14);
		pnlTables.add(lblNewLabel_4_1);

		JLabel lblNewLabel_4_2 = new JLabel("Table 3");
		lblNewLabel_4_2.setForeground(new Color(255, 250, 205));
		lblNewLabel_4_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(362, 69, 76, 14);
		pnlTables.add(lblNewLabel_4_2);

		lblNewLabel_4_3 = new JLabel("Table 4");
		lblNewLabel_4_3.setForeground(new Color(255, 250, 205));
		lblNewLabel_4_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4_3.setBounds(500, 69, 76, 14);
		pnlTables.add(lblNewLabel_4_3);

		lblNewLabel_4_4 = new JLabel("Table 5");
		lblNewLabel_4_4.setForeground(new Color(255, 250, 205));
		lblNewLabel_4_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4_4.setBounds(639, 69, 76, 14);
		pnlTables.add(lblNewLabel_4_4);
		pnlTables.add(btnHome_1);

		lblNewLabel_3 = new JLabel("Tables");
		lblNewLabel_3.setBounds(327, 23, 140, 41);
		lblNewLabel_3.setForeground(new Color(255, 255, 204));
		lblNewLabel_3.setFont(new Font("Lucida Handwriting", Font.BOLD, 32));
		pnlTables.add(lblNewLabel_3);

		layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(57, 85, 76, 61);
		pnlTables.add(layeredPane_2);

		pnlTble1E = new JPanel();
		pnlTble1E.setBackground(Color.GREEN);
		pnlTble1E.setBounds(0, 0, 76, 61);
		layeredPane_2.add(pnlTble1E);

		JButton btnNewButton = new JButton("Empty");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table1(pnlTbl1F);
			}
		});
		pnlTble1E.add(btnNewButton);

		pnlTbl1F = new JPanel();
		pnlTbl1F.setBackground(Color.RED);
		pnlTbl1F.setBounds(0, 0, 76, 61);
		layeredPane_2.add(pnlTbl1F);

		btnNewButton_1 = new JButton("Full");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table1(pnlTble1E);
			}
		});
		pnlTbl1F.add(btnNewButton_1);

		layeredPane_3 = new JLayeredPane();
		layeredPane_3.setBounds(200, 85, 76, 61);
		pnlTables.add(layeredPane_3);

		pnlTbl2E = new JPanel();
		pnlTbl2E.setBackground(Color.GREEN);
		pnlTbl2E.setBounds(0, 0, 76, 61);
		layeredPane_3.add(pnlTbl2E);

		btnNewButton_2 = new JButton("Empty");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table2(pnlTbl2F);
			}
		});
		pnlTbl2E.add(btnNewButton_2);

		pnlTbl2F = new JPanel();
		pnlTbl2F.setBackground(Color.RED);
		pnlTbl2F.setBounds(0, 0, 76, 61);
		layeredPane_3.add(pnlTbl2F);

		btnNewButton_3 = new JButton("Full");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table2(pnlTbl2E);
			}
		});
		pnlTbl2F.add(btnNewButton_3);

		layeredPane_4 = new JLayeredPane();
		layeredPane_4.setBounds(350, 85, 76, 61);
		pnlTables.add(layeredPane_4);

		pnlTbl3E = new JPanel();
		pnlTbl3E.setBackground(Color.GREEN);
		pnlTbl3E.setBounds(0, 0, 76, 61);
		layeredPane_4.add(pnlTbl3E);

		btnNewButton_4 = new JButton("Empty");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table3(pnlTbl3F);
			}
		});
		pnlTbl3E.add(btnNewButton_4);

		pnlTbl3F = new JPanel();
		pnlTbl3F.setBackground(Color.RED);
		pnlTbl3F.setBounds(0, 0, 76, 61);
		layeredPane_4.add(pnlTbl3F);

		btnNewButton_5 = new JButton("Full");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table3(pnlTbl3E);
			}
		});
		pnlTbl3F.add(btnNewButton_5);

		layeredPane_5 = new JLayeredPane();
		layeredPane_5.setBounds(490, 85, 76, 61);
		pnlTables.add(layeredPane_5);

		pnlTbl4E = new JPanel();
		pnlTbl4E.setBackground(Color.GREEN);
		pnlTbl4E.setBounds(0, 0, 76, 61);
		layeredPane_5.add(pnlTbl4E);

		btnNewButton_6 = new JButton("Empty");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table4(pnlTbl4F);
			}
		});
		pnlTbl4E.add(btnNewButton_6);

		pnlTbl4F = new JPanel();
		pnlTbl4F.setBackground(Color.RED);
		pnlTbl4F.setBounds(0, 0, 76, 61);
		layeredPane_5.add(pnlTbl4F);

		btnNewButton_7 = new JButton("Full");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table4(pnlTbl4E);
			}
		});
		pnlTbl4F.add(btnNewButton_7);

		layeredPane_6 = new JLayeredPane();
		layeredPane_6.setBounds(635, 85, 76, 61);
		pnlTables.add(layeredPane_6);

		pnlTbl5E = new JPanel();
		pnlTbl5E.setBackground(Color.GREEN);
		pnlTbl5E.setBounds(0, 0, 76, 61);
		layeredPane_6.add(pnlTbl5E);

		btnNewButton_8 = new JButton("Empty");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table5(pnlTbl5F);
			}
		});
		pnlTbl5E.add(btnNewButton_8);

		pnlTbl5F = new JPanel();
		pnlTbl5F.setBackground(Color.RED);
		pnlTbl5F.setBounds(0, 0, 76, 61);
		layeredPane_6.add(pnlTbl5F);

		btnNewButton_9 = new JButton("Full");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table5(pnlTbl5E);
			}
		});
		pnlTbl5F.add(btnNewButton_9);

		layeredPane_7 = new JLayeredPane();
		layeredPane_7.setBounds(57, 207, 76, 61);
		pnlTables.add(layeredPane_7);

		pnlTbl6E = new JPanel();
		pnlTbl6E.setBackground(Color.GREEN);
		pnlTbl6E.setBounds(0, 0, 76, 61);
		layeredPane_7.add(pnlTbl6E);

		btnNewButton_10 = new JButton("Empty");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table6(pnlTbl6F);
			}
		});
		pnlTbl6E.add(btnNewButton_10);

		pnlTbl6F = new JPanel();
		pnlTbl6F.setBackground(Color.RED);
		pnlTbl6F.setBounds(0, 0, 76, 61);
		layeredPane_7.add(pnlTbl6F);

		btnNewButton_11 = new JButton("Full");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table6(pnlTbl6E);
			}
		});
		pnlTbl6F.add(btnNewButton_11);

		layeredPane_8 = new JLayeredPane();
		layeredPane_8.setBounds(200, 207, 76, 61);
		pnlTables.add(layeredPane_8);

		pnlTbl7E = new JPanel();
		pnlTbl7E.setBackground(Color.GREEN);
		pnlTbl7E.setBounds(0, 0, 76, 61);
		layeredPane_8.add(pnlTbl7E);

		btnNewButton_12 = new JButton("Empty");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table7(pnlTbl7F);
			}
		});
		pnlTbl7E.add(btnNewButton_12);

		pnlTbl7F = new JPanel();
		pnlTbl7F.setBackground(Color.RED);
		pnlTbl7F.setBounds(0, 0, 76, 61);
		layeredPane_8.add(pnlTbl7F);

		btnNewButton_13 = new JButton("Full");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table7(pnlTbl7E);
			}
		});
		pnlTbl7F.add(btnNewButton_13);

		layeredPane_9 = new JLayeredPane();
		layeredPane_9.setBounds(350, 207, 76, 61);
		pnlTables.add(layeredPane_9);

		pnlTbl8E = new JPanel();
		pnlTbl8E.setBackground(Color.GREEN);
		pnlTbl8E.setBounds(0, 0, 76, 61);
		layeredPane_9.add(pnlTbl8E);

		btnNewButton_14 = new JButton("Empty");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table8(pnlTbl8F);
			}
		});
		pnlTbl8E.add(btnNewButton_14);

		pnlTbl8F = new JPanel();
		pnlTbl8F.setBackground(Color.RED);
		pnlTbl8F.setBounds(0, 0, 76, 61);
		layeredPane_9.add(pnlTbl8F);

		btnNewButton_15 = new JButton("Full");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table8(pnlTbl8E);
			}
		});
		pnlTbl8F.add(btnNewButton_15);

		layeredPane_10 = new JLayeredPane();
		layeredPane_10.setBounds(490, 207, 76, 61);
		pnlTables.add(layeredPane_10);

		pnlTbl9E = new JPanel();
		pnlTbl9E.setBackground(Color.GREEN);
		pnlTbl9E.setBounds(0, 0, 76, 61);
		layeredPane_10.add(pnlTbl9E);

		btnNewButton_16 = new JButton("Empty");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table9(pnlTbl9F);
			}
		});
		pnlTbl9E.add(btnNewButton_16);

		pnlTbl9F = new JPanel();
		pnlTbl9F.setBackground(Color.RED);
		pnlTbl9F.setBounds(0, 0, 76, 61);
		layeredPane_10.add(pnlTbl9F);

		btnNewButton_17 = new JButton("Full");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table9(pnlTbl9E);
			}
		});
		pnlTbl9F.add(btnNewButton_17);

		layeredPane_11 = new JLayeredPane();
		layeredPane_11.setBounds(635, 207, 76, 61);
		pnlTables.add(layeredPane_11);

		pnlTbl10E = new JPanel();
		pnlTbl10E.setBackground(Color.GREEN);
		pnlTbl10E.setBounds(0, 0, 76, 61);
		layeredPane_11.add(pnlTbl10E);

		btnNewButton_18 = new JButton("Empty");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table10(pnlTbl10F);
			}
		});
		pnlTbl10E.add(btnNewButton_18);

		pnlTbl10F = new JPanel();
		pnlTbl10F.setBackground(Color.RED);
		pnlTbl10F.setBounds(0, 0, 76, 61);
		layeredPane_11.add(pnlTbl10F);

		btnNewButton_19 = new JButton("Full");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table10(pnlTbl10E);
			}
		});
		pnlTbl10F.add(btnNewButton_19);

		layeredPane_12 = new JLayeredPane();
		layeredPane_12.setBounds(57, 336, 76, 61);
		pnlTables.add(layeredPane_12);

		pnlTbl11E = new JPanel();
		pnlTbl11E.setBackground(Color.GREEN);
		pnlTbl11E.setBounds(0, 0, 76, 61);
		layeredPane_12.add(pnlTbl11E);

		btnNewButton_20 = new JButton("Empty");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table11(pnlTbl11F);
			}
		});
		pnlTbl11E.add(btnNewButton_20);

		pnlTbl11F = new JPanel();
		pnlTbl11F.setBackground(Color.RED);
		pnlTbl11F.setBounds(0, 0, 76, 61);
		layeredPane_12.add(pnlTbl11F);

		btnNewButton_21 = new JButton("Full");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table11(pnlTbl11E);
			}
		});
		pnlTbl11F.add(btnNewButton_21);

		layeredPane_13 = new JLayeredPane();
		layeredPane_13.setBounds(200, 336, 76, 61);
		pnlTables.add(layeredPane_13);

		pnlTbl12E = new JPanel();
		pnlTbl12E.setBackground(Color.GREEN);
		pnlTbl12E.setBounds(0, 0, 76, 61);
		layeredPane_13.add(pnlTbl12E);

		btnNewButton_22 = new JButton("Empty");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table12(pnlTbl12F);
			}
		});
		pnlTbl12E.add(btnNewButton_22);

		pnlTbl12F = new JPanel();
		pnlTbl12F.setBackground(Color.RED);
		pnlTbl12F.setBounds(0, 0, 76, 61);
		layeredPane_13.add(pnlTbl12F);

		btnNewButton_23 = new JButton("Full");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table12(pnlTbl12E);
			}
		});
		pnlTbl12F.add(btnNewButton_23);

		layeredPane_14 = new JLayeredPane();
		layeredPane_14.setBounds(350, 336, 76, 61);
		pnlTables.add(layeredPane_14);

		pnlTbl13E = new JPanel();
		pnlTbl13E.setBackground(Color.GREEN);
		pnlTbl13E.setBounds(0, 0, 76, 61);
		layeredPane_14.add(pnlTbl13E);

		btnNewButton_24 = new JButton("Empty");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table13(pnlTbl13F);
			}
		});
		pnlTbl13E.add(btnNewButton_24);

		pnlTbl13F = new JPanel();
		pnlTbl13F.setBackground(Color.RED);
		pnlTbl13F.setBounds(0, 0, 76, 61);
		layeredPane_14.add(pnlTbl13F);

		btnNewButton_25 = new JButton("Full");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table13(pnlTbl13E);
			}
		});
		pnlTbl13F.add(btnNewButton_25);

		layeredPane_15 = new JLayeredPane();
		layeredPane_15.setBounds(490, 336, 76, 61);
		pnlTables.add(layeredPane_15);

		pnlTbl14E = new JPanel();
		pnlTbl14E.setBackground(Color.GREEN);
		pnlTbl14E.setBounds(0, 0, 76, 61);
		layeredPane_15.add(pnlTbl14E);

		btnNewButton_26 = new JButton("Empty");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table14(pnlTbl14F);
			}
		});
		pnlTbl14E.add(btnNewButton_26);

		pnlTbl14F = new JPanel();
		pnlTbl14F.setBackground(Color.RED);
		pnlTbl14F.setBounds(0, 0, 76, 61);
		layeredPane_15.add(pnlTbl14F);

		btnNewButton_27 = new JButton("Full");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table14(pnlTbl14E);
			}
		});
		pnlTbl14F.add(btnNewButton_27);

		layeredPane_16 = new JLayeredPane();
		layeredPane_16.setBounds(635, 336, 76, 61);
		pnlTables.add(layeredPane_16);

		pnlTbl15E = new JPanel();
		pnlTbl15E.setBackground(Color.GREEN);
		pnlTbl15E.setBounds(0, 0, 76, 61);
		layeredPane_16.add(pnlTbl15E);

		btnNewButton_28 = new JButton("Empty");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table15(pnlTbl15F);
			}
		});
		pnlTbl15E.add(btnNewButton_28);

		pnlTbl15F = new JPanel();
		pnlTbl15F.setBackground(Color.RED);
		pnlTbl15F.setBounds(0, 0, 76, 61);
		layeredPane_16.add(pnlTbl15F);

		btnNewButton_29 = new JButton("Full");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_table15(pnlTbl15E);
			}
		});
		pnlTbl15F.add(btnNewButton_29);

		lblNewLabel_5 = new JLabel("Table 6");
		lblNewLabel_5.setForeground(new Color(255, 250, 205));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_5.setBounds(67, 190, 76, 14);
		pnlTables.add(lblNewLabel_5);

		lblNewLabel_4_5 = new JLabel("Table 7");
		lblNewLabel_4_5.setForeground(new Color(255, 250, 205));
		lblNewLabel_4_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4_5.setBounds(210, 190, 76, 14);
		pnlTables.add(lblNewLabel_4_5);

		lblNewLabel_4_6 = new JLabel("Table 8");
		lblNewLabel_4_6.setForeground(new Color(255, 250, 205));
		lblNewLabel_4_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4_6.setBounds(362, 190, 76, 14);
		pnlTables.add(lblNewLabel_4_6);

		lblNewLabel_4_7 = new JLabel("Table 9");
		lblNewLabel_4_7.setForeground(new Color(255, 250, 205));
		lblNewLabel_4_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4_7.setBounds(500, 190, 76, 14);
		pnlTables.add(lblNewLabel_4_7);

		lblNewLabel_4_8 = new JLabel("Table 10");
		lblNewLabel_4_8.setForeground(new Color(255, 250, 205));
		lblNewLabel_4_8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4_8.setBounds(639, 190, 76, 14);
		pnlTables.add(lblNewLabel_4_8);

		lblNewLabel_6 = new JLabel("Table 11");
		lblNewLabel_6.setForeground(new Color(255, 250, 205));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_6.setBounds(62, 319, 76, 14);
		pnlTables.add(lblNewLabel_6);

		lblNewLabel_4_9 = new JLabel("Table 12");
		lblNewLabel_4_9.setForeground(new Color(255, 250, 205));
		lblNewLabel_4_9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4_9.setBounds(205, 319, 76, 14);
		pnlTables.add(lblNewLabel_4_9);

		lblNewLabel_4_10 = new JLabel("Table 13");
		lblNewLabel_4_10.setForeground(new Color(255, 250, 205));
		lblNewLabel_4_10.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4_10.setBounds(355, 319, 76, 14);
		pnlTables.add(lblNewLabel_4_10);

		lblNewLabel_4_11 = new JLabel("Table 14");
		lblNewLabel_4_11.setForeground(new Color(255, 250, 205));
		lblNewLabel_4_11.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4_11.setBounds(495, 319, 76, 14);
		pnlTables.add(lblNewLabel_4_11);

		lblNewLabel_4_12 = new JLabel("Table 15");
		lblNewLabel_4_12.setForeground(new Color(255, 250, 205));
		lblNewLabel_4_12.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4_12.setBounds(639, 319, 76, 14);
		pnlTables.add(lblNewLabel_4_12);

		pnlInventory = new JPanel();
		pnlInventory.setBackground(Color.GRAY);
		pnlInventory.setBounds(0, 0, 794, 460);
		layeredPane.add(pnlInventory);
		pnlInventory.setLayout(null);

		btnHome_2 = new JButton("Home");
		btnHome_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnHome_2.setForeground(new Color(153, 0, 51));
		btnHome_2.setBackground(new Color(255, 255, 204));
		btnHome_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_Screen(pnlHome);
			}
		});
		btnHome_2.setBounds(696, 11, 88, 31);
		pnlInventory.add(btnHome_2);

		pnlTickets = new JPanel();
		pnlTickets.setBackground(Color.GRAY);
		pnlTickets.setBounds(0, 0, 794, 460);
		layeredPane.add(pnlTickets);
		pnlTickets.setLayout(null);

		btnHome_3 = new JButton("Home");
		btnHome_3.setForeground(new Color(153, 0, 51));
		btnHome_3.setBackground(new Color(255, 255, 204));
		btnHome_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnHome_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_Screen(pnlHome);
			}
		});
		btnHome_3.setBounds(696, 11, 88, 31);
		pnlTickets.add(btnHome_3);

		/*
		 * Employee section
		 */

		//
		String employeeID = "4571001";

		pnlEmployee = new JPanel();
		pnlEmployee.setBackground(Color.GRAY);
		pnlEmployee.setBounds(0, 0, 794, 460);
		layeredPane.add(pnlEmployee);
		pnlEmployee.setLayout(null);

		btnHome = new JButton("Home");
		btnHome.setForeground(new Color(153, 0, 51));
		btnHome.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnHome.setBackground(new Color(255, 255, 204));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_Screen(pnlHome);
			}
		});
		btnHome.setBounds(696, 11, 88, 31);
		pnlEmployee.add(btnHome);

		JLabel lblHireDate = new JLabel("Employee ID:");
		lblHireDate.setForeground(new Color(255, 255, 204));
		lblHireDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHireDate.setBounds(178, 100, 122, 43);
		pnlEmployee.add(lblHireDate);

		JLabel lblWage = new JLabel("Name:");
		lblWage.setBackground(new Color(255, 255, 255));
		lblWage.setForeground(new Color(255, 255, 204));
		lblWage.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWage.setBounds(178, 167, 97, 43);
		pnlEmployee.add(lblWage);

		JLabel lblName = new JLabel("Age:");
		lblName.setForeground(new Color(255, 255, 204));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(178, 234, 97, 43);
		pnlEmployee.add(lblName);

		JLabel lblAge = new JLabel("Wage:");
		lblAge.setForeground(new Color(255, 255, 204));
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAge.setBounds(178, 301, 97, 43);
		pnlEmployee.add(lblAge);

		JLabel lblEmployeeID = new JLabel("Hire Date:");
		lblEmployeeID.setForeground(new Color(255, 255, 204));
		lblEmployeeID.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmployeeID.setBounds(178, 368, 122, 43);
		pnlEmployee.add(lblEmployeeID);

		JSeparator separator = new JSeparator();
		separator.setBounds(31, 355, 734, 2);
		pnlEmployee.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(31, 288, 734, 2);
		pnlEmployee.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(31, 221, 734, 2);
		pnlEmployee.add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(31, 154, 734, 2);
		pnlEmployee.add(separator_3);
		
		// Employee info fields 
		try {
			Connection con = DriverManager.getConnection(SERVER, ID, PW);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from wyoung10db.Mat_Employee where EmployeeID = " + employeeID);
			while (rs.next()) {
				String empId = rs.getString("EmployeeID");
				String fName = rs.getString("Fname");
				String lName = rs.getString("Lname");
				String age = rs.getString("Age");
				String wage = rs.getString("Wage");
				String date = rs.getString("HireDate");
				System.out.println(empId + ", " + fName + ", " + lName + ", " + age + ", " + wage + ", " + date);
				
				//Employee ID
				txtSjkdlad = new JTextField();
				txtSjkdlad.setHorizontalAlignment(SwingConstants.CENTER);
				txtSjkdlad.setForeground(new Color(153, 0, 51));
				txtSjkdlad.setBounds(361, 107, 177, 34);
				txtSjkdlad.setText(empId);
				pnlEmployee.add(txtSjkdlad);
				txtSjkdlad.setColumns(10);
				
				//Name
				textField_1 = new JTextField();
				textField_1.setForeground(new Color(153, 0, 51));
				textField_1.setColumns(10);
				textField_1.setBounds(361, 174, 177, 34);
				textField_1.setText(fName + " " + lName);
				pnlEmployee.add(textField_1);
				
				//Age
				textField_2 = new JTextField();
				textField_2.setForeground(new Color(153, 0, 51));
				textField_2.setColumns(10);
				textField_2.setBounds(361, 241, 177, 34);
				textField_2.setText(age);
				pnlEmployee.add(textField_2);

				//Wage
				textField_3 = new JTextField();
				textField_3.setForeground(new Color(153, 0, 51));
				textField_3.setColumns(10);
				textField_3.setBounds(361, 308, 177, 34);
				textField_3.setText(wage);
				pnlEmployee.add(textField_3);
				
				//Hire Date
				textField_4 = new JTextField();
				textField_4.setForeground(new Color(153, 0, 51));
				textField_4.setColumns(10);
				textField_4.setBounds(361, 375, 177, 34);
				textField_4.setText(date);
				pnlEmployee.add(textField_4);
				
				
			}
		} catch (SQLException e) {
			System.err.println("Error when doing query " + e);
		}
		

		lblNewLabel_2 = new JLabel("Employee");
		lblNewLabel_2.setForeground(new Color(255, 255, 204));
		lblNewLabel_2.setFont(new Font("Lucida Handwriting", Font.BOLD, 32));
		lblNewLabel_2.setBounds(316, 11, 183, 48);
		pnlEmployee.add(lblNewLabel_2);
	
		pnlHome = new JPanel();
		pnlHome.setBackground(Color.GRAY);
		pnlHome.setForeground(Color.WHITE);
		pnlHome.setBounds(0, 0, 794, 460);
		layeredPane.add(pnlHome);

		JButton btnEmployee = new JButton("Employee");
		btnEmployee.setBounds(71, 23, 103, 36);
		btnEmployee.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnEmployee.setForeground(new Color(153, 0, 51));
		btnEmployee.setBackground(new Color(255, 255, 204));
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_Screen(pnlEmployee);
			}
		});
		pnlHome.setLayout(null);
		pnlHome.add(btnEmployee);

		JButton btnTables = new JButton("Tables");
		btnTables.setBounds(244, 23, 103, 36);
		btnTables.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnTables.setForeground(new Color(153, 0, 51));
		btnTables.setBackground(new Color(255, 255, 204));
		btnTables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_Screen(pnlTables);
			}
		});
		pnlHome.add(btnTables);

		JButton btnInventory = new JButton("Inventory");
		btnInventory.setBounds(417, 23, 103, 36);
		btnInventory.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnInventory.setForeground(new Color(153, 0, 51));
		btnInventory.setBackground(new Color(255, 255, 204));
		btnInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_Screen(pnlInventory);
			}
		});
		pnlHome.add(btnInventory);

		JButton btnTickets = new JButton("Tickets");
		btnTickets.setBounds(587, 23, 103, 36);
		btnTickets.setForeground(new Color(153, 0, 51));
		btnTickets.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnTickets.setBackground(new Color(255, 255, 204));
		btnTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_Screen(pnlTickets);
			}
		});
		pnlHome.add(btnTickets);

		JButton btnLogOut = new JButton("LogOut");
		btnLogOut.setBounds(10, 413, 103, 36);
		btnLogOut.setBackground(new Color(255, 255, 204));
		btnLogOut.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLogOut.setForeground(new Color(153, 0, 51));
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		pnlHome.add(btnLogOut);
	}

	public void Switch_Screen(JPanel p) {
		layeredPane.removeAll();
		layeredPane.add(p);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	public void Switch_table1(JPanel p) {
		layeredPane_2.removeAll();
		layeredPane_2.add(p);
		layeredPane_2.repaint();
		layeredPane_2.revalidate();
	}

	public void Switch_table2(JPanel p) {
		layeredPane_3.removeAll();
		layeredPane_3.add(p);
		layeredPane_3.repaint();
		layeredPane_3.revalidate();
	}

	public void Switch_table3(JPanel p) {
		layeredPane_4.removeAll();
		layeredPane_4.add(p);
		layeredPane_4.repaint();
		layeredPane_4.revalidate();
	}

	public void Switch_table4(JPanel p) {
		layeredPane_5.removeAll();
		layeredPane_5.add(p);
		layeredPane_5.repaint();
		layeredPane_5.revalidate();
	}

	public void Switch_table5(JPanel p) {
		layeredPane_6.removeAll();
		layeredPane_6.add(p);
		layeredPane_6.repaint();
		layeredPane_6.revalidate();
	}

	public void Switch_table6(JPanel p) {
		layeredPane_7.removeAll();
		layeredPane_7.add(p);
		layeredPane_7.repaint();
		layeredPane_7.revalidate();
	}

	public void Switch_table7(JPanel p) {
		layeredPane_8.removeAll();
		layeredPane_8.add(p);
		layeredPane_8.repaint();
		layeredPane_8.revalidate();
	}

	public void Switch_table8(JPanel p) {
		layeredPane_9.removeAll();
		layeredPane_9.add(p);
		layeredPane_9.repaint();
		layeredPane_9.revalidate();
	}

	public void Switch_table9(JPanel p) {
		layeredPane_10.removeAll();
		layeredPane_10.add(p);
		layeredPane_10.repaint();
		layeredPane_10.revalidate();
	}

	public void Switch_table10(JPanel p) {
		layeredPane_11.removeAll();
		layeredPane_11.add(p);
		layeredPane_11.repaint();
		layeredPane_11.revalidate();
	}

	public void Switch_table11(JPanel p) {
		layeredPane_12.removeAll();
		layeredPane_12.add(p);
		layeredPane_12.repaint();
		layeredPane_12.revalidate();
	}

	public void Switch_table12(JPanel p) {
		layeredPane_13.removeAll();
		layeredPane_13.add(p);
		layeredPane_13.repaint();
		layeredPane_13.revalidate();
	}

	public void Switch_table13(JPanel p) {
		layeredPane_14.removeAll();
		layeredPane_14.add(p);
		layeredPane_14.repaint();
		layeredPane_14.revalidate();
	}

	public void Switch_table14(JPanel p) {
		layeredPane_15.removeAll();
		layeredPane_15.add(p);
		layeredPane_15.repaint();
		layeredPane_15.revalidate();
	}

	public void Switch_table15(JPanel p) {
		layeredPane_16.removeAll();
		layeredPane_16.add(p);
		layeredPane_16.repaint();
		layeredPane_16.revalidate();
	}
}