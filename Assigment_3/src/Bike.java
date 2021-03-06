
/** This the model class for a bike */
public class Bike {
	private String color;
	private int price;
	private int size;
	
	public Bike (String color, int size) {
		this.color = "Svart";	
		for (String s : Constants.COLORS){
			if (s.toLowerCase().equals(color.toLowerCase())){
				this.color = color;
			}
		}
		
		if (size < Constants.MIN_SIZE) {
			this.size = Constants.MIN_SIZE;
		} else if (size > Constants.MAX_SIZE) {
			this.size = Constants.MAX_SIZE;
		} else {
			this.size = size;
		}
	
	}
	
	/** Constructor with color, size and price parameters.
	 * @param color describes the color of the bike
	 * @param size the size of the bike
	 * @param price how much it costs
	 * */
	public Bike (String color, int size, int price) {
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
		
		this.color = "Svart";
		for (String s : Constants.COLORS){
			if (s.toLowerCase().equals(color.toLowerCase())){
				this.color = color;
			}
		}
		
	}
	
	/** Method to get color */
	public String getColor() {
		return color;
	}
	
	/** Method to get price */
	public int getPrice() {
		return price;
	}
	
	/** Method to get size */
	public int getSize() {
		return size;
	}
	/** Method that set the price */
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