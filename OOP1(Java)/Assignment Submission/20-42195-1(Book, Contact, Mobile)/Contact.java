public class Contact{
	
	//access modifier,dataType,variable name
	private String personName;
	private String personId;
	private int age;
	private String mobileNumber;
	private char gender;
	
	//Empty Constructor
	public Contact() {
		
		System.out.println("Contact");
	}
	
	//Parameterized Constructor
	public Contact(String pN, String pI, int ag, String mN, char gn) {
		
		this.personName=pN;
		this.personId=pI;
		this.age=ag;
		this.mobileNumber=mN;
		this.gender=gn;
	}
	
	//Setter & Getter Method
	public void setPersonName(String pN){
		this.personName=pN;
	}
	public String getPersonName(){
		return personName;
	}
	public void setPersonId(String pI){
		this.personId=pI;
	}
	public String getPersonId(){
		return personId;
	}
	public void setAge(int ag){
		this.age=ag;
	}
	public int getAge(){
		return age;
	}
	public void setMobileNumber(String mN){
		this.mobileNumber=mN;
	}
	public String getMobileNumber(){
		return mobileNumber;
	}
	public void setGender(char gn){
		this.gender=gn;
	}
	public char getGender(){
		return gender;
	}
	
	public void showPersonInfo() {
		
		System.out.println("Person name :"+personName);
		System.out.println("Person id :"+personId);
		System.out.println("Person age :"+age);
		System.out.println("Mobile :"+mobileNumber);
		System.out.println("Gender :"+gender);
	}
	
	//Detect Mobile Operator
	public void detectMobileOperator(){
		
		if(mobileNumber.charAt(2) == '7' || mobileNumber.charAt(2) == '3'){
			
			System.out.println("Operator GP");
		}
		
		else if(mobileNumber.charAt(2) == '9'){
			
			System.out.println("Operator Banglalink");
		}
		
		else{
			
			System.out.println("Operator Robi");
		}
}
	
	public static void main(String[] args){
		
		//Create Object
		Contact C1 = new Contact("Nafinur Leo","7238-388-992",18,"01749207978",'M');
		C1.showPersonInfo();
		C1.detectMobileOperator();

	}

}

	