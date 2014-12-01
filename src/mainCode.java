import java.util.Scanner;

public class mainCode 
{
	public static void main(String[] args) 
	{
		int rollCount = 0;
		int dNum = 0;
		String play;
		Scanner scan = new Scanner(System.in);
	   		
    	do
    	{
    			do 
    			{
    				System.out.print("\nHow many Dice do you want to play with?" +
							"\n1 = One Dice 2 = Two Dice 3 = Three Dice ");
    						dNum = scan.nextInt();
    						System.out.println("\nPlayer selected " + dNum + " Dices to play with: ");
    						
    		    			if (dNum < 1 || dNum > 3)
    		    			{
    		    		    	System.out.println("This is an Invalid Selection. Please Try Again.");
    		    			}	
		
    						if (dNum == 1)
    						{
    							OneDice oneD = new OneDice(dNum);
    							oneD.Throw();
    							System.out.println("The mainCode Throw call is " +
    												oneD.getThrow(dNum));
    							rollCount++;
    						}
    							else if (dNum == 2)
    							{
    								TwoDice twoD = new TwoDice(dNum);
        							twoD.Throw();
        							System.out.println("The mainCode Throw call is " +
        												twoD.getThrow(dNum));
        							rollCount++;
    							}
    							else if (dNum == 3)
    							{
    								ThreeDice threeD = new ThreeDice(dNum);
        							threeD.Throw();
        							System.out.println("The mainCode Throw call is " +
        												threeD.getThrow(dNum));
        							rollCount++;
    							}									
    			}
    			while (dNum >=1 & dNum <=3);
    			// Exit inside Do-While Loop

    			System.out.print("\nDo you want to play again? Yes or No ");
    			play = scan.next();
    	}
    	while(play.equalsIgnoreCase("YES"));
    	// Exit outside Do-While Loop
    	
    	System.out.println("\nDice was Thrown a Total of " + rollCount + " times." + 
    						"\nGame Over. Thank you for playing!" +
    						"\nPlay Again Later. Good-Bye!");
    	
		scan.close();

		
	} // end static void main
} // end class mainCode