import java.util.Scanner;

public class diceConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
				
		Scanner input = new Scanner(System.in);		
		
		int number;		
		
		 System.out.printf("Please enter a number that you want to bounce \n\n");
		 number = input.nextInt();  
		
		 diceConstructor myRandomNumber = new diceConstructor(number);
		 
		int jorge = myRandomNumber.Throw();	
		
		int luis = myRandomNumber.trackNumber();
		
		 System.out.println(+ jorge);
		 
		 System.out.println(+ luis);
		 
   }	 
}

		
		
		
		
		
