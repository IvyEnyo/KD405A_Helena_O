
public class Cat extends Mammal {
	private int numnberOfLifes; 
	
	public Cat(String latinName, int gestationTime, int numberOfLifes) {
		super(latinName, gestationTime);
		this.numnberOfLifes = numberOfLifes;	
	}
	
	public int getNumberOfLifes() {
		return this.numnberOfLifes;
	}
	
	public int setNumbersOfLifes(int i) {
		return this.numnberOfLifes;

	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
