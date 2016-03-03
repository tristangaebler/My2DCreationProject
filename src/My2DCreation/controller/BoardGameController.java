package My2DCreation.controller;

import My2DCreation.model.*;
import My2DCreation.view.*;

public class BoardGameController
{
	
	private BoardGameFrame baseFrame;
	private Boardgame [][] myGame;
	
	
	public BoardGameController()
	{
		myGame = new Boardgame[3][3];
		setUpBoardgame();
		baseFrame = new BoardGameFrame();
		
	}

	public void start()
	{
		
	}
	
	/**
	 * This the 2DBoardGame Array. Looping through the rows and then the columns. 
	 */
	private void setUpBoardgame()
	{
		for(int row = 0; row < myGame.length; row++)
		{
			for(int col = 0; col < myGame[0].length; col++)
			{
				myGame[row][col] = new Boardgame();

					myGame[row][col].setTypeOfBoardgame("This board game is a startgey game");
					myGame[row][col].setMinPlayers(2);

					myGame[row][col].setGameBoardName("The Settlers of Catan");
					myGame[row][col].setMaxPlayers(4);
			}
		}
	}
}
