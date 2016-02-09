
public abstract class Animal {
	private String latinName;
	private String friendlyName;
	
	public Animal(String latinName) {
		this.latinName = latinName; 
	}
	
	public abstract String getInfo();
	
	public String getLatinName() {
		return this.latinName;
	}
	
	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}
	
	public String getFriendlyName() {
		return this.friendlyName; 
	}

}
