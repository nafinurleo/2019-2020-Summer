import java.lang.*;

public class Start{
	
	public static void main(String args[]){
		
		Inventory i = new Inventory(5);
		
		Shape s1 = new Shape();
		s1.setTypeOfShape("Shapes");
		
		Rectangle r1 = new Rectangle();
		r1.setTypeOfShape("Rectangle");
		r1.setLength(8.00);
		r1.setWidth(7.00);
		
		Triangle t1 = new Triangle();
		t1.setTypeOfShape("Triangle");
		t1.setBase(5.00);
		t1.setHeight(7.00);
		
		Circle c1 = new Circle();
		c1.setTypeOfShape("Circle");
		c1.setRadius(4.00);
		
		i.insertShape(s1);
        i.insertShape(r1);
        i.insertShape(t1);
        i.insertShape(c1);
		i.showAllShapes();
        
        i.removeShape(r1);
        i.insertShape(c1);
        
        i.showAllShapes();
		
	}
}