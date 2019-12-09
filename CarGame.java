package racingGame;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

/**
   This program implements a Car Racing Game.
*/
public class CarGame 
{
   public static void main(String[] args) throws IOException
   {
	   // set the frame contents to display the Game Menu
	   JFrame menu = new JFrame("WELCOME TO RACE WARS");
	   JButton easy = new JButton("EASY");
	   easy.setSize(10,10);
	   JButton medium = new JButton("MEDIUM");
	   medium.setSize(10,10);
	   JButton hard = new JButton("HARD");
	   hard.setSize(10,10);
	   JButton impossible = new JButton("IMPOSSIBLE");
	   impossible.setSize(10,10);
	   
	   // align the Game Menu buttons
	   easy.setAlignmentX(Component.CENTER_ALIGNMENT);
	   medium.setAlignmentX(Component.CENTER_ALIGNMENT);
	   hard.setAlignmentX(Component.CENTER_ALIGNMENT);
	   impossible.setAlignmentX(Component.CENTER_ALIGNMENT);
	   
	   // assign appropriate difficulty based off of the user's choice.
	   easy.addActionListener(new GameDifficulty(500));
	   medium.addActionListener(new GameDifficulty(250));
	   hard.addActionListener(new GameDifficulty(125));
	   impossible.addActionListener(new GameDifficulty(25));
	  
	   // set the menu's background image
	   JLabel contentPane = new JLabel();
	   contentPane.setIcon(new ImageIcon("gameImages/background.jpg"));
	   contentPane.setLayout(new BorderLayout());
	   menu.setContentPane(contentPane);
	   
	   // add components to the main menu's frame
	   menu.getContentPane().setLayout(new BoxLayout(menu.getContentPane(), BoxLayout.Y_AXIS));
	   JLabel directions = new JLabel("Select a difficulty, then press *SPACEBAR* to start playing.");
	   directions.setAlignmentX(Component.CENTER_ALIGNMENT);
	   menu.add(directions);
	   menu.add(easy);
	   menu.add(medium);
	   menu.add(hard);
	   menu.add(impossible);
	   menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   menu.setSize(671,684);
	   menu.setVisible(true);

   }
}
