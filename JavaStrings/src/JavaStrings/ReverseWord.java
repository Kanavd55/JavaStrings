package JavaStrings;

import java.util.Scanner;

public class ReverseWord {
	public static String ReverseString(String s) {
		if(s.length()==0) {
			return "";
		}
		String reverse = ReverseString(s.substring(1));
		return reverse+s.charAt(0);
	}
	
	public static void PrintAllChars(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
	}
	
	public static String ReverseWord(String str) {
		String reverseWord = "";
		int i =0;
		int j =0;
		while(j<=str.length()) {
			if(j==str.length()) {
				reverseWord=reverseWord+" "+ReverseString(str.substring(i,j));
				break;
			}else if(str.charAt(j)==' ') {
				reverseWord=i==0 ? reverseWord+ReverseString(str.substring(i,j)) : reverseWord+" "+ReverseString(str.substring(i,j));
				j++;
				i=j;
			}else {
				j++;
			}
		}
		return reverseWord;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String reverse = ReverseWord(str);
		PrintAllChars(reverse);
	}
}
