
import java.util.Calendar;

public class ClockLogic {
	private DigitalClockGUI clockGUI; 
	private int alarmHour;
	private int alarmMinute; 
	private boolean alarmActive = false;
	
	/** defined the clockGUI and ClockTread, starts the thread */
	public ClockLogic(DigitalClockGUI digitalClockGUI) {
		this.clockGUI = digitalClockGUI;
		ClockThread clockThread = new ClockThread();
		clockThread.start();
	}
	
	/** This Class update the clock and checks if the alarm is equal to the clock.
	 * And if the alarm is equal, it calls for the activateAlarm method */
	private class ClockThread extends Thread {
		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {}
				Calendar cal = Calendar.getInstance();
				int hours = cal.get(Calendar.HOUR_OF_DAY);
				int minute = cal.get(Calendar.MINUTE);
				String hoursString = String.format("%02d", hours);
				String minuteString = String.format("%02d", minute);
				clockGUI.setTimeOnLabel(hoursString + ":" + minuteString);
				if (alarmHour == hours && alarmMinute == minute) {
					alarmActive = true;
				}
				clockGUI.activateAlarm(alarmActive);
			}
		}
	}
	
	/** Sets the alarm
	 * @param 	int hours 
	 * @param	int minute  */
	public void setAlarm(int hours, int minute) {
		this.alarmHour = hours;
		this.alarmMinute = minute;
	}
	
	/** Clear the alarm. The clock can never be -1 */
	public void clearAlarm() {
		alarmActive = false;
		this.alarmHour = -1;
		this.alarmMinute = -1;
	}

}
