package racingGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;

public class CarRunnable implements Runnable, KeyListener {	
	 private int DELAY;
	 private MoveableShape shape;
	 private JLabel label;

	 public CarRunnable(int DELAY, MoveableShape shape, JLabel label) {
	 	this.DELAY = DELAY;
	 	this.shape = shape;
	 	this.label = label;
 }     
    
    	
   
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			  shape.move();
	           label.repaint();
		  }
	  
	  
	}
	@Override
	public void keyReleased(KeyEvent a) {
		// TODO Auto-generated method stub
		 if(a.getKeyCode()==KeyEvent.VK_A) {
			  shape.move();
	           label.repaint();
		  }
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
