import java.lang.*;

public class Inventory{
	
	private static int numberOfShapes=0;
	Shape shapes[];
	
	public Inventory(){
		
		numberOfShapes++;
		
	}
	
	public Inventory(int sizeOfInventory){
		
		this.shapes = new Shape[sizeOfInventory];
		
	}
	
	public void insertShape(Shape s){
		
		int flag = 0;
		for(int i=0; i<shapes.length; i++){
			
			if(shapes[i] == null)
			{
				shapes[i] = s;
				flag = 1;
				break;
			}
		}
		
		if(flag == 1){
			
			System.out.println("Inserted");
			
		}
			
		else{
			
			System.out.println("Can Not Insert");
			
		}
	}
	
	public void removeShape(Shape s){
		
		int flag =0;
		for(int i=0; i<shapes.length; i++){
			
			if(shapes[i] == s){
				
				shapes[i] = null;
				flag = 1;
				break;
			}
		}
		
		if(flag==1){
			
			System.out.println("Removed");
			
			}
			
		else{
			
			System.out.println("Can Not Remove");
			
			}
	}
	
	public void showAllShapes(){
		
		
		for(int i=0; i<shapes.length; i++){
			
			if(shapes[i] != null){
				
		
				
				numberOfShapes++;
				
				
				
				shapes[i].showDetails();
				System.out.println();
			}
		
		}
		
		System.out.println("Total Shapes:"+numberOfShapes);
		
	}
	
	 public void showShapesByType(String type){
		 
        int flag = 0;
        for(int i=0; i<shapes.length; i++){
			
            if(shapes[i].getTypeOfShape().equals(type)
				
			)
			
            {
                shapes[i].showDetails();
                flag = 1;
            }
        }
		
        if(flag == 1){
			
            System.out.println("Found");
        }
		
        else{    
		
            System.out.println("Not Found");
        }
	
}

}