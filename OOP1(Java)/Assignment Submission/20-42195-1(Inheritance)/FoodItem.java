//Java.lang Package
import java.lang.*;

public class FoodItem{
	
	//access modifier,dataType,variable name
	protected double price;
	protected String name;
	
	//Empty Constructor
	public FoodItem(){
		
		System.out.println("No FoodItem");
		
	}
	
	//Parameterized Constructor
	public FoodItem(double price, String name){
		
		this.price=price;
		this.name=name;
		
	}
	
	//Setter & Getter Method
	public void setPrice(double price){
		
		this.price=price;
		
	}
	
	public void setName(String name){
		
		this.name=name;
		
	}
	
	public double getPrice(){
		
		return price;
		
	}
	
	public String getName(){
		
		return name;
		
	}
	
	//Details About Product
	public void showDetails(){
		
		System.out.println("Product Details");
		
	}
	
}