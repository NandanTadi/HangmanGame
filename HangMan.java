import java.util.Scanner;
public class HangMan{
	public static void main(String[]args){
	Scanner reader = new Scanner(System.in);

	String[] array = {"testword1", "testword2", "testword3", "testword4", "testword5", "testword6", "testword7", "testword8", "testword9", "testword10"};
	String sofar = "";
	String new2 = "";
	String random = array[(int)(Math.random()*10)+1];
	String underscore = random;
	int random2 = random.length();


	System.out.print("The word has been generated... ");
	System.out.print("You will be given 6 incorrect guesses to guess "); //Instructions

	int guesses = 6;

for(int i = 0; i < random2; i++){
	sofar += "_ ";
}
String letters = "";
String letters2 = "";
String newg = "";

while(guesses > 0){
	System.out.println(sofar);
	System.out.println("Missed Left: " + guesses);
	System.out.println("Letters gussed so far: " + newg);
	System.out.print("Guess letter: ");
	letters2 = reader.nextLine();
		String yup = letters2 + " ";
		newg+=yup;

for(int i = 0; i < random.length(); i++)
	if(random.charAt(i) == letters2.charAt(0)){
		guesses++;
	int i3 = 0;
	int temp = i;
	temp = i3;
	i3 = i;
	i3++;
	new2+=sofar.replace(sofar.charAt(i),letters2.charAt(0));

	}
		guesses--;
		System.out.print(new2);

	}
}}