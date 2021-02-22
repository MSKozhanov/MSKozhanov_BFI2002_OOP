import java.util.Scanner;
import javafx.application.Application;
public class Task2{

//task1
public static int task1(int length, int nomberhouse) {
	int nomber, find;
	nomber = length * 2;
	find = nomber - nomberhouse + 1;
	return find;
			
}
/*public static void main(String[] args){
	Scanner points = new Scanner(System.in);
	int length, nomberhouse;
	nomberhouse= points.nextInt();
	length = points.nextInt();
	int find = task1(length, nomberhouse); 
	System.out.println(find);
}*/
	
//task2
public static String task2(String str) {
	
	String res = "", s1 = "", s2 = "";
	
	for(int i = 0; i < str.indexOf(' '); i++) {
		s1 += str.charAt(i);
	}
	
	for(int i = str.indexOf(' ') + 1; i < str.length(); i++) {
		s2 += str.charAt(i);
	}
	
	res = s2 + " " + s1;
	
	return res;
	
}

/*public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String str;
	
	System.out.println("Enter: ");
	
	str = sc.nextLine();
	
	System.out.println("Result is: " + task2(str));
}*/

//task3
	
public static double task3(int price, int percentage) {
	double res;
	res = price * (100 - percentage)/100;
	return res;

}

/*public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	int price, percentage;
	
	price = sc.nextInt();
	percentage = sc.nextInt();
	
	System.out.println("New price: " + task3(price,percentage));
}*/
//task4
	
public static int task4(int[] arr) {

	int max = arr[0];
	int min = arr[0];
	
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] > max) {
			max = arr[i];
		}
		if(arr[i] < min) {
			min = arr[i];
		}
	}
	
	return max - min;
	
	
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
	
	System.out.println("Result is: " + task4(arr));
}
//task5
	
//task6
	
//task7
	
//task8
	
//task9
	
//task10

}