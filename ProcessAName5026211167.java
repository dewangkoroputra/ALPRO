import java.util.Scanner;


public class ProcessAName5026211167 {
    
    
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        
        // your code goes here
        String name = console.nextLine();
        //spasi sebagai pemisah
        int space = name.indexOf(' ');
        //first name
        String firstname = name.substring(0,1);
        //last name
        space++;
        String lastname = name.substring(space);

        
        //print
        System.out.println("Your name is: "+lastname+", "+firstname+".");
        
    }
}