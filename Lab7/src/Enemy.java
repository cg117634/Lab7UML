//made October 19, 2018
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;


//testcomment
//new test 

//made October 19, 2018
public class Enemy
{
	private ImageView imgView;
	private Timer myTimer;
	private Rectangle2D psb = Screen.getPrimary().getVisualBounds();
	private Player playerToChase;
	
	
	// Constructor
	public Enemy()
	{	
		imgView = new ImageView(new Image("file:src/bomb.png"));
		imgView.relocate(psb.getWidth() * .1, psb.getHeight() * .1);
		imgView.setFitHeight(30);
		imgView.setFitWidth(30);
	}
	
	public ImageView getImgView()
	{
		return imgView;
	}
	
	public void chasePlayer(Player player)
	{
		this.playerToChase = player;
		myTimer = new Timer(50, new myTimeHandler());
		myTimer.start();
	}

	private class myTimeHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			
			
			while(playerToChase.getXCoordinate() > imgView.getLayoutX()) {
				imgView.relocate(imgView.getLayoutX() + 1, imgView.getLayoutY());
				break;
			}
			while(playerToChase.getXCoordinate() < imgView.getLayoutX())
			{
				imgView.relocate(imgView.getLayoutX() - 1, imgView.getLayoutX());
				break;
			}
			while(playerToChase.getYCoordinate() > imgView.getLayoutY())
			{
				imgView.relocate(imgView.getLayoutX(), imgView.getLayoutY() + 1);
				break;
			}
			while(playerToChase.getYCoordinate() < imgView.getLayoutY())
			{
				imgView.relocate(imgView.getLayoutX(), imgView.getLayoutY() - 1);
				break;
			}

		}
	}
}
