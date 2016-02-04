import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BikeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField sizeField;
	private JTextField priceField;
	private JTextField colorField;
	private BikeStore bikeStore = new BikeStore();
	private JTextArea textArea = new JTextArea();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeGUI frame = new BikeGUI();
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
	public BikeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/* Button to add new bikes to the bike store */
		JButton btnNewBike = new JButton("Lägg till");
		btnNewBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bikeStore.addBike(colorField.getText(), Integer.parseInt(sizeField.getText()), Integer.parseInt(priceField.getText()));
				textArea.setText(bikeStore.getAllBikes());
			}
		});
		btnNewBike.setBounds(169, 224, 117, 29);
		contentPane.add(btnNewBike);
		
		/* Scroll pane around the text area */
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 438, 145);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(textArea);
		
		/* Bike all ready in the store */
		bikeStore.addBike("Svart", 28, 2500);
		bikeStore.addBike("Röd", 15, 4000);
		bikeStore.addBike("Röd", 10, 3020);
		bikeStore.addBike("Röd", 15, 500);
		bikeStore.addBike("Blå", 15, 6000);
		textArea.setText(bikeStore.getAllBikes());
		
		/* Settings for text field to add price */
		priceField = new JTextField();
		priceField.setText("Pris");
		priceField.setBounds(6, 186, 130, 26);
		contentPane.add(priceField);
		priceField.setColumns(10);
		
		/* Settings for text field to add color */
		sizeField = new JTextField();
		sizeField.setText("Storlek");
		sizeField.setBounds(301, 186, 130, 26);
		contentPane.add(sizeField);
		sizeField.setColumns(10);
		
		/* Settings for text field to add size */
		colorField = new JTextField();
		colorField.setText("Färg");
		colorField.setBounds(159, 186, 130, 26);
		contentPane.add(colorField);
		colorField.setColumns(10);
		
		
	}
}
