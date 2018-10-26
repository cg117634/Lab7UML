
<<<<<<< HEAD
import javafx.application.Application;
import javafx.scene.Scene;
=======
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
>>>>>>> branch 'master' of https://github.com/cg117634/Lab7UML
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


//made October 19, 2018

//Movement code located in comments below right now.
<<<<<<< HEAD
public class Player extends Application{
=======
public class Player extends Application {
>>>>>>> branch 'master' of https://github.com/cg117634/Lab7UML
	
	private int score;
<<<<<<< HEAD
	public String scene;
	public Scene primaryStage;
	
	
	
	
	
	public Player(int score) 
	{
		this.score=score;
=======
	private Scene primaryScene;
	public ImageView imgView;
	public Group gameplay;
	public Stage firstStage;
	
	
	public static void main(String[] args) 
	{
		launch(args);

	}
	
	
	

	//Constructors----------------------
	public Player(int score) {
		this.score=score;	
	}
	
	
	public Player(Scene primaryScene) {
		this.primaryScene=primaryScene;
>>>>>>> branch 'master' of https://github.com/cg117634/Lab7UML
	}
	
<<<<<<< HEAD
	public Player( String scene, Scene primaryStage) 
	{
		this.scene = scene;
		this.primaryStage = primaryStage;
	}
=======
	//---------------------------------------------
	
	
>>>>>>> branch 'master' of https://github.com/cg117634/Lab7UML
	public int playerScore() {
		
		return score;
		
	}
<<<<<<< HEAD

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
	}
=======
	
	//Public Scene for the Driver----------------
	public void start(Stage scene) throws Exception, FileNotFoundException
	{
		firstStage =scene; 
		
		Image player = new Image("littleViking.png");
		imgView = new ImageView(player);
		imgView.setY(500);
		gameplay = new Group(imgView);
		primaryScene = new Scene(gameplay,600,600);
		primaryScene.setOnKeyPressed(this::move);
		
		firstStage.setTitle("My Game");
		
		firstStage.setScene(primaryScene);
		firstStage.show();
		
		
	
	}
	
>>>>>>> branch 'master' of https://github.com/cg117634/Lab7UML




public void move(KeyEvent movement) {
	
	switch(movement.getCode()) {
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