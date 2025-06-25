package JavaStrings;

import java.util.Scanner;

public class HighestOccuringCharacter {
	
	public static char highestOccuringChar(String str) {
		//Your code goes here
		int[] frequency = new int[256];
		for(int i =0;i<str.length();i++) {
			int num = (int)(str.charAt(i));
			frequency[num]++;
		}
		int maximum = Integer.MIN_VALUE;
		int index = -1;
		for(int i =0;i<frequency.length;i++) {
			if(frequency[i]>maximum) {
				maximum=frequency[i];
				index = i;
			}
		}
		return (char)(index);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char c = highestOccuringChar(str);
		System.out.println(c);
	}
}
