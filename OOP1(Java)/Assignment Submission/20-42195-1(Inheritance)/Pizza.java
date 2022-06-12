//Java.lang Package
import java.lang.*;

public class Pizza extends FoodItem{
	
	//access modifier,dataType,variable name
	private String size;
	
	//Empty Constructor
	public Pizza(){
		
		System.out.println("No Pizza");
		
	}
	
	//Parameterized Constructor
	public Pizza(double price, String name, String size){
		
		//Constructor Of Super Class
		super(price,name);
		this.size=size;
		System.out.println("\nPizza Price, Name & Size:- \n");
		
	}
	
	//Setter & Getter Method
	public void setSize(String size){
		
		this.size=size;
		
	}
	
	public String getSize(){
		
		return size;
		
	}
	
	//Details About Product
	public void showDetails(){
		
		System.out.println("Product Price: "+ getPrice());
		System.out.println("Product Name: "+ getName());
		System.out.println("Product Size: "+ getSize());
		
	}
	
}