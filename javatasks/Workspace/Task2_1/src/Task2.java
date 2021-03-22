import java.util.Scanner;

public class Task2{

	public static void main(String[] args){
		task1();
		task2();
		task3();
		task4();
		task5();
		task6();
		task7();
		task8();
		task9();
		task10();
	}
	
//task1
	
public static void task1() {
	
	System.out.println("Task1_oppositeHouse_");
	
	Scanner sc = new Scanner(System.in);
	
	int nomberhouse, length;
	
	System.out.print("Enter number of house: ");
	
	nomberhouse= sc.nextInt();
	
	System.out.print("Enter length of street: ");
	
	length = sc.nextInt();
	
	int nomber, find;
	
	nomber = length * 2;
	
	find = nomber - nomberhouse + 1;
	
	System.out.println(find);
			
}

//task2

public static void task2() {
	
	System.out.println("Task2_nameShuffle_");
	
	Scanner sc = new Scanner(System.in);
	
	String str;
	
	System.out.print("Enter string: ");
	
	str = sc.nextLine();
	
	String res = "", s1 = "", s2 = "";
	
	for(int i = 0; i < str.indexOf(' '); i++) {
		s1 += str.charAt(i);
	}
	
	for(int i = str.indexOf(' ') + 1; i < str.length(); i++) {
		s2 += str.charAt(i);
	}
	
	res = s2 + " " + s1;
	
	System.out.println("Result is: " + res);
}

//task3
	
public static void task3() {
	
	System.out.println("Task3_discount_");
	
	Scanner sc = new Scanner(System.in);

	int price, percentage;
	
	System.out.print("Enter price: ");
	
	price = sc.nextInt();
	
	System.out.print("Enter percentage: ");
	
	percentage = sc.nextInt();
	
	double res;
	
	res = price * (100 - percentage)/100;
	
	System.out.println("New price: " + res);
}


//task4
	
public static void task4() {
	
	System.out.println("Task4_differenceMaxMin_");

	Scanner sc = new Scanner(System.in);
	
	int size;
	
	System.out.print("Enter size: ");
	
	size = sc.nextInt();
	
	int[] arr = new int[size];
	
	System.out.println("Enter element: ");
	
	for(int i = 0; i < size; i++) {
		arr[i] = sc.nextInt();
	}
	
	
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
	
	System.out.println("Result is: " + (max - min)); 	
}

//task5

public static void task5() {
	
	System.out.println("Task5_equal_");
	
	Scanner sc = new Scanner(System.in);
	
	int[] arr = new int[3];
	
	System.out.println("Enter element: ");
	
	for(int i = 0; i < 3; i++) {
		arr[i] = sc.nextInt();
	}
	
	int num;
	if(arr[0] == arr[1] && arr[0] == arr[2] && arr[1] == arr[2]) {

		 num = 3;
	}
	else if(arr[0] == arr[1]){

		 num = 2;
	}
	else if(arr[0] == arr[2]){

		 num = 2;
	}
	else if(arr[1] == arr[2]){

		 num = 2;
	}
	else {
		 num = 0;
	}
	System.out.println("The number of identical: " + num);
}

//task6

public static void task6() {
	
	System.out.println("Task6_reverse_");
	
	Scanner sc = new Scanner(System.in);
	
	String str;
	
	System.out.print("Enter string: ");
	
	str = sc.nextLine();
	
	String res = "";
	
	for(int i = str.length() - 1; i >= 0; i--) {
		res += str.charAt(i);
	}
	
	System.out.println("Result is: " + res);
}

//task7

public static void task7() {
	
	System.out.println("Task7_programmers_");

	Scanner sc = new Scanner(System.in);

	int[] arr = new int[3];
		
	System.out.print("Enter pay: ");
		
	for(int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
	}
	
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
	
	System.out.println("Result is: " + (max - min)); 
}
	
//task8

public static void task8() {
	
	System.out.println("Task8_getXO_");
	
	Scanner sc = new Scanner(System.in);
	
	String str;
	
	System.out.print("Enter string: ");
	
	str = sc.nextLine();
	
	String res = "";
	
	int numO = 0, numX = 0;
	
	
	for(int i = str.length() - 1; i >= 0; i--) {
		if (str.charAt(i) == 'o' ) {
			numO++; 
		}
		if (str.charAt(i) == 'x' ) {
			numX++; 
		}
	}
	
	boolean b; 
	if(numO == numX ) {
		b = true;
	}
	else {
		b = false;
	}
	System.out.println("Result is: " + b);
	
}

//task9

public static void task9() {
	
	System.out.println("Task9_bomb_");
	
	Scanner sc = new Scanner(System.in);
	
	String str;
	
	System.out.print("Enter string: ");
	
	str = sc.nextLine();
	
	//str.toLowerCase();
	
	String find = "";
	
	String[] subStr;
	
    String separ = " "; 
    
    subStr = str.toLowerCase().split(separ); 
    
    for(int i = 0; i < subStr.length; i++) { 
    	
    	
       if(subStr[i].equals("bomb")  ) {   
    	   find = "DUCK!";
       }
       
    }
    if (find == "DUCK!") {
    	find ="DUCK!";
    }
    else {
    	find = "Relax, there's no bomb.";
    }
    
    System.out.println("Result is: " + find); 
}

//task10

public static void task10() {
	
	System.out.println("Task10_sameAscii_");
	
	Scanner sc = new Scanner(System.in);
	
	String str1, str2;
	
	System.out.print("Enter string1: ");
	
	str1 = sc.nextLine();
	
	System.out.print("Enter string2: ");
	
	str2 = sc.nextLine();
	
	int sum1 = 0;
	int sum2 = 0;
	
	for(int i = 0; i< str1.length(); i++) {
		sum1 += (int)str1.charAt(i);
	}
	
	for(int i = 0; i< str2.length(); i++) {
		sum2 += (int)str2.charAt(i);
	}
	boolean b;
	if(sum1 == sum2) {
		b = true;
	}
	else {
		b = false;
	}
	System.out.println("Result is: " + b);
}
	
}