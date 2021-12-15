import java.util.Scanner;

public class StringLowerupper {
public static void main (String args[]) {
	Scanner sc=new Scanner(System.in);     
	System.out.println("Enter the String:");
	String str1 = sc.nextLine();             
    
	Scanner sb=new Scanner(System.in);     
	System.out.println("Enter the index:");
	int x = sb.nextInt();             
    
	Scanner sa=new Scanner(System.in);     
	System.out.println("Enter the index:");
	int y = sa.nextInt();             
	String str2= str1.substring(x,y);
	String str3=str2.toUpperCase();  
	String str4=str3.toLowerCase(); 
	
	
	System.out.println("Enter the String:" +str3);
	System.out.println("Enter the String:" +str4);
	
	}
}


