package JavaStrings;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	public static String RemoveConsecutiveDuplicates(String str1) {
		String str = "";
		int i=0;
		int j=1;
		while(j<str1.length()) {
			if(str1.charAt(i)==str1.charAt(j)) {
				j++;
			}else {
				str=str+str1.charAt(i);
				i=j;
			}
		}
		str=str+str1.charAt(i);
		return str;
	}
	
	public static void PrintAllChars(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = RemoveConsecutiveDuplicates(str1);
		PrintAllChars(str2);
	}
}
