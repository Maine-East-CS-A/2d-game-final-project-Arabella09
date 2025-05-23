
public class TicTacToe
{
	private String[][] gameBoard;
	private String player1;
	private String player2;
	private static int numPlayer = 0;
	private String piece1;
	private String piece2;


	public TicTacToe() //initializes the TicTacToe Board
	{
		gameBoard = new String[3][3];
		for(int r = 0; r < gameBoard.length; r++)
		{
			for(int c = 0; c < gameBoard[0].length; c++)
			{
				gameBoard[r][c] = "[ ]";
			}
		}
	}

	public void addPlayer(String n) //Creates player and assigns player a piece
	{
		numPlayer++;
		if(numPlayer == 1){
			player1 = n;
			piece1 = "X";
		}
		else if(numPlayer == 2){
			player2 = n;
			piece2 = "O";
		}
	}

	public boolean Play(int r, int c, String n) //allows player to place their piece in a spot
	{
		
			
				if(r > 2 || r < 0 || c > 2 || c < 0)
				{
					System.out.println("Invalid");
					return false;
				}
				if(!gameBoard[r][c].equals("[ ]"))
				{
					System.out.println("Position Taken.");
					return false;
				}
		
		if(gameBoard[r][c].equals("[ ]"))
		{
			if(n.equals(player1)){
			gameBoard[r][c] = "[" + piece1 + "]";
			}
			else if(n.equals(player2)){
			gameBoard[r][c] = "[" + piece2 + "]";
			}
		}
// else
// {
// 	System.out.println("Position taken. Choose Another Position.");
// 	Scanner scan = new Scanner(System.in);
// 		System.out.println(n + " choose a row");
// 			int row = scan.nextInt();
// 			System.out.println("Choose a column");
// 			int col = scan.nextInt();
// 			Play(row, col, n);
// }
		return true;
		
		// gameBoard.toString();

}



public int WinCheck()
{
	for(int i = 0; i < gameBoard.length; i++) 
	{
		
		if(!gameBoard[i][0].equals("[ ]") && gameBoard[i][0].equals(gameBoard[i][1]) && gameBoard[i][1].equals(gameBoard[i][2]))
			return 1;
		else if(!gameBoard[0][i].equals("[ ]") && gameBoard[0][i].equals(gameBoard[1][i]) && gameBoard[1][i].equals(gameBoard[2][i]))
			return 1;
	}
		if(!gameBoard[0][0].equals("[ ]") && gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][2]))
			return 1;
		if(!gameBoard[2][0].equals("[ ]") && gameBoard[2][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[0][2]))
			return 1;
	
		if(isBoardFull(gameBoard))
		{
			//System.out.println("Cat's game");
			return 2;
		}
	return 3;
}

public static boolean isBoardFull(String[][] gameBoard)
{
	for(int r = 0; r < 3; r++)
		{
			for(int c = 0; c < gameBoard[0].length; c++)
			{
				if(gameBoard[r][c].equals("[ ]"))
				{
					return false;
				}
				
			}
		}
		return true;
}

	public String toString()
	{
		String Board = "";
		for(int r = 0; r < gameBoard.length; r++)
		{
			for(int c = 0; c < gameBoard[0].length; c++)
			{
				Board += gameBoard[r][c];
			}
			Board += "\n";
		}
		return Board;
	}

}
