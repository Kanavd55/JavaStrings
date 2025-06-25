package JavaStrings;
import java.util.Scanner;
public class StringPalindrome {
	
	public static String ReverseString(String s) {
		String reverse="";
		for(int i =s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		return reverse;
	}
	
	public static boolean CheckPalindrome(String s) {
		String reverse= ReverseString(s);
		return s.equals(reverse) ? true : false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean Check = CheckPalindrome(str);
		System.out.println(Check);
	}
}
