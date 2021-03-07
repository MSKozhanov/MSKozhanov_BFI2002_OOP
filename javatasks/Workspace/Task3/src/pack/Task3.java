package pack;
import java.util.Arrays;
import java.util.Scanner;

	
public class Task3{
	
	//task1
	
	public static String[][] task1(String[][] arr, int size) {
		
		for(int i = 0; i <  arr.length; i++) {
			arr[i][1] = String.valueOf((Math.round(Double.valueOf(arr[i][1]) / 1000000))*1000000);
			
		}
		
		return arr;
	}
	
	/*public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size; 
		
		System.out.println("Enter size: ");
		
		size = sc.nextInt();
		
		sc.nextLine();     
		
		String[][] arr = new String[size][2]; 
		
		System.out.println("Enter city/num: ");
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextLine();
			}
		}
	
		
		System.out.println("Result: " );
		
		arr = task1(arr, size);
		
		for(int i = 0; i < size; i++) {
			System.out.println(); 
			for(int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + "    ");
			}
		}
		
	}*/
	
	
	//task2
	
	public static double[] task2(double a) {
		
		double [] arr = new double[2];
		
		arr[0] = a * 2;
		
		arr[1] = Math.sqrt(arr[0] * arr[0] - a * a);
		
		arr[1] = Math.floor(arr[1] * 100);
		
		arr[1] /= 100;
		
		return arr;
	}
	
	/*public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		
		int a = sc.nextInt();
		
		System.out.println("Result:" + (Arrays.toString(task2(a))));
		
		
		
		
	}*/
	//task3
	public static String task3(String[] arr) {
		
		String res;
		
	char a = arr[0].charAt(0);
	char b = arr[1].charAt(0);
	
	if(a == b) {
		res = "Tie";
	} else if(a == 'r' && b == 's' || a == 's' && b == 'p' || a == 'p' &&  b == 'r') {
		res = "The First player win";
	} else {
		res = "The Second player win";
	}
		
		return res;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First player/Second player Enter 'rock' or 'paper' or 'scissors' ");
		
		String[] arr = new String[2]; 
		
		
		
		for(int i = 0; i < 2; i++) {
			
			arr[i] = sc.nextLine();
			arr[i].toLowerCase();
		}
		System.out.println("Result: " + task3(arr));
	}
	//task4
	
	//task5
	
	//task6
	
	//task7
	
	//task8
	
	//task9
	
	//task10
	
}










	


