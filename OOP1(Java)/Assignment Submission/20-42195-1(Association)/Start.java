import java.lang.*;

public class Start{
	
	public static void main(String args[]){
		
		//Create Object
		Library L1 = new Library("American International University-Bangladesh Library", "408/1, Kuratoli, Khilkhet, Dhaka 1229, Bangladesh", 500, 5000);
		
		Book B1 = new Book();
		B1.setbookName("Panther Panchali");
		B1.setbookAuthor("Bibhutibhushan Bandyopadhyay");
		B1.setbookId("20-195-1");
		B1.setbookType("Novel");
		B1.setbookCopy(15);
		
		Book B2 = new Book();
		B2.setbookName("The Diary Of A Young Girl");
		B2.setbookAuthor("Anne Frank");
		B2.setbookId("20-205-1");
		B2.setbookType("Autobiography");
		B2.setbookCopy(22);
		
		Book B3 = new Book();
		B3.setbookName("On The Origin Of Species By Means Of Natural Selection");
		B3.setbookAuthor("Charles Darwin");
		B3.setbookId("20-215-1");
		B3.setbookType("Evolution Biology");
		B3.setbookCopy(25);
		
		Book B4 = new Book();
		B4.setbookName("The C++ Programming Language");
		B4.setbookAuthor("Bjarne Stroustrup");
		B4.setbookId("20-225-1");
		B4.setbookType("Programming Language");
		B4.setbookCopy(28);
		
		Book B5 = new Book();
		B5.setbookName("Java:The Complete Reference");
		B5.setbookAuthor("Herbert Schildt");
		B5.setbookId("20-235-1");
		B5.setbookType("Programming Language");
		B5.setbookCopy(30);
		
		//Add Book
		L1.AddNewBook(B1);
		L1.AddNewBook(B2);
		L1.AddNewBook(B3);
		L1.AddNewBook(B4);
		L1.AddNewBook(B5);
		
		L1.ShowLibInfo();
		
		//Delete Book
		L1.DeleteBook(B4);
		L1.ShowLibInfo();
		L1.AddNewBook(B3);
		
		L1.ShowLibInfo();
		
		L1.AddNewBook(B2);
		L1.ShowLibInfo();
		
		AddressBook a1 = new AddressBook("Hridoy","Student,Mobile user", 4);
		
		Contact c1 = new Contact();
		c1.setpersonName("Korim");
		c1.setpersonId("19656436464");
		c1.setmobileNumber("017353*****");
		c1.setage(20);
		c1.setgender('M');
		
		Contact c2 = new Contact();
		c2.setpersonName("Rohim");
		c2.setpersonId("1965643545");
		c2.setmobileNumber("019250*****");
		c2.setage(21);
		c2.setgender('M');
		
		Contact c3 = new Contact();
		c3.setpersonName("Sofiq");
		c3.setpersonId("19656436854");
		c3.setmobileNumber("019356*****");
		c3.setage(22);
		c3.setgender('M');
		
		Contact c4 = new Contact();
		c4.setpersonName("Zareen");
		c4.setpersonId("19656436425");
		c4.setmobileNumber("018523*****");
		c4.setage(19);
		c4.setgender('F');
		
		
		
		a1.AddContact(c1);
		a1.AddContact(c2);
		a1.AddContact(c3);
		a1.ShowAllContactInfo();
		
		a1.DeleteContact(c3);
		a1.ShowAllContactInfo();
		
		a1.AddContact(c4);
		a1.ShowAllContactInfo();
		
	}
	
}