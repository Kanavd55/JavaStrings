//Problem statement
//Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).
//
//Return true or false.
//
//Do it recursively.
//
//E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.
//
//Detailed explanation ( Input/output format, Notes, Images )
//Sample Input 1 :
//abchjsgsuohhdhyrikkknddg
//coding
//Sample Output 1 :
//true
//Sample Input 2 :
//abcde
//aeb
//Sample Output 2 :
//false


package JavaStrings;
import java.util.Scanner;
public class StringsRecurrence {
	
	public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		int i =0;
		int j =0;
		while(i<a.length() && j<b.length()) {
			if(a.charAt(i)==b.charAt(j)) {
				i++;
				j++;
			}else {
				i++;
			}
		}
		if(j==b.length()) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		System.out.println(checkSequence(str1,str2));
	}
}
