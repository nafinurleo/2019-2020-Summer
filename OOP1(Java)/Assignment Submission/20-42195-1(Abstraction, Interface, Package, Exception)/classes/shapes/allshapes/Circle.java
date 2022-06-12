package classes.shapes.allshapes;
import classes.shapes.Shape;

public class Circle extends Shape{
    
    private double radius;
    
    public Circle(){
		
        System.out.println("Circle");
    }
	
    public Circle(double radius){
		
        this.radius = radius;
    }
    
    public void setRadius(double radius){
		
        this.radius = radius;
    }
	
    public double getRadius(){
		
        return radius;
    }
	
	//Method Override
    public double area(){
		
        return 2* 3.14 * radius;
    }
    
	//Method Override
    public void showDetails(){
		
        System.out.println("Area: " +area());
    }
    
}