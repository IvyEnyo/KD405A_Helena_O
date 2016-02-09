
public abstract class Mammal extends Animal{
	private int gestationTime; 
	
	public Mammal(String latinName, int gestionTime) {
		super(latinName);
		this.gestationTime = gestationTime; 
	}
	
	public int getGestationTime() {
		return this.gestationTime;
	}

}
