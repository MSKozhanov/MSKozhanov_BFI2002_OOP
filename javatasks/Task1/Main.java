
import java.util.Scanner;
import javafx.application.Application;
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
	
	
	public static void task6(String[] args){

		Scanner points = new Scanner(System.in);
		
		int n, w, h, res;
		n = points.nextInt();
		w = points.nextInt();
		h = points.nextInt();
		res = n / (w * h);
		
		System.out.print("How many walls can I paint? " + "You can paint " + res);
		
	}
	//7 task
		
	public static int squared(int b) {
		return b * b;
	}

	//8 task

	public static boolean task8(float prob, int prize, int pay) {
		
		if (prob * prize > pay){
			return true;	
		}
		else{
			return false;
		}
		
	}
	public static void main(String[] args){ //(prob = 0.2f prize = 50 pay = 9)
		Scanner points = new Scanner(System.in);
		int prize, pay;
		float prob;
		prob = points.nextFloat();
		prize = points.nextInt();
		pay = points.nextInt();
		boolean profit = task8(prob,prize,pay);
		System.out.println(profit);
	}
	//9 task
	
	
	//10 task
}