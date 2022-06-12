import classes.Inventory;
import classes.shapes.allshapes.Circle;
import classes.shapes.allshapes.Rectangle;
import classes.shapes.allshapes.Triangle;
import java.util.Scanner;

public class Start{
	
    public static void main(String args[]){
		
		double a;
		double b;
		double c;
		double d;
		double f;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Set your length for Rectangle: ");
		a = sc.nextDouble();
		System.out.println("Set your width for Rectangle: ");
		b = sc.nextDouble();
		
		System.out.println("Set your base for Triangle: ");
		c = sc.nextDouble();
		System.out.println("Set your height for Triangle: ");
		d = sc.nextDouble();
		
		System.out.println("Set your radius for Circle: ");
		f = sc.nextDouble();
		
        Inventory i = new Inventory(5);
        
        Rectangle r1 = new Rectangle();
        r1.setTypeOfShape("Rectangle");
		
		//Exception Handling
		try{
			
			r1.setLength(a);
			r1.setWidth(b); 
		}
		catch(ArithmeticException ae){
			
			System.out.println("Arithmetic Exception for Rectangle");
			ae.printStackTrace();
		}
		catch(Exception e){
			
			System.out.println(e.getMessage());
		}
        finally{
			
			System.out.println("Exception handled for Rectangle");
		}
        
        Triangle t1 = new Triangle();
        t1.setTypeOfShape("Triangle");
		
		try{
			
			t1.setBase(c);
			t1.setHeight(d);
		}
		catch(ArithmeticException ae){
			
			System.out.println("Arithmetic Exception for Triangle");
			ae.printStackTrace();
		}
		catch(Exception e){
			
			System.out.println(e.getMessage());
		} 
		finally{
			
			System.out.println("Exception handled for Triangle");
		}
        
        Circle c1 = new Circle();
        c1.setTypeOfShape("Circle");
		
		try{
			
			c1.setRadius(f);
		}
		catch(ArithmeticException ae){
			
			System.out.println("Arithmetic Exception for Circle");
			ae.printStackTrace();
		}
		catch(Exception e){
			
			System.out.println(e.getMessage());
		} 
		finally{
			
			System.out.println("Exception handled for Cirle");
		}
        
        i.insertShape(r1);
        i.insertShape(t1);
        i.insertShape(c1);
		i.showAllShapes();
        
        i.removeShape(r1);
        i.insertShape(c1);
        
        i.showAllShapes();
        
   }
}    