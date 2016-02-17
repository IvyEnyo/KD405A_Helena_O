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
import java.awt.event.ActionListener;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private ClockLogic clockLogic;
	private JLabel labelTime;
	private JComboBox comboBoxMin;
	private JComboBox comboBoxHour;
	private int [] comboHour = {1,2,3,4,5,6,7,8,9,10};
	private	int [] comboMinute = {1,2,3,4,5,6};
	
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
				clockLogic.clearAlarm();
			}
		});
		btnClear.setBounds(363, 165, 95, 29);
		contentPane.add(btnClear);
		
		JButton btnSet = new JButton("Set");
		btnSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSet.setBounds(363, 72, 95, 29);
		contentPane.add(btnSet);
		
		
		comboBoxMin = new JComboBox();
		comboBoxMin.setBounds(413, 33, 69, 27);
		contentPane.add(comboBoxMin);
		comboBoxMin.setAlignmentX(RIGHT_ALIGNMENT);
		
		for (int i = 0; i < comboMinute.length; i++) {
			//System.out.println(comboMinute[i]+ "");
			String stringMinute = String.format("%02d", comboMinute[i]);
			comboBoxMin.addItem(stringMinute);
			comboBoxMin.setMaximumRowCount(6);
		}
		
		comboBoxHour = new JComboBox();
		comboBoxHour.setBounds(343, 33, 69, 27);
		contentPane.add(comboBoxHour);
		comboBoxHour.setAlignmentX(RIGHT_ALIGNMENT);
		
		for (int i = 0; i < comboHour.length; i++) {
			//System.out.println(comboHour[i] + "");
			String stringHour = String.format("%02d", comboHour[i]);
			comboBoxHour.addItem(stringHour);
			comboBoxHour.setMaximumRowCount(6);
		}
		
		labelTime = new JLabel("22:00");
		labelTime.setForeground(new Color(127, 255, 0));
		labelTime.setFont(new Font("OCR A Std", Font.PLAIN, 36));
		labelTime.setHorizontalAlignment(JLabel.CENTER);
		labelTime.setBorder(new BevelBorder(BevelBorder.LOWERED));
		labelTime.setBounds(40, 64, 258, 72);
		contentPane.add(labelTime);
		
		
		JLabel labelSetAlarm = new JLabel("");
		labelSetAlarm.setHorizontalAlignment(JLabel.CENTER);
		labelSetAlarm.setBorder(new TitledBorder("Alarm"));
		labelSetAlarm.setBounds(330, 6, 164, 108);
		contentPane.add(labelSetAlarm);
		
		JLabel labelActiveAlarm = new JLabel("");
		labelActiveAlarm.setBorder(new TitledBorder("alarm set"));
		labelActiveAlarm.setBounds(330, 113, 164, 89);
		contentPane.add(labelActiveAlarm);
		
		JLabel lableTimeActive = new JLabel("New label");
		lableTimeActive.setBounds(380, 137, 61, 16);
		contentPane.add(lableTimeActive);
		
		clockLogic = new ClockLogic(this);
	}
	
	public void setTimeOnLabel(String time) {
		labelTime.setText(time);
	}
	
	public void activateAlarm(boolean activate) {
		// Some code
	}
}
	
