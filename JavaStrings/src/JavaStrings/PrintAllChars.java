package JavaStrings;
import java.util.Scanner;

public class PrintAllChars {
	
	public static void PrintAllChars(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String Data = s.next();
		PrintAllChars(Data);
	}
}
