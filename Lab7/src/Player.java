
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

//made October 19, 2018

//Movement code located in comments below right now.
public class Player
{
	
	private int score;
	private Scene primaryScene;
	public Group myGroup;
	public Stage firstStage;
	public ImageView imgView;
	
	
	//Constructor----------------------
	public Player(Scene primaryScene, Group myGroup)
	{
		this.score = 0;	
		this.primaryScene = primaryScene;
		this.myGroup = myGroup;
		imgView = new ImageView(new Image("file:src/littleViking.png"));
		imgView.relocate(250, 250);
	}
		
	
	public int playerScore()
	{
		return score;
	}
	
	//Public Scene for the Driver----------------
	public Scene playermove()
	{
		myGroup.getChildren().add(imgView);
		
		primaryScene.setOnKeyPressed(this::move);
		
		return primaryScene;
	}
	
	public void move(KeyEvent movement)
	{
		switch(movement.getCode())
		{
			case D:
				imgView.setX(imgView.getX()+20);
				//currentScore.setText("Current Score: " + addScore.playerScore());
				break;
			case A:
				imgView.setX(imgView.getX()-20);
				//currentScore.setText("Current Score: " + addScore.playerScore());
				break;
			case W:
				imgView.setY(imgView.getY()-20);
				//currentScore.setText("Current Score: " + addScore.playerScore());
				break;
			case S:
				imgView.setY(imgView.getY()+20);
				//currentScore.setText("Current Score: " + addScore.playerScore());
				break;
				default:
				break;
		}	
	}
}
