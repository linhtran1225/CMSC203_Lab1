import java.util.Scanner;
public class MovieDriver_Task1 {

	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		String name = movieName();
		String rate = movieRate(); 
		String sales = ticketSale();
		String print = toString(name, rate, sales);
		System.out.println(print);
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
