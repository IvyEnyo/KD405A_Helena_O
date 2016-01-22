package se.mah.KD405A;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import java.awt.List;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.AbstractListModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Label;
import javax.swing.border.LineBorder;
import javax.swing.table.TableModel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import javax.swing.JTable;
import java.awt.Font;

public class Main extends JFrame {
	private static final Object[] ng = null;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		getContentPane().setBackground(new Color(0, 191, 255));
		setBackground(Color.BLACK);
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(null);
		
		

		String[] columns = new String[]{
				"Namn"
		};
		
		Object[][] data = new Object[][] {
			{"Malin Andersson"},
			{"Hannes Nilsson"},
			{"Mathias Nilsson"},
			{"Maria Olsson"},
			{"Sven Olofsson"},
			{"Johan Svensson"},
			{"Hanna Sigrudsson"},
			{"Sven Johansson"},
			{"Johanna Johansson"},
			{"Hannes Nilsson"},
			{"Hannes Nilsson"},
			{"Hannes Nilsson"},
			{"Hannes Nilsson"},
			{"Hannes Nilsson"},
			{"Hannes Nilsson"},
			{"Hannes Nilsson"},
			{"Hannes Nilsson"},
			{"Hannes Nilsson"},
			{"Hannes Nilsson"},
				
		};
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 132, 244);
		getContentPane().add(scrollPane);
		
	
		table = new JTable(data, columns);
		scrollPane.setViewportView(table);
		table.setShowHorizontalLines(true);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/helenaolsson/Documents/KD405A_Helena_O/Assigment_1/img/head.jpg"));
		lblNewLabel.setBounds(150, 6, 108, 120);
		getContentPane().add(lblNewLabel);
		
		JTextArea txtrMalinAndersson = new JTextArea();
		txtrMalinAndersson.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		txtrMalinAndersson.setText(" Malin Andersson\n 1987-05-04\n \n  Kontakt uppgifter\n  040-112233\n  Malin.Andersson@gmail.com\n");
		txtrMalinAndersson.setBounds(270, 117, 172, 120);
		getContentPane().add(txtrMalinAndersson);
		
		JButton btnNewButton = new JButton("Spara");
		btnNewButton.setBounds(150, 157, 117, 29);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ändra");
		btnNewButton_1.setBounds(150, 128, 117, 29);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/helenaolsson/Documents/KD405A_Helena_O/Assigment_1/img/malmo.png"));
		lblNewLabel_1.setBounds(366, 6, 78, 106);
		getContentPane().add(lblNewLabel_1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
	/*	table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
			int row = table.rowAtPoint(evt.getPoint());
			int col = table.columnAtPoint(evt.getPoint());
			if (row >= 0 && col >= 0) {

			}
}
			});
*/
		
		
		JMenuBar menuBar = new JMenuBar();
		JMenu iMen = new JMenu("Arkiv");
		JMenuItem printOut = new JMenuItem("skriv ut");
		JMenuItem cansle = new JMenuItem("avsluta");
		
		JMenu iMen1 = new JMenu("Medlem");
		JMenuItem newMember = new JMenuItem("Ny medlem");
		JMenuItem findMember = new JMenuItem("Hitta medlem");
		
		JMenu iMen2 = new JMenu("Hjälp");
		JMenuItem help = new JMenuItem("Hjälp");
		JMenuItem aboutProgram = new JMenuItem("Om programmet");
		
		setJMenuBar(new JMenuBar());
		getJMenuBar().add(iMen);
		iMen.add(printOut); iMen.add(cansle);
		getJMenuBar().add(iMen1);
		iMen1.add(newMember); iMen1.add(findMember);
		getJMenuBar().add(iMen2);
		iMen2.add(help); iMen2.add(aboutProgram);
		
	
		
		
		
		
}
}
