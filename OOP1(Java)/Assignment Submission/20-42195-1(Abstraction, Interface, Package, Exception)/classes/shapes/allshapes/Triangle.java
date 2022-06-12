package classes.shapes.allshapes;
import classes.shapes.Shape;

public class Triangle extends Shape{
    
    private double base;
    private double height;
    
    public Triangle(){
		
        System.out.println("Triangle");
    }
	
    public Triangle(double base, double height){
		
        this.base = base;
        this.height = height;
    }
    
    public void setBase(double base){
		
        this.base = base;
    }
    public void setHeight(double height){
		
        this.height = height;
    }
    
    public double getBase(){
		
        return base;
    }
    public double getHeight(){
		
        return height;
    }
    
	//Method Override
    public double area()
    {
        return 0.5 * base * height;
    }
    
	//Method Override
    public void showDetails(){
		
        System.out.println("Area: "+area());
    }
    
}