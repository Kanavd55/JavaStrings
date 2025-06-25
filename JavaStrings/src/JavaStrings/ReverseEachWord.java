package JavaStrings;
import java.util.Scanner;
public class ReverseEachWord {
	
	public static String ReverseWord(String str) {
		String reverse="";
		int i =0;
		int j =0;
		while(i<=str.length() && j<str.length()) {
			if(i==str.length()) {
				reverse=str.substring(j,i)+" "+reverse;
				break;
			}else if(str.charAt(i)==' ') {
				reverse=str.substring(j,i)+" "+reverse;
				i++;
				j=i;
			}
			else {
				i++;
			}
		}
		return reverse;
	}
	
	public static void PrintAllChars(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String reverse = ReverseWord(str);
		PrintAllChars(reverse);
	}
}
