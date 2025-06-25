package JavaStrings;

import java.util.Scanner;

public class RemoveCharacter {
	
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String d="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=ch) {
				d=d+str.charAt(i);
			}
		}
		return d;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String str1 = s.next();
		char c = str1.charAt(0);
		String str2=removeAllOccurrencesOfChar(str1,c);
		System.out.println(str2);
	}
}
