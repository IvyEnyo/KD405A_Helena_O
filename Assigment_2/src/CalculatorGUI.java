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
import java.awt.Color;

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
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Calculator myCalculator = new Calculator(); 
		
		JTextField textField = new JTextField();
		textField.setBounds(25, 17, 293, 45);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "0");
				myCalculator.numberButtonPressed(0);
			}
		});
		
		button.setBounds(25, 214, 95, 42);
		contentPane.add(button);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "1");
				myCalculator.numberButtonPressed(1);
			}
		});
		
		button_1.setBounds(155, 166, 65, 47);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "2");
				myCalculator.numberButtonPressed(2);
			}
		});
		
		button_2.setBounds(90, 166, 65, 47);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() +"3");
				myCalculator.numberButtonPressed(3);
			}
		});
		
		button_3.setBounds(25, 166, 65, 47);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton(textField.getText() +"4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() +"4");
				myCalculator.numberButtonPressed(4);
			}
		});
		
		button_4.setBounds(155, 119, 65, 47);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "5");
				myCalculator.numberButtonPressed(5);
			}
		});
		
		button_5.setBounds(90, 119, 65, 47);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "6");
				myCalculator.numberButtonPressed(6);
			}
		});
		
		button_6.setBounds(25, 119, 65, 47);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton(textField.getText() + "7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "7");
				myCalculator.numberButtonPressed(7);
			}
		});
		
		button_7.setBounds(155, 72, 65, 47);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton(textField.getText() + "8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "8");
				myCalculator.numberButtonPressed(8);
			}
		});
		
		button_8.setBounds(90, 72, 65, 47);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "9");
				myCalculator.numberButtonPressed(9);
			}
		});
		
		button_9.setBounds(25, 72, 65, 47);
		contentPane.add(button_9);
		
		JButton btnMult = new JButton("x");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("x");
				myCalculator.mult();
			}
		});
		
		btnMult.setBounds(219, 72, 49, 67);
		contentPane.add(btnMult);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("+");
				myCalculator.add();
			}
		});
		
		btnAdd.setBounds(219, 146, 49, 67);
		contentPane.add(btnAdd);
		
		JButton btnSubst = new JButton("-");
		btnSubst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("-");
				myCalculator.subst();
			}
		});
		
		btnSubst.setBounds(270, 72, 49, 67);
		contentPane.add(btnSubst);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		
		btnequal.setBounds(270, 146, 49, 67);
		contentPane.add(btnequal);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				myCalculator.clear();
			}
		});
		
		btnClear.setBounds(125, 214, 95, 42);
		contentPane.add(btnClear);
		
	}
}
