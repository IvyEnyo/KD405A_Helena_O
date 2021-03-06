import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;

public class AnimalGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setForeground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAnimals = new JLabel("Animals");
		lblAnimals.setForeground(new Color(0, 0, 0));
		lblAnimals.setBounds(6, 6, 60, 16);
		contentPane.add(lblAnimals);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 30, 438, 242);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		// Add the animals to the list. 
		ArrayList <Animal> myAnimals = new ArrayList<Animal>();
		myAnimals.add(new Dog("Dogus", 4, false, "kajsa"));
		myAnimals.add(new Cat("kattus", 5, 10));
		myAnimals.add(new Snake("Python", true));
		myAnimals.add(new Dog("Dogus", 3, true, "Fido"));
		myAnimals.add(new Cat("kattus de katt", 5, 35));
		myAnimals.add(new Snake("snokus", false));
		
		
		for(Animal anAnimal : myAnimals) {
			textArea.setText(textArea.getText() + anAnimal.getInfo() + "\n");
		}	
	}
}
