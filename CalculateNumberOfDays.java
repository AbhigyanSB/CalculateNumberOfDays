/* This program will display the number of days
 * in a given month of a given year */

//Import the Scanner class of Java.
import java.util.Scanner;

//Class to determine the number of days for a given month by the user.
public class CalculateNumberOfDays {
	
	//Main method.
	public static void main(String[] args) {
		
		//Creating a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		//Ask for the user inputs and store them as integer month and year for the month and year.
		System.out.println("Please enter the month: ");
		int month = input.nextInt();
		System.out.println("Please enter the year: ");
		int	year = input.nextInt();
		
		//If the year is a leap year.
		if ((year%4==0 && year%100!=0) || (year%400==0)) {
			switch (month % 12) { /* for the leap years */
			case 0: System.out.println("The month December of the year " + year + " had 31 days"); break;
			case 1: System.out.println("The month January of the year " + year + " had 31 days"); break;
			case 2: System.out.println("The month February of the year " + year + " had 29 days"); break;
			case 3: System.out.println("The month March of the year " + year + " had 31 days"); break;
			case 4: System.out.println("The month April of the year " + year + " had 30 days"); break;
			case 5: System.out.println("The month May of the year " + year + " had 31 days"); break;
			case 6: System.out.println("The month June of the year " + year + " had 30 days"); break;
			case 7: System.out.println("The month July of the year " + year + " had 31 days"); break;
			case 8: System.out.println("The month August of the year " + year + " had 31 days"); break;
			case 9: System.out.println("The month September of the year " + year + " had 30 days"); break;
			case 10: System.out.println("The month October of the year " + year + " had 31 days"); break;
			case 11: System.out.println("The month November of the year " + year + " had 30 days"); break;
			default: System.out.println("Unknown days!"); break;
			}	//switch
		}	//if.
		
		//If the year is not a leap year.
		else {
			switch (month % 12) { /* for the non-leap year cases */
			case 0: System.out.println("The month December of the year " + year + " had 31 days"); break;
			case 1: System.out.println("The month January of the year " + year + " had 31 days"); break;
			case 2: System.out.println("The month February of the year " + year + " had 28 days"); break;
			case 3: System.out.println("The month March of the year " + year + " had 31 days"); break;
			case 4: System.out.println("The month April of the year " + year + " had 30 days"); break;
			case 5: System.out.println("The month May of the year " + year + " had 31 days"); break;
			case 6: System.out.println("The month June of the year " + year + " had 30 days"); break;
			case 7: System.out.println("The month July of the year " + year + " had 31 days"); break;
			case 8: System.out.println("The month August of the year " + year + " had 31 days"); break;
			case 9: System.out.println("The month September of the year " + year + " had 30 days"); break;
			case 10: System.out.println("The month October of the year " + year + " had 31 days"); break;
			case 11: System.out.println("The month November of the year " + year + " had 30 days"); break;
			default: System.out.println("Unknown days!"); break;
			}	//switch.
		}	//else.
	}	//Main() method.
}	//CalculateNumberOfDays class.
