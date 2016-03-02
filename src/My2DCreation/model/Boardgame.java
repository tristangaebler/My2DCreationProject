package My2DCreation.model;

public class Boardgame 
{

	private String gameBoardName;
	private String typeOfBoardgame;
	private int maxPlayers;
	private int minPlayers;
	
	public Boardgame() 
	{
		this.gameBoardName = "Settlers of Catan";
		this.typeOfBoardgame = "Strategy";
		this.maxPlayers = 4;
		this.minPlayers  = 2;
	}


	public Boardgame(String gameBoardName, String typeOfBoardGame, int maxPlayers, int minPlayers)
	{
		this.gameBoardName = gameBoardName;
		this.typeOfBoardgame = typeOfBoardGame;
		this.maxPlayers = maxPlayers;
		this.minPlayers = minPlayers;
	}
	
	public String getGameBoardName() 
	{
		return gameBoardName;
	}

	public void setGameBoardName(String gameBoardName)
	{
		this.gameBoardName = gameBoardName;
	}

	public String toString()
	{
		String game = "The boardgame is " + gameBoardName + ", and it can play max" + maxPlayers + " players, and minimum " + minPlayers + " players. It's a " + typeOfBoardgame + " game";
		
		return game;
	}
	
	public String getTypeOfBoardgame()
	{
		return typeOfBoardgame;
	}

	public void setTypeOfBoardgame(String typeOfBoardgame) 
	{
		this.typeOfBoardgame = typeOfBoardgame;
	}

	public int getMaxPlayers()
	{
		return maxPlayers;
	}

	public void setMaxPlayers(int maxPlayers) 
	{
		this.maxPlayers = maxPlayers;
	}

	public int getMinPlayers() 
	{
		return minPlayers;
	}

	public void setMinPlayers(int minPlayers) 
	{
		this.minPlayers = minPlayers;
	}

	
}
