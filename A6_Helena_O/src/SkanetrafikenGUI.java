import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class SkanetrafikenGUI extends JFrame {

	private JPanel contentPane;
	private JTextField TextFieldSearch;
	private JTextField textFieldTo;
	private JTextField textFieldFrom;
	private JButton btnStop;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;

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
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 488, 266);
		contentPane.add(panel);
		panel.setLayout(null);
		
		TextFieldSearch = new JTextField();
		TextFieldSearch.setBounds(6, 6, 186, 26);
		panel.add(TextFieldSearch);
		TextFieldSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Sök");
		btnSearch.setBounds(6, 44, 117, 29);
		panel.add(btnSearch);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 81, 186, 168);
		panel.add(scrollPane_1);
		
		JTextArea textAreaResualt = new JTextArea();
		scrollPane_1.setViewportView(textAreaResualt);
		
		textFieldTo = new JTextField();
		textFieldTo.setBounds(371, 6, 111, 26);
		panel.add(textFieldTo);
		textFieldTo.setColumns(10);
		
		textFieldFrom = new JTextField();
		textFieldFrom.setBounds(240, 6, 111, 26);
		panel.add(textFieldFrom);
		textFieldFrom.setColumns(10);
		
		btnStop = new JButton("Sökhållplats");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStop.setBounds(297, 44, 117, 29);
		panel.add(btnStop);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(240, 81, 232, 168);
		panel.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
