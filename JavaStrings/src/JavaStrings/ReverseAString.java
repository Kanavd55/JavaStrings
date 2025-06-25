package JavaStrings;
import java.util.Scanner;

public class ReverseAString {
	
	
	//Recursion Solution
	public static String ReverseString(String s) {
		if(s.length()==0) {
			return "";
		}
		String reverse = ReverseString(s.substring(1));
		return reverse+s.charAt(0);
	}
	
	//Brute force approach
//	public static String ReverseString(String s) {
//		String reverse="";
//		for(int i =s.length()-1;i>=0;i--) {
//			reverse=reverse+s.charAt(i);
//		}
//		return reverse;
//	}
	
	public static void PrintAllChars(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String reverse = ReverseString(str);
		PrintAllChars(reverse);
	}
}
