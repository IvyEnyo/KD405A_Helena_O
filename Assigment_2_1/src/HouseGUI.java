import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;


public class HouseGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Makes a scrollePane and the text area
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 438, 266);
		contentPane.add(scrollPane);
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		// 3 houses
		House house1 = new House(2015, 200);
		House house2 = new House(1980, 900);
		House house3 = new House(1900, 2000);
		
		// Just for the console 
		System.out.println("Ett hus byggt " + house1.getYearBuilt() + " som är " + house1.getSize() + " kvm stort");
		System.out.println("Ett hus byggt " + house2.getYearBuilt() + " som är " + house2.getSize() + " kvm stort");
		System.out.println("Ett hus byggt " + house3.getYearBuilt() + " som är " + house3.getSize() + " kvm stort");
		
		// Prints 3 houses to text area
		textArea.setText("Uppgift 1.2");
		textArea.setText(textArea.getText()  + "\nEtt hus byggt " + house1.getYearBuilt() + " som är " + house1.getSize() + " kvm stort");
		textArea.setText(textArea.getText() + "\nEtt hus byggt " + house2.getYearBuilt() + " som är " + house2.getSize() + " kvm stort");
		textArea.setText(textArea.getText() + "\nEtt hus byggt " + house3.getYearBuilt() + " som är " + house3.getSize() + " kvm stort");
		
		// Array with 10 houses
		House[] myHouses = new House[10];
		myHouses[0] = new House(1997,500);
		myHouses[1] = new House(1989,222);
		myHouses[2] = new House(1987,150);
		myHouses[3] = new House(2001,790);
		myHouses[4] = new House(1885,1000);
		myHouses[5] = new House(1990,999);
		myHouses[6] = new House(1899,90);
		myHouses[7] = new House(2004,19);
		myHouses[8] = new House(2003,5);
		myHouses[9] = new House(2000,20);
		
		textArea.setText(textArea.getText() + "\nUppgift 1.3");
		
		// Prints myHouses
		for (int i = 0; i < myHouses.length; i++) {
			textArea.setText(textArea.getText()  + "\nEtt hus byggt " + myHouses[i].getYearBuilt() + " som är " + myHouses[i].getSize() + " kvm stort");
		}
		
		ArrayList<House> myNeighborhood = new ArrayList<House>();
		
		textArea.setText(textArea.getText() + "\nUppgift 1.4");
		
		Random randomGen = new Random();
		
		// Loops out 100 random houses into the Array list
		for (int i = 0; i < 100; i++) {
			
			int year = randomGen.nextInt(2015 - 1800) + 1800;
			int size = randomGen.nextInt(1000 - 10) + 10;
			
			myNeighborhood.add(new House(year, size));
		}
		// loops and prints 100 random houses.
		for (House house : myNeighborhood) {
			textArea.setText(textArea.getText()  + "\nEtt hus byggt " + house.getYearBuilt() + " som är " + house.getSize() + " kvm stort");
		}
		
	}
}

