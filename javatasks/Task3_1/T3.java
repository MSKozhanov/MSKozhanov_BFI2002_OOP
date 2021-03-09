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
	
	
	/*public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First player/Second player Enter 'rock' or 'paper' or 'scissors' ");
		
		String[] arr = new String[2]; 
		
		
		
		for(int i = 0; i < 2; i++) {
			
			arr[i] = sc.nextLine();
			arr[i].toLowerCase();
		}
		System.out.println("Result: " + task3(arr));
	}*/
	//task4
	public static int task4(int[] arr){
		
		
		int sumEven = 0;
		int sumUnEven = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				sumEven += arr[i];
			else
				sumUnEven += arr[i];
		}
		
		if(sumEven > sumUnEven) {
			return (sumEven - sumUnEven);
		}
			
		else
			return (sumUnEven - sumEven);
		
		
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
		
		System.out.println("Result is: " + task4(arr));
	}*/
	//task5
	public static String task5(String str) {
		
		String result = ""; 
		
		for (int i = 0; i < str.length(); i++) {
			String ss = "";
			
			ss += str.charAt(i);
			
			 if((int)str.charAt(i) >= 65 && (int)str.charAt(i)<= 90) {
				 ss = ss.toLowerCase();
						 
			 }
			 else {
				 ss = ss.toUpperCase();
			 }
				 
			 result += ss;
	 
		}
		return result;
		
	}
	
	/*public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter: ");
		
		String str = sc.nextLine();
		
		System.out.println("Result: " + task5(str));
		
	}*/
	
	//task6
public static String task6(String str) {
		
		String res = "";
		
		res += str;
		
	String ss = "";
	
	ss += str.charAt(str.length() - 1);
	
	if(ss.matches("^(?i:[aeiouy]).*")) {
		//^ начало строки
		//?i включает CASE_INSENSITIVE для этой группы, чтобы не перечислять повторно заглавные буквы
		//[aeiouy] все гласные. 
		//.*дальше сколько угодно (хоть ноль) любых символов, кроме конца строки
		res += "-nator ";
	} else {
		res += "inator ";
	}
	
	res += str.length();
	res += "000";
	
	return res;
		
	}

/*public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter: ");
	
	String str = sc.nextLine();
	
	System.out.println("Result: " + task6(str));


}*/
	//task7
public static Boolean task7(int k, int p, int z) {
	
	//if((arr[0]*arr[2]<=(arr[3]*arr[4])||(arr[0]*arr[1])<=(arr[3]*arr[4])) {
	
	if(( k)<=(z)||( p)<=(z)) {
		return true;
	}
	else {
		return false;
	}
}
	
/*public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter: Height/Width/Depth/Hole width/Hole height ");
	
	int[] arr = new int[5]; 
	
	for(int i = 0; i < 5; i++) {
		
		arr[i] = sc.nextInt();
		
	}
	int k = arr[0] * arr[2];
	int p = arr[0] * arr[1];
	int z = arr[3]*arr[4];
	System.out.println("Result: " + task7(k,p,z));
	
	}*/
	
	//task8


public static double task8(double Liters, double Fuel_Consumption, double Passangers, Boolean Air_conditioning) {
	
	/*double res;
	double a = (Liters * 100 / Fuel_Consumption);
	double b = (1 - Passangers * 0.05);
	
	if (Air_conditioning == true) {
		
		
		res = (a  * b) *0.9;
	}
	else {
		res = (a  * b);
	}
	
	return res;*/
	
	
	//70.0, 7.0, 0, false
	//36.1, 8.6, 3, true
	//55.5, 5.5, 5, false
	
	Fuel_Consumption = Fuel_Consumption + Fuel_Consumption*(0.05 * Passangers);
	
	if(Air_conditioning == true) {
		return Liters / ((Fuel_Consumption * 1.1)/100);
	} else {
		return Liters / (Fuel_Consumption / 100);
	}
	
}
/*public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Liters:");
	double Liters = sc.nextDouble();
	System.out.println("Enter Fuel Consumption:");
	double Fuel_Consumption = sc.nextDouble();
	System.out.println("Enter Passangers:");
	int Passangers = sc.nextInt();
	System.out.println("Enter  air-conditioning:");
	Boolean Air_conditioning = sc.nextBoolean();
	
	System.out.println("Result: " + task8(Liters,Fuel_Consumption,Passangers,Air_conditioning));
	
}*/
	//task9
public static double task9(double[] arr) {
	double sum = 0;
	
	for(int i = 0; i < arr.length; i++) {
		sum += arr[i];
	}
	return sum / arr.length;
	
}
/*public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int size;
	
	System.out.println("Enter size: ");
	
	size = sc.nextInt();
	
	double[] arr = new double[size];
	
	System.out.println("Enter element: ");
	
	for(int i = 0; i < size; i++) {
		arr[i] = sc.nextInt();
	}
	
	System.out.println("Result is: " + task9(arr));
	
}*/

	
	//task10
public static Boolean task10(double Number) {
	 int Sum = 0;
	 
	 double Num = Number;
	 
	while(Number != 0) {
		Sum += Number % 10;
		Number /= 10;
	}
	
	if (Num % 2 == Sum % 2) {
		return true;
	}
	
	else {
		return false;
	}
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int Number ;
	
	System.out.println("Enter Number: ");
	
	Number = sc.nextInt();
	
	System.out.println("Result is: " + task10(Number));
}
	
}



