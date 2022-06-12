public class AddressBook{
	
	//access modifier,dataType,variable name
	private String ownerName;
	private String info;
	Contact listOfContact[];
	
	//Empty Constructor
	public AddressBook(){
		System.out.println("AddressBook");
		
	}
	
	//Parameterized Constructor
	public AddressBook(String ownerName, String info, int sizeOfArray){
			
		this.ownerName = ownerName;
		this.info=info;
		listOfContact = new Contact[sizeOfArray];
			
	}
	
	//Setter & Getter Method
	public void setownerName(String ownerName){
		ownerName=ownerName;
	}
	public void setinfo(String info){
		info=info;
	}
	
	public String getownerName(){
		return ownerName;
	}
	public String getinfo(){
		return info;
	}
	
	public void ShowAllContactInfo(){
		
		for(int i=0; i<listOfContact.length; i++){
			
			if(listOfContact[i] != null){
				
				System.out.println("..."+(i+1)+"...");
				listOfContact[i].showPersonInfo();
				System.out.println();
			}
		}
	}
	
	public void AddContact(Contact contact){
		
		int flag = 0;
		for(int i=0; i<listOfContact.length; i++){
			
			if(listOfContact[i] == null){
				
				listOfContact[i] = contact;
				System.out.println(listOfContact[i].getMobileNumber());
				flag = 1;
				break;
			}
		}
		
		if(flag == 1){
			
			System.out.println("...Add Contact...");
			
			}
			
		else {
			
			System.out.println("...Can Not Add Contact...");
			
			}
	}
	
	public void DeleteContact(Contact contact){
		
		int flag = 0;
		for(int i=0; i<listOfContact.length; i++){
			
			if(listOfContact[i] == contact){
				
				System.out.println(listOfContact[i].getPersonName());
				listOfContact[i] = null;
				flag = 1;
				break;
				
			}
			
		}
		
		if(flag == 1){
			
			System.out.println("...Delete Contact...");
			
			}
			
		else {
			
			System.out.println("...Can Not Delete Contact...");
			
			}
	}
}