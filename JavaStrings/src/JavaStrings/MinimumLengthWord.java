//Problem statement
//Given a string S (that can contain multiple words), you need to find the word which has minimum length.
//
//Note : If multiple words are of same length, then answer will be first minimum length word in the string. Words are seperated by single space only.
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//1 <= Length of String S <= 10^5
//
//Sample Input 1 :
//this is test string
//Sample Output 1 :
//is
//Sample Input 2 :
//abc de ghihjk a uvw h j
//Sample Output 2 :
//a

package JavaStrings;
import java.util.Scanner;
public class MinimumLengthWord {

	public static String minLengthWord(String input){
		// Write your code here
		String min = "";
		int minDif= Integer.MAX_VALUE;
		int start=0;
		int end = 0;
		int i=0;
		int j =0;
		while(i<input.length() && j<=input.length()) {
			if(j==input.length()) {
				if(j-i < minDif) {
					minDif = j-i;
					start=i;
					end=j;
					break;
				}else {
					break;
				}
			}
			else if(input.charAt(j)==' ') {
				if(j-i < minDif) {
					minDif = j-i;
					start=i;
					end=j;
					j=j+1;
					i=j;
				}else {
					j=j+1;
					i=j;
				}
			}else {
				j++;
			}
		}
		if(end!=0) {
			min=input.substring(start,end);
		}
		return min;

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String min = minLengthWord(str);
		System.out.println(min);
	}
}
