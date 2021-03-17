import java.util.Scanner;

public class Palindrome {

	// Переворот строки
	public static String reverseString(String str1) {
		String res = "";
		
		for(int i = str1.length()-1; i>=0; i--) {
			res += str1.charAt(i);
		}
		return res;
	}
	//Проверка на то, является лм слово полиндромом?
	public static boolean isPolindrome(String str1) {
		String res = "";
		
		for(int i = str1.length()-1; i >= 0; i--) {
			res += str1.charAt(i);
		}
		return str1.equals(res);
		
	}
	
	public static void main(String[] args) {
		String str1 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		
		str1 = sc.nextLine();
		
		System.out.println("Result is:" + reverseString(str1));
		System.out.println("Is polindrome? " + isPolindrome(str1));
	}
	
	
	
}
