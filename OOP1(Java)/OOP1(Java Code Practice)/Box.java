//class keyword and class name
//public keyword is optional
//if we use public keyword the file name.java has to be
//as same as class name
//class body starts and end with{}

public class Box{

	//within the class we can define instance variables
	// access modifiers dataType variable name
	private double length;
	private double width;
	private double height;
	
	//we want to keep track of how many box were created?
	public static int BoxCount;
	
	static{
		BoxCount=0;
	}
	
	
	
	
	//access_modifier returnType method_name(dataType parameter)
	public void setLength(double l){
	
	//setter method for setting values
		length = l;
	
	}
	public void setWidth(double w){
		width = w;
		}
	public void setHeight(double h){
		height = h;
		}
	//setting all the dimensions at once
	public void setDimension(double l, double w, double h){
		length = l;
		width = w;
		height = h;
	
	}
	
	//Getter Method for getting values
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	
	//get volume of the box
	public double getVolume(){
		return length*width*height;
		}
	
	public static void main(String [] args){
	
	//Now we have to create objects of Box class
	Box b1 = new Box();
	
	b1.setLength(5.5);//invoking the instance method
	b1.setWidth(4.5); 
	b1.setHeight(3.5);
	System.out.println("Volume = "+ b1.getVolume());
	
	Box b3 = new Box();
	System.out.println("Volume = "+ b3.getVolume());
	
	}
	
	}
	