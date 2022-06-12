//Java.lang Package
import java.lang.*;

public class Start{
	
	public static void main(String [] args){
		
		//Create Object
		Pizza p1 = new Pizza(700,"Neapolitan Pizza","20 Inch");
		p1.showDetails();
		
		Pizza p2 = new Pizza(950,"Chicago Pizza","25 Inch");
		p2.showDetails();
		
		System.out.println("\n ");
		
		Burger b1 = new Burger(250,"Buzz Burgers",20);
		b1.showDetails();
		
		Burger b2 = new Burger(450,"Burger Bistro",30);
		b2.showDetails();
		
	}
	
}