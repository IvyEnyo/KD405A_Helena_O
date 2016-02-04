
public class Bike {
	private String color;
	private int price;
	private int size;
	//private Constants constants;
	
	public Bike (String color, int size) {
		//constants = new Constants();
		this.color = color;
		
		if (size < Constants.MIN_SIZE) {
			this.size = Constants.MIN_SIZE;
		} else if (size > Constants.MAX_SIZE) {
			this.size = Constants.MAX_SIZE;
		} else {
			this.size = size;
		}
	
	}
	
	public Bike (String color, int size, int price) {
		//constants = new Constants();
		this.color = color; 
		
		if (size < Constants.MIN_SIZE) {
			this.size = Constants.MIN_SIZE;
		} else if (size > Constants.MAX_SIZE) {
			this.size = Constants.MAX_SIZE;
		} else {
			this.size = size;
		} 	
		
		if (price < Constants.MIN_PRICE) {
			this.price = Constants.MIN_PRICE;
		} else if (price > Constants.MAX_PRICE) {
			this.price = Constants.MAX_PRICE;
		} else {
			this.price = price; 
		}
	
	}
	
	//Methods
	public String getColor() {
		//constants.bikeColors
		return color;
	}
	
	public int getPrice() {
		return size;
	}
	
	public int getSize() {
		return price;
	}
	public void setPrice(int price) {
		if (price < Constants.MIN_PRICE) {
			this.price = Constants.MIN_PRICE;
		} else if (price > Constants.MAX_PRICE) {
			this.price = Constants.MAX_PRICE;
		} else {
			this.price = price; 
		}
	}
	
	
	
}