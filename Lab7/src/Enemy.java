//made October 19, 2018
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;
import javafx.stage.Stage;


//testcomment
//new test 

//made October 19, 2018
public class Enemy
{
	private ImageView imgView;
	private Timer myTimer;
	private Rectangle2D psb = Screen.getPrimary().getVisualBounds();
	private Player playerToChase;
	private Stage stage;
	private Scene gameOverScene;
	
	
	// Constructor
	public Enemy(Scene primaryScene, Image inputImage, Stage stage, Scene gameOverScene)
	{	
		this.imgView = new ImageView(inputImage);
		this.stage = stage;
		this.gameOverScene = gameOverScene;
		imgView.relocate(psb.getWidth() * .1, psb.getHeight() * .1);
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
			if (playerToChase.getXCoordinate() > imgView.getLayoutX())
			{
				imgView.setLayoutX(imgView.getLayoutX() + 3);
			}
			if (playerToChase.getXCoordinate() < imgView.getLayoutX())
			{
				imgView.setLayoutX(imgView.getLayoutX() - 3);
			}
			if (playerToChase.getYCoordinate() > imgView.getLayoutY())
			{
				imgView.setLayoutY(imgView.getLayoutY() + 3);
			}
			if (playerToChase.getYCoordinate() < imgView.getLayoutY())
			{
				imgView.setLayoutY(imgView.getLayoutY() - 3);
			}
			if (playerToChase.areRectsColliding(playerToChase.getXCoordinate(),
											playerToChase.getXCoordinate() + 79,
											playerToChase.getYCoordinate(),
											playerToChase.getYCoordinate() + 79,
											imgView.getLayoutX(),
											imgView.getLayoutX() + 40,
											imgView.getLayoutY(),
											imgView.getLayoutY() + 40)
											== true)
			{
				System.out.println("Game Over");
			}
		}
	}
}
