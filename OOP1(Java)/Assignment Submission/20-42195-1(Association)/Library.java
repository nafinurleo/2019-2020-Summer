import java.lang.*;

public class Library{
	
	//access modifier,dataType,variable name
	private String libName;
	private String libAddress;
	Book listOfBook[];
	int totalBook;
	
	//Empty Constructor
	public Library(){
		System.out.println("Library");
		
	}
	
	//Parameterized Constructor
	public Library(String libName, String libAddress, int sizeOfArray, int totalBook){
		
		this.libName=libName;
		this.libAddress=libAddress;
		
		//Create Object
		listOfBook = new Book[sizeOfArray];
		
		this.totalBook=totalBook;
		
	}
	
	//Setter & Getter Method
	public void setlibName(String libName){
		this.libName=libName;
		
	}
	public void setlibAddress(String libAddress){
		this.libAddress=libAddress;
		
	}
	public void settotalBook(int totalBook){
		this.totalBook=totalBook;
		
	}
	
	public String getlibName(){
		return libName;
		
	}
	public String getlibAddress(){
		return libAddress;
		
	}
	public int gettotalBook(){
		return totalBook;
		
	}
	
	//Show Library Info
	public void ShowLibInfo(){
		
		for(int i=0; i<listOfBook.length; i++){
			
		if(listOfBook[i] != null){
			
			System.out.println("..."+(i+1)+"...");
			listOfBook[i].ShowBookInfo();
			System.out.println();
			
		}
		
	}
		
		System.out.println("Name Of Library: "+getlibName());
		System.out.println("Address Of Library: "+getlibAddress());
		System.out.println("Number Of Books In Library: "+gettotalBook());
		System.out.println("");
		
	}
	
	//Add New Book
	public void AddNewBook(Book book){
		
		int flag=0;
		for(int i=0; i<listOfBook.length; i++){
			
			if(listOfBook[i] == null){
				
				listOfBook[i] = book;
				System.out.println(listOfBook[i].getbookName());
				flag = 1;
				break;
				
			}
			
		}
		
		if(flag == 1){
			
			System.out.println("...Add...");
			
		}
		
		else{
			
			System.out.println("...Can Not Add...");
			
		}
		
		System.out.println("");
		
	}
	
	//Delete Book
	public void DeleteBook(Book book){
		
		int flag = 0;
		
		for(int i=0; i<listOfBook.length; i++){
			
			if(listOfBook[i] == book){
				
				System.out.println(listOfBook[i].getbookName());
				listOfBook[i] = null;
				flag = 1;
				break;
				
			}
			
		}
		
		if(flag == 1){
			
			System.out.println("...Delete...");
			
		}
		
		else{
			
			System.out.println("...Can Not Delete...");
			
		}
		
		System.out.println("");
		
	}
	
	//Add New Book Copy
	void AddNewBookCopy(Book book, int copy){
		
		int flag = 0;
		for(int i=0; i<listOfBook.length; i++){
			
			if(listOfBook[i] == book){
				
				listOfBook[i].AddBookCopy(copy);
				flag = 1;
				
			}
			
		}
		
		if(flag == 1){
			
			System.out.println("...Add Copy...");
			
		}
		
		else{
			
			System.out.println("...Can Not Add Copy...");
			
		}
		
		System.out.println("");
		
	}
	
}
	