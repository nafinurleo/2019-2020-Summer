import java.util.Scanner;
public class UserInput{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1;
        System.out.print("Enter any Number:");
        num1=input.nextInt();
        System.out.println("Number="+num1);

        double num2;
        System.out.print("Enter a double value:");
        num2=input.nextDouble();
        System.out.println("Double="+num2);
    }
    
}