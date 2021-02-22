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
public static void main(String[] args){
	Scanner points = new Scanner(System.in);
	int length, nomberhouse;
	nomberhouse= points.nextInt();
	length = points.nextInt();
	int find = task1(length, nomberhouse); 
	System.out.println(find);
}
	
//task2
	
//task3
	
//task4
	
//task5
	
//task6
	
//task7
	
//task8
	
//task9
	
//task10

}