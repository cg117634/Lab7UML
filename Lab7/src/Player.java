
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Screen;
import javafx.stage.Stage;

//made October 19, 2018

//Movement code located in comments below right now.
public class Player
{
	
	private int score;
	private Scene primaryScene;
	public Group myGroup;
	public Stage firstStage;
	private ImageView imgView;
	private Rectangle2D psb = Screen.getPrimary().getVisualBounds();

	
	//Constructor----------------------
	public Player(Scene primaryScene, Image inputImage)
	{
		this.score = 0;	
		this.primaryScene = primaryScene;
		this.imgView = new ImageView(inputImage);
		imgView.relocate(psb.getWidth() * .2, psb.getHeight() * .7);
	}
	
	
	public ImageView getImgView()
	{
		return imgView;
	}
		
	public double getXCoordinate()
	{
		return imgView.getLayoutX();
	}
	
	public double getYCoordinate()
	{
		return imgView.getLayoutY();
	}
	
	public int playerScore()
	{
		return score;
	}
	
	//Public Scene for the Driver----------------
	public void playermove()
	{
		primaryScene.setOnKeyPressed(this::move);
	}
	
	public Scene addEnemy(Enemy enemy)
	{
		enemy.chasePlayer(this);
		
		myGroup.getChildren().add(enemy.getImgView());
				
		return primaryScene;
	}
	
	public Scene addCoin(Coin coin)
	{
		
		
		myGroup.getChildren().add(coin.getImgView());
				
		return primaryScene;
	}
	
	
//use intersect code;
	public void move(KeyEvent movement)
	{
		switch(movement.getCode())
		{
			case D:
				imgView.setLayoutX(imgView.getLayoutX() + 10);
				//currentScore.setText("Current Score: " + addScore.playerScore());
				break;
			case A:
				imgView.setLayoutX(imgView.getLayoutX() - 10);
				//currentScore.setText("Current Score: " + addScore.playerScore());
				break;
			case W:
				imgView.setLayoutY(imgView.getLayoutY() - 10);
				//currentScore.setText("Current Score: " + addScore.playerScore());
				break;
			case S:
				imgView.setLayoutY(imgView.getLayoutY() + 10);
				//currentScore.setText("Current Score: " + addScore.playerScore());
				break;
			default:
				break;
		}
	}
	public boolean areRectsColliding(double r1TopLeftX, double
		r1BottomRightX,double r1TopLeftY, double r1BottomRightY, double
		r2TopLeftX,double r2BottomRightX, double r2TopLeftY, double
		r2BottomRightY)
	{
		if (r1TopLeftX < r2BottomRightX && r1BottomRightX >
			r2TopLeftX && r1TopLeftY < r2BottomRightY && r1BottomRightY >
			r2TopLeftY) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
