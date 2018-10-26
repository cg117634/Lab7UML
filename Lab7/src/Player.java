<<<<<<< HEAD

=======
import javafx.scene.input.KeyEvent;
>>>>>>> branch 'master' of https://github.com/cg117634/Lab7UML

//made October 19, 2018

//Movement code located in comments below right now.
public class Player {
	
	private int score;
	
	
	public Player(int score) {
		
		this.score=score;
		
		
	}
	
	
	public int playerScore() {
		
		return score;
		
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