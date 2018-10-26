
import javafx.application.Application;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


//made October 19, 2018

//Movement code located in comments below right now.
public class Player extends Application{
	
	private int score;
	public String scene;
	public String primaryStage;
	
	
	
	public Player(int score) 
	{
		this.score=score;
	}
	
	public Player( String scene, String primaryStage) 
	{
		this.scene = scene;
		this.primaryStage = primaryStage;
	}
	public int playerScore() {
		
		return score;
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
	}

}
/*

public void move(KeyEvent movement) {
	
	switch(movement.getCode()) {
	case D:
		imgView.setX(imgView.getX()+20);
		currentScore.setText("Current Score: " + addScore.playerScore());
		
		break;
	case A:
		imgView.setX(imgView.getX()-20);
		currentScore.setText("Current Score: " + addScore.playerScore());
		break;
	case W:
		imgView.setY(imgView.getY()-20);
		currentScore.setText("Current Score: " + addScore.playerScore());
		break;
	case S:
		imgView.setY(imgView.getY()+20);
		currentScore.setText("Current Score: " + addScore.playerScore());
		
		break;
		default:
		break;
		
	}
	
	
	
}*/