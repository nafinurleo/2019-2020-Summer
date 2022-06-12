import java.lang.*;

public class Start2{
	
	public static void main(String args[]){
		
		AddressBook A1 = new AddressBook("Leo","Student, Mobile User", 4);
		
		Contact C1 = new Contact();
		C1.setpersonName("Sami");
		C1.setpersonId("20-42195-1");
		C1.setmobileNumber("01767876863");
		C1.setage(25);
		C1.setgender('M');
		
		Contact C2 = new Contact();
		C2.setpersonName("Salim");
		C2.setpersonId("20-42205-1");
		C2.setmobileNumber("01789798797");
		C2.setage(24);
		C2.setgender('M');
		
		Contact C3 = new Contact();
		C3.setpersonName("Noman");
		C3.setpersonId("20-42215-1");
		C3.setmobileNumber("01878689789");
		C3.setage(20);
		C3.setgender('M');
		
		Contact C4 = new Contact();
		C4.setpersonName("Ushoshe");
		C4.setpersonId("20-42225-1");
		C4.setmobileNumber("01967744786");
		C4.setage(22);
		C4.setgender('F');
		
		//Add Contact
		A1.AddContact(C1);
		A1.AddContact(C2);
		A1.AddContact(C3);
		A1.AddContact(C4);
		
		A1.ShowAllContactInfo();
		
		//Delete Contact
		A1.DeleteContact(C4);
		A1.ShowAllContactInfo();
		A1.AddContact(C3);
		
		A1.ShowAllContactInfo();
		
		A1.AddContact(C2);
		A1.ShowAllContactInfo();
	
	}
}