import java.lang.*;

public class Shape{
	
	private String typeOfShape;
	
	public void setTypeOfShape(String typeOfShape){
		
		this.typeOfShape=typeOfShape;
		
	}
	
	public String getTypeOfShape(){
		
		return typeOfShape;
		
	}
	public double area(){
		
		return 0;
		
	}
	public void showDetails(){
		
		System.out.println("Type Of Shape: "+ typeOfShape);
		
	}
	
}