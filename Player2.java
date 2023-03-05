import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Player2 implements Player{
	ImageIcon play2=new ImageIcon("D:\\college\\finalproject\\img\\playing.png");//create image play2
	public void speak() { //function speak(), show user the sequence of move in the game
		JOptionPane.showMessageDialog(null, "Hello,This is Player2. I am in the second move.","Minesweeper",JOptionPane.PLAIN_MESSAGE,play2);
	   
	}
}