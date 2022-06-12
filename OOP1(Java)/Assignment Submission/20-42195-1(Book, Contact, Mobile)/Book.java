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
	public Book(String bN,String bA,String bI,String bT,int bC){
		
		bookCounter++;
		this.bookName=bN;
		this.bookAuthor=bA;
		this.bookId=bI;
		this.bookType=bT;
		this.bookCopy=bC;
		
	}
	
	//Setter & Getter Method
	public void setbookName(String bN){
		this.bookName=bN;
	}
	public String getbookName(){
		return bookName;
	}
	public void setbookAuthor(String bA){
		this.bookAuthor=bA;
	}
	public String getbookAuthor(){
		return bookAuthor;
	}
	public void setbookId(String bI){
		this.bookId=bI;
	}
	public String getbookId(){
		return bookId;
	}
	public void setbookType(String bT){
		this.bookType=bT;
	}
	public String getbookType(){
		return bookType;
	}
	public void setbookCopy(int bC){
		this.bookCopy=bC;
	}
	public int getbookCopy(){
		return bookCopy;
	}
	
	public void showBookInfo(){
		System.out.println("Book name :"+ bookName);
		System.out.println("Book author :"+ bookAuthor);
		System.out.println("Book id :"+ bookId);
		System.out.println("Book type :"+ bookType);
		System.out.println("Book copy :"+ bookCounter);
	}
	
	//Book Number
	public void addBookCopy(int x){
		bookCopy = bookCopy+x;
	}
	
	static void showTotalBookInfo(){
		
		int b=bookCounter++;
		System.out.println("Total book info "+ b);
	}
	
	public static void main(String[] args){
		
		//Create Object
		Book b1 = new Book("Java Complete Reference","Herbert Schildt","90-78347-6","Programming",10);
	
		Book.showTotalBookInfo();
		b1.addBookCopy(1);
		b1.showBookInfo();
		Book.showTotalBookInfo();

	}
	
}