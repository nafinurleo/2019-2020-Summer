import java.util.*;
import java.util.Scanner;
 
public class Length
{  

public static void main(String [] args){
	
	Scanner Obj = new Scanner(System.in);
	System.out.println("Enter your String: ");//input
	String S1 = Obj.nextLine();
	System.out.println("String: " + S1);
	
	int len = S1.length();
	System.out.println("String length is: "+S1.length());//length of string  
	
	for(int i = 0; i<len;i+= 2){//for loop
		char c = S1.charAt(i);//character
	System.out.println("Even position: " + c);
	
	}
	
}

}  