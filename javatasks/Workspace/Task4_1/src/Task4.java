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
	
	public static void main(String[] args) {
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
	}
//TASK3
//TASK4
//TASK5
//TASK6
//TASK7
//TASK8
//TASK9
//TASK10
	
}
