import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setTitle("Alarm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClear = new JButton("clear");
		btnClear.setBounds(380, 162, 95, 29);
		contentPane.add(btnClear);
		
		JButton btnSet = new JButton("Set");
		btnSet.setBounds(380, 72, 95, 29);
		contentPane.add(btnSet);
		
		JComboBox comboBoxMin = new JComboBox();
		comboBoxMin.setBounds(430, 33, 52, 27);
		contentPane.add(comboBoxMin);
		
		JComboBox comboBoxHour = new JComboBox();
		comboBoxHour.setBounds(377, 33, 52, 27);
		contentPane.add(comboBoxHour);
		
		JLabel labelTime = new JLabel("");
		labelTime.setBorder(new BevelBorder(BevelBorder.LOWERED));
		labelTime.setBounds(64, 56, 258, 72);
		contentPane.add(labelTime);
		
		JLabel labelSetAlarm = new JLabel("");
		labelSetAlarm.setHorizontalAlignment(JLabel.CENTER);
		labelSetAlarm.setBorder(new TitledBorder("Alarm"));
		labelSetAlarm.setBounds(363, 6, 131, 108);
		contentPane.add(labelSetAlarm);
		
		JLabel labelActiveAlarm = new JLabel("");
		labelActiveAlarm.setBorder(new TitledBorder("alarm set"));
		labelActiveAlarm.setBounds(363, 113, 131, 89);
		contentPane.add(labelActiveAlarm);
		
		JLabel lableTimeActive = new JLabel("New label");
		lableTimeActive.setBounds(395, 137, 61, 16);
		contentPane.add(lableTimeActive);
	}
}
