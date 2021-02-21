
import java.util.Scanner;

public class Main
{
	// 0
	
	public static void task0(){

		System.out.println("Hello, World");
	}
	//1 task
	public static void task1(String[] args){

		Scanner minutes = new Scanner(System.in);
		int m, res;
		m = minutes.nextInt();
		res = m * 60;
		System.out.print("Seconds = " + res);
	}
	//2 task
	public static void task2(String[] args){

		//task0();
		Scanner points = new Scanner(System.in);
		
		
		int p2,p3, res;
		p2 = points.nextInt();
		p3 = points.nextInt();
		res = p2 * 2 + p3 * 3;
		
		System.out.print("sum = " + res);
	}
	//3 task
	
	public static void task3(String[] args){

		
		Scanner points = new Scanner(System.in);
		
		
		int victory,draw,defeat,res;
		victory = points.nextInt();
		draw = points.nextInt();
		defeat = points.nextInt();
		res = victory * 3 + draw * 1 + defeat * 0;
		
		System.out.print("sum = " + res);
	}
	//4 task
	public static void task4(String[] args){

		Scanner points = new Scanner(System.in);
		int digit;
		boolean division5;
		digit = points.nextInt();
		
		if(digit % 2 == 0){
			division5 = true;
		}else{
			division5 = false;
		}
		System.out.print("Division by 5: " + division5);
	}
	//5 task
	public static void task5(String[] args){

		Scanner points = new Scanner(System.in);
		
		boolean bool1, bool2,res;
		bool1 = points.nextBoolean();
		bool2 = points.nextBoolean();
		if(bool1 == true && bool2 == true){
			res = true;
		}
		else{
			res = false;
		}
		System.out.print("Is true? " + res + "!");
	}
	//6 task
	public static void main(String[] args){

		Scanner points = new Scanner(System.in);
		
		int n, w, h, res;
		res = n / (w * h)
		
		System.out.print("How many walls can I paint? " + "You can paint " res + " walls!");
	}
	//7 task
	
	//8 task
	
	//9 task
	
	//10 task
}