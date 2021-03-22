
import java.util.Scanner;
import javafx.application.Application;
public class Main
{

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
	
	//1 task
	
	public static void task1(){
		
		System.out.println("Task1_convert_");
		
		Scanner minutes = new Scanner(System.in);
		
		System.out.print("Enter minutes: ");
		
		int m, res;
		
		m = minutes.nextInt();
		
		res = m * 60;
		
		System.out.println("Seconds = " + res);
	}
	
	//2 task
	
	public static void task2(){

		System.out.println("Task2_points_");
		
		Scanner points = new Scanner(System.in);
		
		int p2,p3, res;
		
		System.out.print("Enter points 2x: ");
		
		p2 = points.nextInt();
		
		System.out.print("Enter points 3x: ");
		
		p3 = points.nextInt();
		
		res = p2 * 2 + p3 * 3;
		
		System.out.println("sum = " + res);
	}
	
	//3 task
	
	public static void task3(){

		System.out.println("Task3_footballPoints_");
		
		Scanner points = new Scanner(System.in);
		
		int victory,draw,defeat,res;
		
		System.out.print("Enter victory: ");
		
		victory = points.nextInt();
		
		System.out.print("Enter draw: ");
		
		draw = points.nextInt();
		
		System.out.print("Enter defeat: ");
		
		defeat = points.nextInt();
		
		res = victory * 3 + draw * 1 + defeat * 0;
		
		System.out.println("sum = " + res);
	}
	
	//4 task
	
	public static void task4(){
		
		System.out.println("Task4_divisibleByFive_");
		
		Scanner points = new Scanner(System.in);
		
		int digit;
		
		boolean division5;
		
		System.out.print("Your digit: ");
		
		digit = points.nextInt();
		
		if(digit % 5 == 0){
			division5 = true;
		}else{
			division5 = false;
		}
		
		System.out.println("Division by 5: " + division5);
	}
	
	//5 task
	
	public static void task5(){
		
		System.out.println("Task5_and_");
		
		Scanner points = new Scanner(System.in);
		
		boolean bool1, bool2,res;
		
		System.out.print("Enter bool1: ");
		
		bool1 = points.nextBoolean();
		
		System.out.print("Enter bool2: ");
		
		bool2 = points.nextBoolean();
		
		if(bool1 == true && bool2 == true){
			res = true;
		}
		else{
			res = false;
		}
		
		System.out.println("Is true? " + res + "!");
	}
	
	//6 task
	
	public static void task6(){
		
		System.out.println("Task6_howManyWalls_");
		
		Scanner points = new Scanner(System.in);
		
		int n, w, h, res;
		
		System.out.print("Enter square meters: ");
		
		n = points.nextInt();
		
		System.out.print("Enter width: ");
		
		w = points.nextInt();
		
		System.out.print("Enter height: ");
		
		h = points.nextInt();
		
		res = n / (w * h);
		
		System.out.println("How many walls can I paint? " + "You can paint " + res);
	}
	
	//7 task
		
	public static void task7() {
		
		System.out.println("Task7_squared_");
		
		Scanner points = new Scanner(System.in);
		
		int b, res;
		
		System.out.print("Enter digit to make it squared: ");
		
		b = points.nextInt();
		
		res = b * b;
		
		System.out.println("Result is: " + res);
	}

	//8 task

	public static void task8() {
		
		System.out.println("Task8_profitableGamble_");
		
		Scanner points = new Scanner(System.in);
		
		int prize, pay;
		
		float prob;
		
		System.out.print("Enter prob: ");
		
		prob = points.nextFloat();
		
		System.out.print("Enter prize: ");
		
		prize = points.nextInt();
		
		System.out.print("Enter pay: ");
		
		pay = points.nextInt();
		
		boolean res;	
		
		if (prob * prize > pay){
			res = true;	
		}
		else{
			res = false;
		}
		
		System.out.println("Result is: " + res);
	}
	
	//9 task
	
	public static void task9(){
		
		System.out.println("Task9_frames_");
		
		Scanner points = new Scanner(System.in);
		
		int frame, minutes;
		
		System.out.print("Enter frames: ");
		
		frame = points.nextInt();
		
		System.out.print("Enter minutes: ");
		
		minutes = points.nextInt();
		
		int res = minutes * 60 * frame;
		
		System.out.println("Result is: " + res);
	}
	
	//10 task
	
	public static void task10(){
		
		System.out.println("Task10_mod_");
		
		Scanner points = new Scanner(System.in);
		
		int digit, division;
		
		System.out.print("Enter digit: ");
		
		digit = points.nextInt();
		
		System.out.print("Enter division digit: ");
		
		division = points.nextInt();
		
		int res = (digit - ((digit/division) * division)); 
		
		System.out.print(res);
	}	
}