
/** The dog class describes features for a dog */
public class Dog extends Mammal {
	private boolean stupid;
	
	/**Creates a dog
	 * @param latinName is the Latin name of the dog
	 * @param gestationTime is the nursing for the dog
	 * @param stupid  is the dog stupid or not?
	 */
	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
	}
	
	/**Creates a dog
	 * @param latinName is the Latin name of the dog
	 * @param gestationTime is the nursing for the dog
	 * @param stupid  is the dog stupid or not?
	 * @param friendlyName the name of the dog
	 */
	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName) {
		super(latinName, gestationTime);
		this.stupid = stupid;
		this.setFriendlyName(friendlyName);
	}
	
	/**
	 * 
	 * @return	is the dog stupid or not?
	 */
	public boolean isStupid() {
		return this.stupid;
	}
	
	/* Checks if the dog is stupid or not and 
		returns the information about the dog */
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		if(this.stupid) {
			return "The dog named " + this.getFriendlyName() + " lat: " + this.getLatinName() + 
					" nurses for " + this.getGestationTime() + " and is stupid";
		}
		return "The dog named " + this.getFriendlyName() + " lat: " + this.getLatinName() + 
				" nurses for " + this.getGestationTime() + " and is not stupid";
	}
}
