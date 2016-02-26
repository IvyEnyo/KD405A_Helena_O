import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class SkanetrafikenGUI extends JFrame {

	public JPanel contentPane;
	public JTextField txtSearch;
	public JTextArea txtareaResult; 
	public JScrollPane scrollPane_1;
	public JTextArea txtToResult;
	public JTextField txtFieldFrom;
	public JTextField txtFieldTo;
	public JButton btnSearchStation;
	public String stationName;
	SkanetrafikenGUI gui = this;
	Parser p = new Parser();
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkanetrafikenGUI frame = new SkanetrafikenGUI();
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
	public SkanetrafikenGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(350, 64, 421, 401);
		contentPane.add(panel);
		panel.setLayout(null);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(38, 138, 360, 220);
		panel.add(scrollPane_2);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_2.setViewportView(scrollPane_1);
		
		txtToResult = new JTextArea();
		scrollPane_1.setRowHeaderView(txtToResult);
		
		txtFieldFrom = new JTextField();
		txtFieldFrom.setBounds(38, 68, 146, 26);
		panel.add(txtFieldFrom);
		txtFieldFrom.setColumns(10);
		
		txtFieldTo = new JTextField();
		txtFieldTo.setBounds(209, 68, 146, 26);
		panel.add(txtFieldTo);
		txtFieldTo.setColumns(10);
		
		btnSearchStation = new JButton("Search");
		btnSearchStation.setBounds(239, 97, 115, 29);
		btnSearchStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtToResult.setText("Searching");
				new j1().start();
				
			}
		});
		panel.add(btnSearchStation);
		
		JLabel lblNewLabel = new JLabel("Från");
		lblNewLabel.setBounds(38, 43, 69, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Till");
		lblNewLabel_1.setBounds(209, 36, 69, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultat");
		lblNewLabel_2.setBounds(38, 106, 69, 20);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(13, 46, 298, 401);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(6, 6, 190, 26);
		panel_1.add(txtSearch);
		txtSearch.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 87, 276, 223);
		panel_1.add(scrollPane);
		
		txtareaResult = new JTextArea();
		scrollPane.setViewportView(txtareaResult);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(15, 33, 115, 29);
		panel_1.add(btnSearch);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtareaResult.setText("Searching");
				/**Set text string first letter to uppercase*/
				stationName = gui.txtSearch.getText();
				stationName = stationName.substring(0,1).toUpperCase() + stationName.substring(1).toLowerCase();
				/**System.out.println(stationName);*/
				
				new j().start();
				
			}
		});
		
		
	}
	
	private class j extends Thread{
		@Override 
		public void run(){
			
			
			ArrayList<Station> searchStations = new ArrayList<Station>(); 
			searchStations.addAll(Parser.getStationsFromURL(stationName));
			txtareaResult.setText("");
			for (Station s: searchStations){
				/**System.out.println(s.getStationName() +" number:" +s.getStationNbr());*/
				if(s.getStationName().contains(stationName)){
					
				txtareaResult.append(s.getStationNbr() + " " + s.getStationName() + " " + s.getLatitude() + " " + s.getLongitude() + "\n");
				
				}
				
			}

			
		}
	}
	private class j1 extends Thread{
		@Override
		public void run(){
			String searchURL = Constants.getURL(txtFieldFrom.getText(),txtFieldTo.getText(),1); //Malmö C = 80000,  Lund C, 81216 Malmö Gatorg 80100, Hässleholm C 93070
			
			
			Journeys journeys = Parser.getJourneys(searchURL);
			txtToResult.setText("");
			for (Journey journey : journeys.getJourneys()) {
				txtToResult.append(journey.getStartStation()+" - ");
				txtToResult.append(journey.getEndStation().getStationName());
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
				txtToResult.append(" Departs " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. And it is "+journey.getDepTimeDeviation()+" min late");
			} 
		}
		}
	}