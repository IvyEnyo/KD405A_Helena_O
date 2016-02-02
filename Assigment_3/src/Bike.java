
public class Bike {
	private String color;
	private int price;
	private int size; 
	
	public Bike (String color, int size) {
		this.color = color; 
		this.size = size; 
	}
	
	public Bike (String color, int size, int price) {
		this.color = color; 
		this.size = size; 	
		this.price = price; 
	}
	
	//Methods
	public String getColor() {
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