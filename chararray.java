import java.util.Scanner;

public class chararray {
public static void main (String args[]) {
	Scanner sc=new Scanner(System.in);     
	System.out.println("Enter the String:");
	String strA = sc.nextLine();             
	Scanner sb=new Scanner(System.in);     
	int i;
	char[] character =new char[strA.length()]; 
	for(i=0;i<strA.length();i++) {            
	  character[i]  =strA.charAt(i);    
	}
	System.out.println(character);
}
}