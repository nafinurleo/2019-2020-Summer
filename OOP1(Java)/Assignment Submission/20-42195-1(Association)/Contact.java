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
	public Contact(String personName, String personId, int age, String mobileNumber, char gender) {
		
		this.personName=personName;
		this.personId=personId;
		this.age=age;
		this.mobileNumber=mobileNumber;
		this.gender=gender;
	}
	
	//Setter & Getter Method
	public void setpersonName(String personName){
		this.personName=personName;
	}
	public String getPersonName(){
		return personName;
	}
	public void setpersonId(String personId){
		this.personId=personId;
	}
	public String getPersonId(){
		return personId;
	}
	public void setage(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setmobileNumber(String mobileNumber){
		this.mobileNumber=mobileNumber;
	}
	public String getMobileNumber(){
		return mobileNumber;
	}
	public void setgender(char gender){
		this.gender=gender;
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
	
}

	