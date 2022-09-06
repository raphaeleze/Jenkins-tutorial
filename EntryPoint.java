import java.util.Random;
import java.util.Scanner;

public class EntryPoint {
	


	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		String variableString;
		String answerString ;
		int age;
		try {
					Scanner scan = new Scanner(System.in);
			System.out.println("whats your name?");
			variableString = scan.nextLine();
			
			System.out.println("How old are you?");
			age = scan.nextInt();
			scan.nextLine();
			
			System.out.println("your name is " + variableString + " you are " + age + " years old");
			
			System.out.println("would you like to play a game? (YES/NO)");
			
			answerString = scan.nextLine();
			
			System.out.println(answerString);

			if (answerString.equals("yes" ) || answerString.equals("YES")) {
				System.out.println("You have 5 chances to guess a number form 1 to 10?");
				System.out.println("** Type your number **");	
				
				
				
				Random random = new Random();
				int randomNum = random.nextInt(11);
				for (int i=0; i<5; i++) {
					int userResponseString;
					userResponseString = scan.nextInt();
						
					 if (userResponseString < randomNum ) {
						System.out.println("** guess higher, try again **");}
						
					 if (userResponseString > randomNum ) {
						System.out.println("** guess lower, try again **");}
					 
					 if (userResponseString == randomNum ) {
					
						System.out.println("**Congratulations " + variableString + " you guessed right **");
						}
					}

					//System.out.println("** Sorry.. you guessed wrong byeee **");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

			

	

		/*Random random = new Random();
		int randomNum = random.nextInt(4);
		System.out.println(randomNum);*/
		
	}				 					

		

		
	}
	


