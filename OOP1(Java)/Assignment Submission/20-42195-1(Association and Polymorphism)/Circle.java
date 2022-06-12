import java.lang.*;

public class Circle extends Shape{
	
	private double radius;
	
	public void setRadius(double radius){
		
		this.radius=radius;
		
	}
	public double getRadius(){
		
		return radius;
		
	}
	
	public double area(){
		
		return 3.1416*radius*radius;
		
	}
	
	public void showDetails(){
		
		super.showDetails();
		System.out.println("Area: "+ area());
	}
}