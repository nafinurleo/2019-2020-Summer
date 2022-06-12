package classes.shapes;
import java.lang.*;
import classes.shapes.Shape;

public abstract class Shape{
    
    protected String typeOfShape;
    
    public abstract double area();
    
    public void setTypeOfShape(String typeOfShape){
		
        this.typeOfShape = typeOfShape;
    }
    
    public String getTypeOfShape(){
		
        return typeOfShape;
    }
    
    public abstract void showDetails();
    
}