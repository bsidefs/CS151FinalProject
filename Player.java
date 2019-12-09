package racingGame;

/**
 * Represents a player within the Java Car Racing Game.
 *
 */
public class Player
{
	// Instance Variable
	private int	highScore;
	
	// Constructor
	public Player()
	{
		this.highScore = 0;
	}
	
	// Methods
	/**
	 * Gets the current high score of a player.
	 * 
	 * @return	highScore	the player's current high score
	 */
	public int getHighScore()
	{
		return this.highScore;
	}
	
	/**
	 * Sets the high score of a player.
	 * @param 	highScore	the player's new high score
	 */
	public void setHighScore(double highScore) 
	{
		switch ((int) highScore)
		{
			case 500: this.highScore = (int) (highScore);
					break;
			case 250: this.highScore = (int) (highScore * 100);
					break;
			case 125: this.highScore = (int) (highScore * 1000); 
					break;
			case 25: this.highScore = (int) (highScore * 10000);
					break;
		}
	}
}
