
public class Dog extends Mammal {
	private boolean stupid;
	
	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
	}
	
	public Dog(String latinName, int gesationTime, boolean stupid, String friendlyName) {
		super(latinName, gesationTime);
		this.stupid = stupid;
		this.setFriendlyName(friendlyName);
	}
	
	public boolean isStupid() {
		return this.stupid;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		if(stupid) {
			return "The dog named " + this.getFriendlyName() + " lat: " + this.getLatinName() + 
					" nurses for " + Integer.toString(this.getGestationTime()) + " and is stupid";
		}
		return "The dog namnde" + this.getFriendlyName() + " lat: " + this.getLatinName() + 
				" nurses for " + Integer.toString(this.getGestationTime()) + " and is not stupid";
	}
}
