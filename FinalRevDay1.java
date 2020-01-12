import java.util.Scanner;
public class FinalRevDay1{
	public static void main(String[]args){

	Scanner dubs = new Scanner(System.in);
												//PROGRAM 1
System.out.println("\nProgram 1");				//FOR LOOP
System.out.print("USING FOR LOOP: ");
	for(int i = 2; i <= 50; i++){
		if(i % 2 == 0)
		System.out.print(i + " ");}
System.out.println();							//WHILE LOOP
System.out.print("USING WHILE LOOP: ");
	int a = 0;
	while(a <= 50){
		a++;
		if(a % 2 == 0)
		System.out.print(a + " ");}
System.out.println();							//DO/WHILE LOOP
System.out.print("USING DO/WHILE LOOP: ");
int b = 0;
	do{
		b++;
		if(b % 2 == 0)
			System.out.print(b + " ");}
	while(b <= 50);

System.out.println("\nProgram 2");			 	//PROGRAM 2
int sum = 0;									//FOR LOOP
	for(int c = 0;  c < 5; c++){
		System.out.print("Enter Number Here : ");
		int num = dubs.nextInt();
		sum += num;}
	System.out.print("(USING FOR LOOP)The sum is " + sum);
System.out.println();							//WHILE LOOP
int choice = 0;
int sum2 = 0;
	while(choice < 5){
		choice++;
		System.out.print("Enter Number Here : ");
		int num2 = dubs.nextInt();
		sum2 += num2;}
		System.out.print("(USING WHILE LOOP)The sum is " + sum2);
System.out.println();
int choice3 = 0;
int sum3 = 0;
	do{
		choice3++;
		System.out.print("Enter Number Here : ");
		int num3 = dubs.nextInt();
		sum3 += num3;}
	while(choice3 < 5);
		System.out.print("(USING DO/WHILE LOOP)The sum is " + sum3);

System.out.println("\nProgram 3");
String max = "";
	for(int pro3 = 0; pro3 < 4; pro3++){
		max+="*";
		System.out.print("\n"+max);}
int numpro3a = 0;
	for(int pro3a = 0; pro3a < 4; pro3a++){
		numpro3a += 1111;
		System.out.print("\n"+ numpro3a);}
System.out.println();
int numpro3b = 4;
int digits = 1;
	while(digits < 5){
	for(int pro3 = 0; pro3 < digits; pro3++){
		System.out.print(numpro3b);}
	System.out.println();
	numpro3b--;
	digits++;}
System.out.println();
	for(int pro3 = 4; pro3 < 0; pro3--){
		int num = 9876;


}
	}