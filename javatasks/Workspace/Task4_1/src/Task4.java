import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

//TASK1
	
	public static String task1(String res) {
		
		
		for(int i = 0; i < res.length(); i++) {
			if ( res.charAt(i) == '7') {
				return "Boom";
			}
			
		}
		return "No";
		
	}
	
	/*public static void main(String[] args) {
		String res = "";
		String now = "";
		
		Scanner sc = new Scanner(System.in);
		
		int size;
		
		System.out.println("Enter size: ");
		
		size = sc.nextInt();
		
	    sc.nextLine();
		
		System.out.println("Enter element: ");
		
		for(int i = 0; i < size; i++) {	
				now = "";
				now = sc.nextLine();
				res += now;
		}
		
		
		System.out.println("Result is: " + task1(res));
	}*/
//TASK2
	public static Boolean task2(int[] arr) {
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != i + arr[0]) {
				return false;
			}
		}
		return true;
	}
	
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size;
		
		System.out.println("Enter size: ");
		
		size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter element: ");
		
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Result is: " + task2(arr));
	}*/
//TASK3
	
public static String task3(String str) {
		String res = "";
		
		for (int i = 0; i < str.length(); i++){
			
			if (i % 2 != 0 ) {
				
				res += str.charAt(i);
				
				res += str.charAt(i-1);
			}
			
		}
		if (str.length()%2 != 0) {
			
			res += str.charAt(str.length()-1);
		}
		return res;
		
}
/*public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String str = "";
	
	System.out.println("Enter string: ");
	
	str = sc.nextLine();
	
	System.out.println("Result is: " + task3(str));
}*/
//TASK4
public static StringBuffer task4(StringBuffer sb) {
	
	int a = sb.length() - 1;
	
	for(int i = sb.length()-1; i>=0; i--) {
		if(sb.charAt(i) != '?' && sb.charAt(i) != '!') {
			sb.delete(i+1,a);
			break;
		}
	
	
		
		
	}
	return sb;
}
/*public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String str = "";
	
	System.out.println("Enter string: ");
	
	str = sc.nextLine();
	
	StringBuffer sb = new StringBuffer(str);
	
	System.out.println("Result is: " + task4(sb));
}*/
//TASK5

public static String task5(String str) {
	String res = "";
	
	for(int i = 0; i < str.length(); i++) {
		if(str.charAt(i) != 'x') {
			res += str.charAt(i);
		} else {
			if(i != 0 && i != str.length() - 1 && str.charAt(i-1) == ' ' && str.charAt(i+1) == ' '|| (i == 0 && i != str.length()-1) && str.charAt(i +1) == ' '  || (i == str.length() - 1 && i != 0 && str.charAt(i-1) == ' ') || (str.length() == 1 )) {
				res += "ecks";
			} else if(i != 0 && str.charAt(i-1) == ' '){
				res += "z";
			} else {
				res += "cks";
			}
		}
	}
	return res;
	
}

/*public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String str = "";
	
	System.out.println("Enter string: ");
	
	str = sc.nextLine();
	
	System.out.println("Result is: " + task5(str));
}*/
//TASK6
public static int task6( int[] arr) {
	Arrays.sort(arr); 
	int max = arr[1] - arr[0]; 
	for (int i =1; i < arr.length; i++) {
		if(max< arr[i]- arr[i-1]) {
			max = (arr[i]- arr[i-1]);
		}
	}
	return max;
}
/*public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	
	int size;
	
	System.out.println("Enter size: ");
	
	size = sc.nextInt();
	
	int[] arr = new int[size];
	
	System.out.println("Enter element: ");
	
	for(int i = 0; i < size; i++) {
		arr[i] = sc.nextInt();
	}
	
	System.out.println("Result is: " + task6(arr));
}*/
//TASK7
public static int task7( String str) {
	String ss = "";
	
	for(int i = str.length() - 1; i >= 0; i--) {
		ss += str.charAt(i);
	}
	
	int x1 = Integer.valueOf(str);
	int x2 = Integer.valueOf(ss);
	
	x1 = x1 - x2;
	
	if(x1 < 0) {
		return 0;
	} else {
		return x1;
	}
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter : ");

String str = sc.nextLine();

System.out.println("Result is: " + task7(str));
}
//TASK8
//TASK9
//TASK10
	
}
