import java.lang.*;

public class Start1{
	
	public static void main(String args[]){
		
		//Create Object
		Library L1 = new Library("American International University-Bangladesh Library", "408/1, Kuratoli, Khilkhet, Dhaka 1229, Bangladesh", 5, 5000);
		
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
		
	}
	
}