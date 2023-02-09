/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: Write a program which asks user to input movie name, rate, and ticket sale then print out user input using methods.
 * Due: 02/20/2023
 * Platform/compiler: Eclipse for Windows 10
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Linh Tran_
*/
import java.util.Scanner;
public class MovieDriver_Task2 {

	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		char answer = 'y';
		do {
		String name = movieName();
		String rate = movieRate(); 
		String sales = ticketSale();
		String print = toString(name, rate, sales);
		System.out.println(print);
		System.out.println("Do you want to enter another? (y or n)");
		String input = keyboard.nextLine();
		char userAnswer = input.charAt(0);
		answer = userAnswer;
		} while (answer == 'y' || answer == 'Y');
		System.out.println("Goodbye!");
	}
	public static String movieName() {
		System.out.println("Enter the title of a movie: ");
		String movie = keyboard.nextLine();
		return movie;
	}
	public static String movieRate() {
		System.out.println("Enter the movie's rating: ");
		String rate = keyboard.nextLine();
		return rate;
	}
	public static String ticketSale() {
		System.out.println("Enter the number of tickets sold at a theater: ");
		String ticketSale = keyboard.nextLine();
		return ticketSale;
	}
	public static String toString(String movie, String rate, String sale) {
		String result = movie + " " + rate + " " + sale;
		return result;
	}

}
