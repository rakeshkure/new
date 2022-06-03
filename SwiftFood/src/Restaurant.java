
public class Restaurant {
	public String restaurantName;
	public long restaurantContact;
	public String restaurantAddress;
	public float rating;
	public void displayRestaurantDetails() {
		System.out.println("Restaurant Details");
		System.out.println("*******************");
		System.out.println();
		System.out.println("Restaurant Name: "+restaurantName);
		System.out.println("Restaurant Rating: "+rating);
		System.out.println("Restaurant Contact: "+restaurantContact);
		System.out.println("Restaurant Address"+restaurantAddress);
		
		
	}
}
           class Tester {
	

	public static void main(String[] args) {
		
		Restaurant r=new Restaurant();
		r.restaurantName="McDonald's";
		r.rating=4.1f;
		r.restaurantContact=9988676767L;
		r.restaurantAddress="SH1109, Carolina Street, Springfield";
		r.displayRestaurantDetails();
		//update changes
		//asd
	}	
		
		

	}