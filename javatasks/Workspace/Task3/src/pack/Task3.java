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
		
		arr[1] = Math.round(arr[1] * 100);
		
		arr[1] /= 100;
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		
		int a = sc.nextInt();
		
		System.out.println("Result:" + (Arrays.toString(task2(a))));
		
		
		
		
	}
	//task3
	
	//task4
	
	//task5
	
	//task6
	
	//task7
	
	//task8
	
	//task9
	
	//task10
	
}










	


