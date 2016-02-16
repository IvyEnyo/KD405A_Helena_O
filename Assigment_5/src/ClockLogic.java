
public class ClockLogic {
	private ClockLogic clockGUI; 
	private int alarmHour;
	private int alarmMinute; 
	
	public ClockLogic(DigitalClockGUI digitalClockGUI) {
		
	}
	
	public void setAlarm(int hours, int minute) {
		this.alarmHour = hours; 
		this.alarmMinute = minute; 
	}
	
	public void clearAlarm() {
		// Some code
	}

}
