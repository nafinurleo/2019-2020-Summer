//Java.lang Package
import java.lang.*;

public class Burger extends FoodItem{
	
	//access modifier,dataType,variable name
	private int numberofPattis;
	
	//Empty Constructor
	public Burger(){
		
		System.out.println("No Burger");
		
	}
	
	//Parameterized Constructor
	public Burger(double price, String name, int numberofPattis){
		
		//Constructor Of Super Class
		super(price,name);
		this.numberofPattis=numberofPattis;
		System.out.println("\nBurger Price, Name & NumberOfPattis:- \n");
		
	}
	
	//Setter & Getter Method
	public void setNumberOfPattis(int numberofPattis){
		
		this.numberofPattis=numberofPattis;
		
	}
	
	public int getNumberOfPattis(){
		
		return numberofPattis;
		
	}
	
	//Details About Product
	public void showDetails(){
		
		System.out.println("Product Price: "+ getPrice());
		System.out.println("Product Name: "+ getName());
		System.out.println("Product NumberOfPattis: "+ getNumberOfPattis());
		
	}
	
}