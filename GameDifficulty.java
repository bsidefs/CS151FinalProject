package racingGame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class GameDifficulty implements ActionListener
{
	// Instance Variable
	private int difficultyDelay;
	private static final int ICON_WIDTH = 400;
	private static final int ICON_HEIGHT = 400;
	private static final int CAR_WIDTH = 100;
	private boolean terminateGame = false;
	
	public GameDifficulty(int difficultyDelay)
	{
		this.difficultyDelay = difficultyDelay;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
	      JFrame frame = new JFrame("Race Wars");
	      
	      final MoveableShape shape1 = new CarShape(0,0,CAR_WIDTH,Color.RED);
	      Player user = new Player();
	        
	      final MoveableShape shape2 = new CarShape(50,0,CAR_WIDTH,Color.GREEN);
	     
	      ShapeIcon icon = new ShapeIcon(shape1,
	            ICON_WIDTH, ICON_HEIGHT);
	      ShapeIcon icon1 = new ShapeIcon(shape2,
	              ICON_WIDTH, ICON_HEIGHT);

	      
	      final JLabel label = new JLabel(icon);
	      final JLabel label1 = new JLabel(icon1);

	      
	      JLabel contentPane = new JLabel();
		  contentPane.setIcon(new ImageIcon("gameImages/carRoad.png"));
		  contentPane.setLayout(new BorderLayout());
		  frame.setContentPane(contentPane);
		  frame.setLayout(new FlowLayout());
	     
	      frame.add(label);
	      frame.add(label1);
	     
	      frame.addKeyListener(new KeyAdapter()
	    		  {
	    	  		public void keyReleased(KeyEvent e)
	    	  		{
	    	  			if (e.getKeyCode()==KeyEvent.VK_I && !terminateGame) 
		   	              {  
		   	            	  shape1.move();
		   	            	  if (shape1.getY() == 400)
		   	            	  {
		   	            		  terminateGame = true;
		   	            		  user.setHighScore((difficultyDelay));
		   	            		  JOptionPane.showMessageDialog(frame, "CONGRATULATIONS, YOU WIN :)\n"
		   	            		  		+ "YOUR HIGH SCORE WAS " + user.getHighScore() + "!");
		   	            	  }
		   	   	              label.repaint();
		   	              }
	    	  			if (e.getKeyCode() == KeyEvent.VK_SPACE)
	    	  			{
	    	  				 Timer time = new Timer(difficultyDelay, event->
	    	  		          {
	    	  		               	  if (!terminateGame)
	    	  		               	  {
	    	  		               		  shape2.move();
	    	  		               		  if (shape2.getY() == 400)
	    	  		               		  {
	    	  		               			  terminateGame = true;
	    	  		               			  JOptionPane.showMessageDialog(frame, "YOU LOST :( \nTRY AGAIN!");
	    	  		               		  }
	    	  		               		  label1.repaint();
	    	  		               	  }
	    	  		        	  
	    	  		         });
	    	  		      time.start();
	    	  			}
	    	  		}
	    		  });
	      frame.pack();
	      frame.setVisible(true);
		
	}
}
