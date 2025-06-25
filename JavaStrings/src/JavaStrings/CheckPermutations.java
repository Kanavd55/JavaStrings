package JavaStrings;
import java.util.Scanner;
public class CheckPermutations {


	public static boolean checkPermutation(String str1,String str2) {
		int[] frequency = new int[256];
		for(int i=0;i<str1.length();i++) {
			int num = (int)(str1.charAt(i));
			frequency[num]++;
		}
		for(int i=0;i<str2.length();i++) {
			int num = (int)(str2.charAt(i));
			frequency[num]--;
		}
		for(int i=0;i<frequency.length;i++) {
			if(frequency[i]!=0) {
				return false;
			}
		}
		return true;
	}
// Brute force solution
//	public static boolean checkPermutation(String str1,String str2) {
//		if(str1.length()!=str2.length()) {
//			return false;
//		}
//		for(int i =0;i<str1.length();i++) {
//			if(!str2.contains(str1.substring(i,i+1)) || !str1.contains(str2.substring(i,i+1))) {
//				return false;
//			}
//		}
//		return true;
//	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1= s.next();
		String str2 = s.next();
		boolean isPermutation = checkPermutation(str1,str2);
		System.out.println(isPermutation);
	}
}
