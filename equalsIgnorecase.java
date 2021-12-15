import java.io.*;

public class equalsIgnorecase {

public static void main(String[] args)
    {
        String columnist1 = "Hii Ninad Narvekar";
        String columnist2 = "Hii java";
        String columnist3 = "Hii Ninad Narvekar";

        
boolean equals1 = columnist1.equalsIgnoreCase(columnist2);
boolean equals2 = columnist1.equalsIgnoreCase(columnist3);
System.out.println();
        
System.out.println("\"" + columnist1 + "\" equals \"" +
            columnist2 + "\"? " + equals1);
System.out.println("\"" + columnist1 + "\" equals \"" +
            columnist3 + "\"? " + equals2);
System.out.println();
    }
}