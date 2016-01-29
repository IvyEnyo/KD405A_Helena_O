import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JTextField textField = new JTextField();
		textField.setBounds(25, 17, 293, 45);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(75, 213, 95, 42);
		contentPane.add(button);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_1.setBounds(155, 166, 65, 47);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(90, 166, 65, 47);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(25, 166, 65, 47);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setBounds(155, 119, 65, 47);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setBounds(90, 119, 65, 47);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_6.setBounds(25, 119, 65, 47);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_7.setBounds(155, 72, 65, 47);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_8.setBounds(90, 72, 65, 47);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_9.setBounds(25, 72, 65, 47);
		contentPane.add(button_9);
		
		JButton btnMulti = new JButton("x");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMulti.setBounds(219, 72, 49, 67);
		contentPane.add(btnMulti);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setBounds(219, 146, 49, 67);
		contentPane.add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSub.setBounds(270, 72, 49, 67);
		contentPane.add(btnSub);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnequal.setBounds(270, 146, 49, 67);
		contentPane.add(btnequal);
	}
}
