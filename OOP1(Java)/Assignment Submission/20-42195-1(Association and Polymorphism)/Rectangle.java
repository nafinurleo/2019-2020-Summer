import java.lang.*;

public class Rectangle extends Shape{
	
	private double length;
	private double width;
	
	public void setLength(double length){
		
		this.length=length;
		
	}
	public void setWidth(double width){
		
		this.width=width;
		
	}
	public double getLength(){
		
		return length;
		
	}
	public double getWidth(){
		
		return width;
		
	}
	
	public double area(){
		
		return length*width;
		
	}
	
	public void showDetails(){
		
		super.showDetails();
		System.out.println("Area: "+ area());
		
	}
	
}