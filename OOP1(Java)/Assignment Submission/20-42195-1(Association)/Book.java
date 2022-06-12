public class Book{
	
	//access modifier,dataType,variable name
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy;
	private static int bookCounter=0;
	
	//Empty Constructor
	public Book(){
		bookCounter++;
		
	}
	
	//Parameterized Constructor
	public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy){
		
		bookCounter++;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookId=bookId;
		this.bookType=bookType;
		this.bookCopy=bookCopy;
		
	}
	
	//Setter & Getter Method
	public void setbookName(String bookName){
		this.bookName=bookName;
	}
	public String getbookName(){
		return bookName;
	}
	public void setbookAuthor(String bookAuthor){
		this.bookAuthor=bookAuthor;
	}
	public String getbookAuthor(){
		return bookAuthor;
	}
	public void setbookId(String bookId){
		this.bookId=bookId;
	}
	public String getbookId(){
		return bookId;
	}
	public void setbookType(String bookType){
		this.bookType=bookType;
	}
	public String getbookType(){
		return bookType;
	}
	public void setbookCopy(int bookCopy){
		this.bookCopy=bookCopy;
	}
	public int getbookCopy(){
		return bookCopy;
	}
	
	public void ShowBookInfo(){
		System.out.println("Book Name :"+ bookName);
		System.out.println("Book Author :"+ bookAuthor);
		System.out.println("Book Id :"+ bookId);
		System.out.println("Book Type :"+ bookType);
		System.out.println("Book Copy :"+ bookCounter);
	}
	
	//Add Book Copy
	void AddBookCopy(int x){
		System.out.println("Add Book Copy "+x);
		bookCopy=bookCopy+x;
		System.out.println("After Adding Book copy "+bookCopy);
		
	}
	
	static void showTotalBookInfo(){
		
		int b=bookCounter++;
		System.out.println("Total book info "+ b);
	}
	
}