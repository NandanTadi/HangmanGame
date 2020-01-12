import java.util.Scanner;
public class hangmanNT{
	public static void main(String[]args){

System.out.println();
modes(); //game starts off by calling Introduction method to start the game

}
//Main Method - Contains most of the variables to guess and encoding of the word which was sent from Introduction Method
public static void main(String mword){
	Scanner hangon = new Scanner(System.in);

	String [] seperate = new String [mword.length()];										//creates an array for EACH char in you random word
	System.out.print("Your word is " + mword.length() + " characters long. Encoded Here!");
	for(int i = 0; i < seperate.length; i++){												//for loop used to replace every char with a undercase so it is encoded
		seperate[i] = "_";
		System.out.print(seperate[i]+" ");
	}

		char [] guesses = new char [6]; //fills the incorret gusses you make
		int count = 0;					//used later to see how many gussses you have already took
		int chances = 0;				//when goes to 6 stops the method because that is the max incorrect
		boolean gotit = false;

	for(chances = 0; chances < 6; chances += 0){	//Asks user to guess letter using for loop
		System.out.print("\n\nGuess a letter: ");
		char guess = hangon.nextLine().charAt(0);	//char guess is a varaible which then takes THE FIRST char to your response

	for(int i = 0; i < seperate.length;i++){		//then runs for loop inside chance for loop which goes up to encoded word
		if(guess == (mword.charAt(i))){				//checks to see if guess is true
			count++;								//if true then boolean is corrected, '_' char is replaced with your guess, and the count of how many letter you got goes up
			gotit = true;
			seperate[i] = seperate[i].replace('_' , guess);


	}
				System.out.print(seperate[i]+" "); 	//prints encoded message with replaced correct chars
	}
				System.out.print("\nYouv'e got " + count + " correct so far!");

	if(!gotit){
			guesses[chances] = guess;
			System.out.println("\nIncorrect guess! ");
			chances++;											//reduces you closer to the the missed left you have if incorrect
			System.out.print("Missed Left: " + (6 - chances));
	}
	gotit = false;
			System.out.print("\nYour wrong guesses: ");
			for(int z = 0; z < 6; z++)
				System.out.print(guesses[z]+" ");
				System.out.println();

	if(count == mword.length()){ //checks to see if you made the hidden words and its length correct
		win(mword);
		break;
}}
	if(chances >= 6)			 //if you reach 6 chances you loose
		loss(mword);
}
//Winner Method - Sends game win statement to player which is sent from the main methd. Then asks the player if they would like to play agaian.
private static void win(String word){
	System.out.println("You Win! Great Job the word indeed was " + word);
		restart();
}
//Loss Method - Sends game loss statement to player which is sent from the main methd. Then asks the player if they would like to play agaian.
private static void loss(String word){
	System.out.println("You have been hanged. The word was " + word);
		restart();
}
// Introduction Method - Used to tell directions, select random word choice, and also choose a difficulty
private static void modes(){
	Scanner hangs = new Scanner(System.in);


System.out.print("Welcome to Hangman Developed by Nandan Tadi! Lets start of by seeing which mode you would like to play, \nand then ill explain the directions! Please types basic/moderate/or intense: ");
String gamemode = hangs.nextLine();

if(gamemode.equalsIgnoreCase("basic")){
	System.out.print("You have selected basic");
	String[] array1 = {"monitor", "desktop", "keyboard", "mouse", "internet", "computer", "crash", "reboot", "software", "textpad"};
	String chance = array1[(int)(Math.random()*10)];
	System.out.print("\nDirections: You will be given a number of blanks which represent the chracters of the word randomly chosen. \nAfter you have seen this you will be asked to guess a letter in which you think may be in the word. \nHowever you do not have infinite guesses you only have 6 incorrect gusses after that you loose. \nSo be wise and take good gusses!\n");
	main(chance);}//Sends the random word to main method
else if(gamemode.equalsIgnoreCase("moderate")){
	System.out.print("You have selected moderate");
	String[] array2 = {"strings", "arrays", "scanner", "developer", "random", "hackathon", "intel", "connection", "phyton", "database"};
	String chance = array2[(int)(Math.random()*10)];
	System.out.print("\nDirections: You will be given a number of blanks which represent the chracters of the word randomly chosen. \nAfter you have seen this you will be asked to guess a letter in which you think may be in the word. \nHowever you do not have infinite guesses you only have 6 incorrect gusses after that you loose. \nSo be wise and take good gusses!\n");
	main(chance);}//Sends the random word to main method
else if(gamemode.equalsIgnoreCase("intense")){
	System.out.print("You have selected intense");
	String[] array3 = {"cryptocurrency", "artificial", "deepmind", "amazonaws", "tensorflow", "arduino", "algorithms", "datascience", "bitcoin", "marketcap"};
	String chance = array3[(int)(Math.random()*10)];
	System.out.print("\nDirections: You will be given a number of blanks which represent the chracters of the word randomly chosen. \nAfter you have seen this you will be asked to guess a letter in which you think may be in the word. \nHowever you do not have infinite guesses you only have 6 incorrect gusses after that you loose. \nSo be wise and take good gusses!\n");
	main(chance);}//Sends the random word to main method
else
	System.out.print("It seems as if you have entered the wrong varaible please try again!");
}
//Restart Game Method - Sends the players response back to intro method if he/she would like to play again
private static void restart(){
	Scanner hangs = new Scanner(System.in);

	System.out.println();
	System.out.print("\nWanna play a new game? (Y)(N): ");
	String redo = hangs.nextLine();
	if(redo.equalsIgnoreCase("y")){
		modes();}
	else
	System.out.println("Thanks for playing");

	}
}