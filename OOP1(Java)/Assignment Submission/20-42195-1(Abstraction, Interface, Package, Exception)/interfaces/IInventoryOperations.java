package interfaces;
import classes.shapes.Shape;

public interface IInventoryOperations{
	
    public abstract void insertShape(Shape s);
    void removeShape(Shape s);
    void showAllShapes();
}