/** The cat class describes the features of a cat */
public class Cat extends Mammal {
	private int numnberOfLifes; 
	
	/** Creates a cat 
	 * 
	 * @param latinName	the Latin name of the cat
	 * @param gestationTime the nursing time for the cat
	 * @param numberOfLifes the lives of the cat
	 */
	public Cat(String latinName, int gestationTime, int numberOfLifes) {
		super(latinName, gestationTime);
		this.numnberOfLifes = numberOfLifes;	
	}
	/**
	 * 
	 * @return	the lives of the cat
	 */
	public int getNumberOfLifes() {
		return this.numnberOfLifes;
	}
	
	/**
	 * 
	 * @param i	the lives of the cat
	 */
	public void setNumbersOfLifes(int i) {
		this.numnberOfLifes = i;
	}
	
	// Returns the information of the cat 
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "The cat named " + "Unknown " + " lat: " + this.getLatinName() + 
				" nurses for " + this.getGestationTime() + " and has " + this.numnberOfLifes + " lifes";
	}

}
