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

public class Main extends JFrame {
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
		
	
		table = new JTable();
		table.setRowSelectionAllowed(5);
		table.setBounds(17, 6, 409, 233);
		
		
		
		getContentPane().add(table);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		
		
		JMenuBar mb = new JMenuBar();
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
