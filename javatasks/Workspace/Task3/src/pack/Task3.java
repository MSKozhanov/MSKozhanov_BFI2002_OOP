package pack;
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
	
	public static void task2() {
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0
		int [] arr = new int[];
		for(int i = 0; n < 3; i++ )
			arr[i] =  sc.nextInt();
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










	


