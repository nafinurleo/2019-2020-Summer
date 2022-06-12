public class StudentClass{
	
	private String name;
	private int id;
	private double cgpa;
	
	public StudentClass(){
		System.out.println("I am Nafinur Leo");
	}
	public StudentClass(String n,int i,double cg){
		
		this.name=n;
		this.id=i;
		this.cgpa=cg;
	}
	public void setname(String n){
		this.name=n;
	}
	public String getname(){
		return name;
	}
	public void setid(int i){
		this.id=i;
	}
	public int getid(){
		return id;
	}
	public void setcgpa(double cg){
		this.cgpa=cg;
	}
	public double getcgpa(){
		return cgpa;
	}
	
	public void displayinfo(){
		System.out.println("Name="+name);
		System.out.println("Id="+id);
		System.out.println("Cgpa="+cgpa);
        
	}
	public static void main(String[] args){
		StudentClass st1=new StudentClass("Nafinur Leo",195,3.83);
		st1.displayinfo();
	}
}
		
	