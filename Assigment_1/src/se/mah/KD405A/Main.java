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

public class Main extends JFrame {

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
		getContentPane().setBackground(new Color(255, 255, 255));
		setBackground(Color.BLACK);
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Axelsson, Maria", "Andersson, Lisa", "Fredriksson, Håkan "};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		list.setBounds(-1, 0, 113, 257);
		getContentPane().add(list);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		JMenuItem iMen = new JMenuItem("Arkiv");
		JMenuItem iMen1 = new JMenuItem("Medlem");
		JMenuItem iMen2 = new JMenuItem("Hjälp");
		
		setJMenuBar(menuBar);
		getJMenuBar().add(iMen);
		getJMenuBar().add(iMen1);
		getJMenuBar().add(iMen2);
	}
}
