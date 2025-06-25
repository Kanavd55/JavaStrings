package JavaStrings;

import java.util.Scanner;

public class ReverseStringEachWord {

	public static String ReverseString(String s) {
		String reverse="";
		for(int i =s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		return reverse;
	}

	public static void PrintAllChars(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
	}

	public static String ReverseEachWord(String str) {
		String reverse="";
		for(int i=0,j=0;i<=str.length();i++) {
			if(i==str.length()) {
				reverse=reverse+ReverseString(str.substring(j,i));
				break;
			}
			else if(str.charAt(i)==' ') {
				reverse=j==0 ? reverse + ReverseString(str.substring(j,i)): reverse+" "+ReverseString(str.substring(j,i));
				j=i;
			}
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String reverse = ReverseEachWord(str);
		PrintAllChars(reverse);
	}
}
