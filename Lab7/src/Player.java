
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
	public Player(Scene primaryScene, Group myGroup)
	{
		this.score = 0;	
		this.primaryScene = primaryScene;
		this.myGroup = myGroup;
		imgView = new ImageView(new Image("file:src/littleViking.png"));
		imgView.relocate(psb.getWidth() * .2, psb.getHeight() * .7);
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
	
	public Scene getScene()
	{
		return primaryScene;
	}
	
	//Public Scene for the Driver----------------
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
	
	
	public Scene playermove()
	{
		myGroup.getChildren().add(imgView);
		
		primaryScene.setOnKeyPressed(this::move);
		
		return primaryScene;
	}
	
//use intersect code;
	public void move(KeyEvent movement)
	{
		switch(movement.getCode())
		{
			case D:
				imgView.relocate(imgView.getLayoutX() + 5, imgView.getLayoutY());
				//currentScore.setText("Current Score: " + addScore.playerScore());
				break;
			case A:
				imgView.relocate(imgView.getLayoutX() - 5, imgView.getLayoutY());
				//currentScore.setText("Current Score: " + addScore.playerScore());
				break;
			case W:
				imgView.relocate(imgView.getLayoutX(), imgView.getLayoutY()-5);
				//currentScore.setText("Current Score: " + addScore.playerScore());
				break;
			case S:
				imgView.relocate(imgView.getLayoutX(), imgView.getLayoutY()+5);
				//currentScore.setText("Current Score: " + addScore.playerScore());
				break;
			default:
				break;
		}
	}
}
