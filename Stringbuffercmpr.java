import java.io.*;

public class Stringbuffercmpr {
	
	public static void main(String args[]) {
		String s="Ninad";
		StringBuffer s1=new StringBuffer(s);
		System.out.println(s.contentEquals(s1));
	}

}
