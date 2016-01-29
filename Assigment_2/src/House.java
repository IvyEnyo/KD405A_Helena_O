
public class House {
	
	private int yearBuilt; 
	private int size; 
	private final int minSize = 10;
	private final int maxSize = 1000;
	
	public House(int yearBuilt, int size) {
		this.yearBuilt = yearBuilt;
		this.size = size;
	}
	
	public int getYearBuilt() {
		if (this.yearBuilt > 2015) {
			return 2015;
		} else if (this.yearBuilt < 1800) {
			return 1800;
		}
		return this.yearBuilt;
	}
	
	public int getSize() {
		if (this.size > maxSize) {
			return maxSize;
		} else if (this.size < minSize) {
			return minSize;
		}
		return size;
	}
}
