import java.util.ArrayList;
/** This a model class for a bike store that stores all bikes*/
public class BikeStore {
	private ArrayList<Bike> bikes = new ArrayList<Bike>();
	
	public String getAllBikes() {
		String _bikesString = new String();
		for (Bike _bike : bikes) {
			_bikesString = _bikesString + "Cykel nr " + (bikes.indexOf(_bike) + 1) + " Pris " + _bike.getPrice() + " Farg " + _bike.getColor() + " Storlek " + _bike.getSize() + "\n";
		}
		return _bikesString;
	}
	
	/** Add new bike to the store if user insert color, size and price */
	public void addBike(String color, int size, int price) {
		Bike bike = new Bike(color, size, price);
		this.bikes.add(bike);
	}
}
 