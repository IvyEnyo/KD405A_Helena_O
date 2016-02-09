
/** The Animal Class  describes general features of animals */
public abstract class Animal {
	private String latinName;
	private String friendlyName;
	
	/** Creates a animal
	 * 
	 * @param LatinName the Latin name of the animal 
	 */ 
	public Animal(String latinName) {
		this.latinName = latinName; 
	}
	
	/** Abstract method for describing the animal
	 *  
	 * @return	String containing information about the animal
	 */
	public abstract String getInfo();
	
	/** 
	 * 
	 * @return	The Latin name
	 */
	public String getLatinName() {
		return this.latinName;
	}
	
	/** 
	 * 
	 * @param friendlyName The name of the animal
	 */
	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}
	
	/**
	 * 
	 * @return	The name of the animal
	 */
	public String getFriendlyName() {
		return this.friendlyName; 
	}

}
