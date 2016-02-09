/** The Mammal class describes features of a mammal */
public abstract class Mammal extends Animal{
	private int gestationTime; 
	
	/**Creates a mammal
	 * @param latinName the Latin name
	 * @param gestationTime the nursing time
	 */
	public Mammal(String latinName, int gestationTime) {
		super(latinName);
		this.gestationTime = gestationTime; 
	}
	
	/**
	 * 
	 * @return	the nursing time   
	 */ 
	public int getGestationTime() {
		return this.gestationTime;
	}

}
