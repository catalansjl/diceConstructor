import java.util.Random;
public class diceConstructor {	
		
	private int mBounces;
	int game;
	int numThrows = 0;
	
	public diceConstructor()
	{
		mBounces = 1;
	}
	
	public diceConstructor(int number)
	{
		mBounces = number;
	}	

	public int Throw()
	{		
		for (int i=0; i<mBounces; i++)
		{
			game = game + 0 + (int) (Math.random() * 10);
			numThrows++;
		}	
		game = game / mBounces;
		return 	(game);
	}
	
	public int trackNumber()
	{		
		return numThrows;
	}
	
}
