import java.util.*;
public class runner_TicTacToe
{
public static void main(String[] args)
	{
        try (Scanner scan = new Scanner(System.in)) {
			TicTacToe game = new TicTacToe();

			System.out.println("What is your name?");
			String player = scan.nextLine();
			
			
			game.addPlayer(player);

			System.out.println("What is the name of player 2?");
			String player2 = scan.nextLine();

			game.addPlayer(player2);
			
//System.out.println("Type 'START' to begin");
//String start = scan.nextLine();
//start.toUpperCase();
//if(start.equals("START"))
System.out.println("Start!");
System.out.println(game);


			String currentPlayer = player;

			while(game.WinCheck() == 3)
			{
				boolean moveWorks = false;
				while(!moveWorks)
				{
				System.out.println(currentPlayer + " choose a row");
				int row = scan.nextInt();
				System.out.println("Choose a column");
				int col = scan.nextInt();
				moveWorks = game.Play(row, col, currentPlayer);
				if(!moveWorks)
				{
					System.out.println("Choose another position.");
				}
			}
			System.out.println(game);
				if(game.WinCheck() == 1)
			{
				System.out.println(currentPlayer + " WINNER!");
				break;
			}
				if(game.WinCheck() == 2)
			{
				System.out.println(" Cat's Game.");
				break;
			}
			if(currentPlayer.equals(player))
			{
				currentPlayer = player2;
			}
			else
			{
				currentPlayer = player;
			}
			}
		}
		
	}
}

