public class Concatenate{

    public static void main(String[] args)
    {
        String S1 = "Welcome to ";//String literal
        String S2 = "OOP1 course";
        
        System.out.println("String 1: " + S1);
        System.out.println("String 2: " + S2); 
       

        // Concatenate two strings
        String S3 = S1.concat(S2);

        // Display New String.
        System.out.println("The concatenated string: " + S3);
    }
}