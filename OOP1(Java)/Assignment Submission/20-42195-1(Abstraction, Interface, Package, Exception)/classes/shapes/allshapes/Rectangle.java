package classes.shapes.allshapes;
import classes.shapes.Shape;

public class Rectangle extends Shape{
    
    private double length;
    private double width;
    
    public Rectangle(){
		
        System.out.println("Rectangle");
    }
	
    public Rectangle(double length, double width){
		
        this.length = length;
        this.width = width;
    }
    
    public void setLength(double length){
		
        this.length = length;
    }
    public void setWidth(double width){
		
        this.width = width;
    }
    
    public double getLength(){
		
        return length;
    }
    public double getWidth(){
		
        return width;
    }
    
	//Method Override
    public double area(){
		
        return length * width;
    }
    
	//Method Override
    public void showDetails(){
		
        System.out.println("Area: "+area());
    }
    
}