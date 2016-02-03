
public class Bike {
	private String color;
	private int price;
	private int size;
	private Constants constants;
	
	public Bike (String color, int size) {
		constants = new Constants();
		this.color = color;
		this.size = size;
	}
	
	public Bike (String color, int size, int price) {
		constants = new Constants();
		this.color = color; 
		this.size = size; 	
		this.price = price; 
	}
	
	//Methods
	public String getColor() {
		//constants.bikeColors
		return this.color;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getSize() {
		return this.price;
	}
	public void setPrice(int price) {
		//code
	}
	
	
	
}