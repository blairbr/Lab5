import java.util.Random;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {

		String choice;
		Scanner scan1 = new Scanner(System.in);
		int n = 0;
		int counter = 0;
		counter ++;
		boolean letsRoll = true;
		
		System.out.println("==================================="
				+ "\nWelcome to the Grand Circus Casino!"
				+ "\n=================================== "
				+ "\n\nRoll the dice? (y/n)");
		choice = scan1.nextLine();

		System.out.println("Great, let's begin.");
		System.out.println("How many sides do you want your dice to have?");
		n = scan1.nextInt();
		scan1.nextLine();

		System.out.println("Ok, your dice will have " + n + " sides.\n");

		while (letsRoll)
			if (choice.equalsIgnoreCase("y")) {

				Random rn = new Random();
				int rollA = rn.nextInt(n) + 1;
				int rollB = rn.nextInt(n) + 1;

				System.out.println("Roll " + counter +":" + "\n" + rollA + "\n" + rollB);

				if ((rollA == rollB) & (rollA == 1)) {
					System.out.println("SNAKE EYES");
				}
				
				else if ((rollA == rollB) & (rollA == 6)) {
					System.out.println("BOX CARS");
				}
				
				System.out.println("\nRoll again?");
				String choice2 = scan1.nextLine();

				if (choice2.equalsIgnoreCase("y")) {
					counter++;
					System.out.println("Okay! Let's roll again.");
				} else {
					letsRoll = false;
					System.out.println("Thanks for playing.");
				}

				// If using a method, here would be a return to the top... I think...
			}
		scan1.close();
	}
}

// System.out.println("Continue?");
// answer = scan1.nextLine();
//
//
// if (answer.equalsIgnoreCase("y")) {
// wannaContinue = true;
// } else {
// wannaContinue = false;
// System.out.println("Bye!");

// }

// QUESTIONS: local and global variables - when do you use each?