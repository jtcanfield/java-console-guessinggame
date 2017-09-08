import java.util.InputMismatchException;
import java.util.Scanner;
public class TalkingComputer {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Whats up, my name is JT's PC.\nWhats your name?");
		String name = in.nextLine();
		System.out.println("Nice to meet you, " + name);
		System.out.println("How are you today?");
		String feeling = in.nextLine();
		System.out.println("I see. Well, I dont know what ''" + feeling);
		System.out.println("''is like, as I am a computer");
		System.out.println("Would you like to play a game?");
		String answerr = in.next();{
        while (!answerr.equalsIgnoreCase("No")&&!answerr.equalsIgnoreCase("N")&&!answerr.equalsIgnoreCase("Nah")&&!answerr.equalsIgnoreCase("Yes")&&!answerr.equalsIgnoreCase("Y")&&!answerr.equalsIgnoreCase("Sure")) {
        	System.out.println("I dont understand that answer, can you rephrase that?");
        	answerr = in.next();
		} if (answerr.equalsIgnoreCase("No")||answerr.equalsIgnoreCase("N")||answerr.equalsIgnoreCase("Nah")) {
			System.out.println("Aw, Ok. Bye then!");
		} if (answerr.equalsIgnoreCase("Yes")||answerr.equalsIgnoreCase("Y")||answerr.equalsIgnoreCase("Sure")) {
				boolean keepPlaying = true;
		        System.out.println("Lets play the Guessing Game!");
		        while (keepPlaying) {
		            boolean validInput = true;
		            boolean endgame = false;
		            //int guess, number;
		            double number;
		            String answer;
		            number = /*(int)*/ (Math.floor(Math.random() * 10) + 1);
		            System.out.println("I'm guessing a number between 1-10");
		            System.out.println("What is your guess? ");
		            String guessstring = in.next();
		            do {
		                validInput = true;
		                
		               //if (guess instanceof ){
		                try
			                {
			                  int guess = Integer.parseInt(guessstring);
			                  endgame = true;
			                  //nextInt will throw InputMismatchException
			                  //if the next token does not match the Integer
			                  //regular expression, or is out of range
			                  //int usrInput=guess.nextInt();
			                }
			                catch(InputMismatchException exception)
			                {
			                  //Print "This is not an integer"
			                  //when user put other than integer
			                  endgame = false;
			                  System.out.println("This is not an integer");
			                }
			                catch(NumberFormatException exception)
			                {
			                  //Print "This is not an integer"
			                  //when user put other than integer
			                  endgame = false;
			                  System.out.println("That is not a number");
			                }
		                if (endgame == true){
		                	int guess = Integer.parseInt(guessstring);
		                	 if (guess < 1 || guess > 10) {
//				                	validInput = true;
				                	endgame = false;
				                    System.out.println("That number is not between 1 and 10, guess again!");
				                } 	
		                }
		                
			                 /*try {
			                	 int i = Integer.parseInt(guess);
			                	 System.out.println("The s is the int number: " + guess); 
			                	} catch (NumberFormatException nfe) {
			                	 System.out.println("The s is not a number, s: " + guess);
			                	}*/
		                /* } else {
		                	
		                }*/
		            } while(!validInput);
		                
		            while(endgame == true) {
		            	int guess = Integer.parseInt(guessstring);
		            	if (guess == number)
			                System.out.println("You guessed correct!");
			            if (guess != number)
			                System.out.println("You were wrong. It was " + number);
		                System.out.print("Do you want to play again? (Y/N) ");
		                answer = in.next();
		                while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
		                    System.out.println("Can you please use Y or N?");
		                    answer = in.next();
		                }
		                if (answer.equalsIgnoreCase("y")){
		                	endgame = false;
		                    keepPlaying = true;
		                }
		                if (answer.equalsIgnoreCase("n")){
		                	System.out.println("Okay, that was fun! Goodbye!");
		                	endgame = false;
		                	keepPlaying = false;	
		                }
		            }
		        }
		}
	}
	}
}