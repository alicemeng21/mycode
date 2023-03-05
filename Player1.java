import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Player1 implements Player{
	ImageIcon play1=new ImageIcon("D:\\college\\finalproject\\img\\playing.png");//create image play1
	public void speak() {  //function speak(), show the sequence of the move in the game
		JOptionPane.showMessageDialog(null,"Hello, this is Player 1. I am in the first move","Minesweeper", JOptionPane.PLAIN_MESSAGE,play1);
	  
	}
	
}
