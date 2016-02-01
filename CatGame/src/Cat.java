
public class Cat {
	private String color = "gray"; 
	private String name = "non name";
	private int age = 0;
	private  static int MAX_AGE = 220; // age in months
	
	public Cat() {
		this.name = "knodden";
	}
	
	public Cat(String color, String name) {
		this.color = color; 
		this.name = name; 
	}
	
	public String getColor() {
		return this.color; 
	}
	
	public String getname() {
		return this.name; 
	}
	
	public void setAge(int age) {
		if (age >= 0 && age <= MAX_AGE){
			this.age = age; 
		}
	}
	
	public int getAge() {
		return this.age; 
	}
	
}
