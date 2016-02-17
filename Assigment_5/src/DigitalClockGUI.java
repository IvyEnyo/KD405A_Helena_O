import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private ClockLogic clockLogic;
	private JLabel labelTime;
	private JLabel labelTimeActive;
	private JComboBox comboBoxMin;
	private JComboBox comboBoxHour;
	private int [] comboHour = new int [24];
	private	int [] comboMinute = new int[60];
	private String stringMinute; 
	private String stringHour;


	
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
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelTimeActive.setText("");
				clockLogic.clearAlarm();
			}
		});
		btnClear.setBounds(363, 165, 95, 29);
		contentPane.add(btnClear);
		
		JButton btnSet = new JButton("Set");
		btnSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelTimeActive.setText(comboBoxHour.getSelectedItem().toString() + ":" + comboBoxMin.getSelectedItem().toString());
				clockLogic.setAlarm(comboHour[comboBoxHour.getSelectedIndex()], comboMinute[comboBoxMin.getSelectedIndex()]);
			}
		});
		btnSet.setBounds(363, 72, 95, 29);
		contentPane.add(btnSet);
		
		
		comboBoxMin = new JComboBox();
		comboBoxMin.setBounds(413, 33, 69, 27);
		contentPane.add(comboBoxMin);
		comboBoxMin.setAlignmentX(RIGHT_ALIGNMENT);
		comboBoxMin.setMaximumRowCount(10);
		
		for (int i = 0; i <= 59; i++) {
			stringMinute = String.format("%02d", i);
			comboBoxMin.addItem(stringMinute);
			comboMinute[i] = i;
		}

		comboBoxHour = new JComboBox();
		comboBoxHour.setBounds(343, 33, 69, 27);
		contentPane.add(comboBoxHour);
		comboBoxHour.setAlignmentX(RIGHT_ALIGNMENT);
		comboBoxHour.setMaximumRowCount(10);
		
		for (int i = 0; i <= 23; i++) {
			stringHour = String.format("%02d", i);
			comboBoxHour.addItem(stringHour);
			comboHour[i] = i;
		}
		
		labelTime = new JLabel("");
		labelTime.setForeground(new Color(127, 255, 0));
		labelTime.setFont(new Font("OCR A Std", Font.PLAIN, 36));
		labelTime.setHorizontalAlignment(JLabel.CENTER);
		labelTime.setBorder(new BevelBorder(BevelBorder.LOWERED));
		labelTime.setBounds(40, 64, 258, 72);
		contentPane.add(labelTime);
		
		labelTimeActive = new JLabel("");
		labelTimeActive.setBackground(new Color(255, 0, 0));
		labelTimeActive.setBounds(360, 126, 98, 29);
		labelTimeActive.setForeground(new Color(225,0,0));
		contentPane.add(labelTimeActive);
		
		JLabel labelSetAlarm = new JLabel("");
		labelSetAlarm.setHorizontalAlignment(JLabel.CENTER);
		labelSetAlarm.setBorder(new TitledBorder("Alarm"));
		labelSetAlarm.setBounds(330, 6, 164, 108);
		contentPane.add(labelSetAlarm);
		
		JLabel labelActiveAlarm = new JLabel("");
		labelActiveAlarm.setBorder(new TitledBorder("alarm set"));
		labelActiveAlarm.setBounds(330, 113, 164, 89);
		contentPane.add(labelActiveAlarm);
		
		clockLogic = new ClockLogic(this);
	}
	
	public void setTimeOnLabel(String time) {
		labelTime.setText(time);
	}
	
	public void activateAlarm(boolean activate) { 
		if (activate) {
			Toolkit.getDefaultToolkit().beep();
		}
	
	}
}

