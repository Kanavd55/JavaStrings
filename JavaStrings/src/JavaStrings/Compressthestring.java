package JavaStrings;
import java.util.Scanner;
public class Compressthestring {
	
	public static String getCompressedString(String str) {
		// Write your code here.
		String compressed="";
		int i=0;
		int j =0;
		while(j<str.length()) {
			if(str.charAt(i)!=str.charAt(j)) { 
				if((j-i)>1) {
					compressed=compressed+str.charAt(i)+(j-i);
				}else {
					compressed=compressed+str.charAt(i);
				}
				
				i=j;
			}else {
				j++;
			}
		}
		if((j-i)>1) {
			compressed=compressed+str.charAt(i)+(j-i);
		}else {
			compressed=compressed+str.charAt(i);
		}
		return compressed;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String compressed = getCompressedString(str);
		System.out.println(compressed);
	}
}
