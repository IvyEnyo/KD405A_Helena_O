import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Calculator myCalculator = new Calculator(); 
		
		textField = new JTextField();
		textField.setBounds(89, 30, 226, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(0);
				textField.setText(textField.getText() + "0");
			}
		});
		btn_0.setBounds(171, 224, 59, 48);
		contentPane.add(btn_0);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(1);
				textField.setText(textField.getText() + "1");
			}
		});
		btn_1.setBounds(235, 167, 59, 48);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(2);
				textField.setText(textField.getText() + "2");
			}
		});
		btn_2.setBounds(171, 167, 59, 48);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(3);
				textField.setText(textField.getText() + "3");
			}
		});
		btn_3.setBounds(108, 167, 59, 48);
		contentPane.add(btn_3);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(4);
				textField.setText(textField.getText() + "4");
			}
		});
		btn_4.setBounds(235, 118, 59, 48);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(5);
				textField.setText(textField.getText() + "5");
			}
		});
		btn_5.setBounds(171, 118, 59, 48);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(6);
				textField.setText(textField.getText() + "6");
			}
		});
		btn_6.setBounds(108, 118, 59, 48);
		contentPane.add(btn_6);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(7);
				textField.setText(textField.getText() + "7");
			}
		});
		btn_7.setBounds(235, 69, 59, 48);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(8);
				textField.setText(textField.getText() + "8");
			}
		});
		btn_8.setBounds(171, 69, 59, 48);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(9);
				textField.setText(textField.getText() + "9");
			}
		});
		btn_9.setBounds(108, 69, 59, 48);
		contentPane.add(btn_9);
		
		JButton btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.plus();
				textField.setText(textField.getText() + "+");
			}
		});
		btn_add.setBounds(327, 50, 70, 48);
		contentPane.add(btn_add);
		
		JButton btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.minus();
				textField.setText(textField.getText() + "-");
			}
		});
		btn_sub.setBounds(327, 101, 70, 48);
		contentPane.add(btn_sub);
		
		JButton btn_multi = new JButton("x");
		btn_multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.mult(); 
				textField.setText(textField.getText() + "x");
			}
		});
		btn_multi.setBounds(327, 161, 70, 48);
		contentPane.add(btn_multi);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				textField.setText(String.valueOf(myCalculator.getResult()));
			}
		});
		btn_equal.setBounds(245, 224, 70, 48);
		contentPane.add(btn_equal);
		
		JButton btn_clear = new JButton("C");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.clear();
				textField.setText("");
			}
		});
		btn_clear.setBounds(89, 224, 70, 48);
		contentPane.add(btn_clear);
	}
}
