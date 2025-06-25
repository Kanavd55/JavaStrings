package JavaStrings;

import java.util.Scanner;

public class CountAllWords {
	
	public static int CountAllWords(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		return count+1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String Data = s.nextLine();
		int count = CountAllWords(Data);
		System.out.println(count);
	}
}
