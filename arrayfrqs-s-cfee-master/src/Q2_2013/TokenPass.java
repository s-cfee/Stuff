package Q2_2013;

public class TokenPass {

	private int[] board; 
	private int currentPlayer; 



	public TokenPass(int playerCount){
		
		board = new int[playerCount];
		
	for(int ptokens = 0; ptokens < playerCount; ptokens++){
		board[ptokens] = (int)(Math.random() * 10);
		
	}
		currentPlayer = (int)(Math.random() * playerCount);

	} 



	public void distributeCurrentPlayerTokens() 
	{ int token = board[currentPlayer];
	
	board[currentPlayer] = 0;
	
	
	while(token > board.length){
		for(int x = 0; x < board.length; x++){ //forloop1
			board[x]++;
			token--;
		}
		
	}
	if(token < board.length && token > 0){	//forloop2
		for(int g = 0; g < token; g++){
			board[g]++;
			token--;
		}
	}

	} 


	public void printInfo()
	{
		for(int i=0; i<board.length; i++)
		{
			System.out.print( "(p" + i + " : token " + board[i]  + ")" + ", ");
		}
		System.out.print("\nCurrent Player: " + currentPlayer + "\n");
	}

	public int getCurrentPlayer()
	{
		return currentPlayer;
	}

	public int[] getBoard()
	{
		return board;
	}


}
