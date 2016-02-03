import java.util.ArrayList;

public class BikeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bike> myBikes = new ArrayList<Bike>();
		myBikes.add(new Bike("Black", 2000, 15));
		myBikes.add(new Bike("Black", 2000, 15));
		myBikes.add(new Bike("Black", 2000, 15));
		myBikes.add(new Bike("Black", 2000, 15));
		myBikes.add(new Bike("Black", 2000, 15));
		myBikes.add(new Bike("Black", 2000, 15));
		myBikes.add(new Bike("Black", 2000, 15));
		myBikes.add(new Bike("Black", 2000, 15));
		myBikes.add(new Bike("Black", 2000, 15));
		myBikes.add(new Bike("Black", 2000, 15));
		
		for(Bike bike: myBikes) {
			System.out.println(myBikes);
		}
	}
}