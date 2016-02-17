import java.util.Calendar;

public class ClockLogic {
	private DigitalClockGUI clockGUI; 
	private int alarmHour;
	private int alarmMinute; 
	
	public ClockLogic(DigitalClockGUI digitalClockGUI) {
		this.clockGUI = digitalClockGUI;
		ClockThread clockThread = new ClockThread();
		clockThread.start();
	}
	
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
			}
		}
	}
	
	public void setAlarm(int hours, int minute) {
		this.alarmHour = hours;
		this.alarmMinute = minute; 
	}
	
	public void clearAlarm() {
		// Some code
	}

}
