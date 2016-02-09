/** The snake class describes the features of the snake */
public class Snake extends Animal {
	private boolean poisonus; 
	
	/** Creates the snake
	 * @param latinName the Latin name of the snake
	 * @param poisnous is the snake poisonous?
	 */
	public Snake(String latinName, boolean poisonus) {
		super(latinName);
		this.poisonus = poisonus; 
	}
	
	/** 
	 * 
	 * @return	if the snake is poisonous or not?
	 */
	public boolean isPoisnous() {
		return this.poisonus;
	}

	/* Checks if the snake is poisonous or not and return
		the information */
	@Override
	public String getInfo() {
		if(poisonus) {
			return "The snake named " + "unknown " + " Lat: " + this.getLatinName() + " is poisnous";
		} else {
			return "The snake named " +  "unknown " + " Lat: " + this.getLatinName() + " is not poisnous";
		}
		
	}

}
