
public abstract class Animal {
	private String latinName; 
	private String friendlyName; 
	
	public Animal(String latinName) {
		// Some code
	}
	
	/*public abstract String getInfo() {
		// Some code
	} */
	
	public String setFriendlyName(String friendlyName) {
		return this.friendlyName;
	}
	
	public String getFriendlyName() {
		return this.friendlyName; 
	}

}
