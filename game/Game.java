package game;
import java.util.Scanner;
public class Game {
	
	public Weapon pressButton()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Score: ");
		int score=sc.nextInt();
		sc.close();
		if(score<=400)
		{
			System.out.println("You got the Knife");
			Knife k=new Knife();
			return k;
		}
		else if(score<=800)
		{
			System.out.println("You got the Gun");
			Gun g=new Gun();
			return g;
		}
		else
		{
			System.out.println("You got the Bomb");
			Bomb b=new Bomb();
			return b;
			
		}
		
	}

}
