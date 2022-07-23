package shree3;
import java.util.*;

public class Palidrome {
	
	static void reverseSent (String s) {
		
		//reverse each words in a sentence along with the sentence.
		String sf = "";
		StringBuffer temp = new StringBuffer();
		String arr[] = s.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			temp = new StringBuffer();
			temp.append(arr[i]);
			temp.reverse();
			sf = sf + temp.toString() + " ";
		}
		System.out.println(sf);
	}
	
	static void reverse (String s) {
		
		//reverse a string using stringbuffer and reverse()
		String str1 = "";
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		sb.reverse();
		String str = sb.toString();
		System.out.println(str);
		
		//reversing without using stringbuffer & reverse().
		for (int i = s.length() - 1; i >= 0; i--) {
			str1 = str1 + s.charAt(i);
		}
		System.out.println(str1);
	}
	
	static boolean isPalindrome (String s) {
		
		//check for palindrome.
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sent = sc.nextLine();
		String str = sc.next();
		
		if (isPalindrome(str))
			System.out.println("Palindrome!");
		else
			System.out.println("Not Palindrome!");
		reverse(str);
		
		reverseSent(sent);
		sc.close();
	}

}
