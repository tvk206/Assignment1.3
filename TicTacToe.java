import javax.swing.JApplet;
import java.awt.Graphics;
public class TicTacToe extends JApplet
{
	public void paint(Graphics canvas)
	{
		//Tic Tac Toe Grid
		super.paint(canvas);					 
		canvas.drawLine(250, 0, 250, 500);		 //Left vertical line
		canvas.drawLine(500, 0, 500, 500);		 //Right vertical line
		canvas.drawLine(0, 150, 750, 150);		 //Top horizontal line
		canvas.drawLine(0, 350, 750, 350);		 //Bottom horizontal line
		
		//Circles
		canvas.drawOval(50, 0, 125, 125); 		//Top-left Circle
		canvas.drawOval(315, 0, 125, 125); 		//Top Circle
		canvas.drawOval(50, 185, 125, 125);		//Left Circle
		canvas.drawOval(315, 375, 125, 125);	//bottom Circle
		canvas.drawOval(575, 375, 125, 125);	//Bottom-right Circle
		
		// Xs
		canvas.drawLine(50, 375, 175, 500);	
		canvas.drawLine(50, 500, 175, 375);		//Bottom-left X
		canvas.drawLine(315, 185, 440, 310);	
		canvas.drawLine(315, 310, 440, 185);	//Middle X
		canvas.drawLine(575, 185, 700, 310);	
		canvas.drawLine(700, 185, 575, 310);	//Right X
		canvas.drawLine(575, 0, 700, 125);	
		canvas.drawLine(575, 125, 700, 0);		//Top-Right X
		
		//Strike-Through
		canvas.drawLine(50, 500, 700, 0);
		
	}
}