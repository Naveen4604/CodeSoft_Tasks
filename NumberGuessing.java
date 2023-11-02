import java.util.*;
import java.util.Random;

class NumberGuessing
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	Random r=new Random();
	System.out.println("Enter the Number Range");
	int n=s.nextInt();
	int num=r.nextInt(n);
	int guess;
	System.out.println("You are given three chances to guess the number \n");
	for(int i=0;i<3;i++)
	{
		System.out.println("Try to Guess the Number\n");
		guess=s.nextInt();
		if(guess>num)
		{
			System.out.println("You went beyond !!\n");
		}
		else if(guess<num)
		{
			System.out.println("You have come close\n");
		}
		else
		{
			System.out.println("Your guess has matched\n\"You Win \"\n");
			break;
		}
	}
	System.out.println("The Guessed Number is "+num);
	}
}