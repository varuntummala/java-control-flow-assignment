import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		// 1. Initialize any variables and objects you need (i.e. a scanner, some
		// counters for a total running sum, and a number tracking the # of scores inputted

		int sum = 0;
		int count = 0;
		int avg = 0;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter your score :");
		int score = Integer.parseInt(myScanner.nextLine());
		System.out.println("Score you entered is: "+score);
		while (score<0){
			System.out.println("Please enter at least One(Non Negetive) Score");
			score = Integer.parseInt(myScanner.nextLine());
		}


		// 2. Make a loop that repeatedly asks the user for a number and won't stop
		// until the user answers using a negative number
		// 3. Add some error checking for when a user inputs a number over 100 - we
		// should skip that input and start the loop
		// over to ask again
		do {
			if (score > 100){
				System.out.println("Score can not be greater than 100. Please enter a valid score:");
				score = Integer.parseInt(myScanner.nextLine());
				continue;
			} else if(score < 0){
				break;

			}else {
				System.out.println("Enter your next score: ");
				count++;
				sum = sum+score;
				score = Integer.parseInt(myScanner.nextLine());
				System.out.println("Score you entered is:"+score);
				continue;

			}

		} while (score >= 0);


		// 4. Calculate the average of all scores collected during the loop
		avg = sum/count;
		System.out.println("Your average score is:"+avg);
//		Display the average grade and corresponding message
//				- If over 90: "Excellent Work!"
//				- If over 80: "Good Job!"
//				- If over 70: "Keep it up!"
//				- anything else: "Let's work hard to get those grades up!"

		if (avg > 90){
			System.out.println("Excellent Work!");
		} else if (avg > 80){
			System.out.println("Good Job!");
		}else if (avg > 70){
			System.out.println("Keep it up!");
		}else if (avg <= 70){
			System.out.println("Let's work hard to get those grades up!");
		}

	}
}
