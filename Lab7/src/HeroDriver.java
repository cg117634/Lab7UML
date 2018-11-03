import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

//made October 19, 2018
public class HeroDriver extends Application
{
	

	Scene currentScene;
	Player player1;
	Enemy enemy;
	Coin coin;
	Label scoreLabel;
	Scene myScene;
	Stage stage;
	int scoreNumber;

	Rectangle2D psb = Screen.getPrimary().getVisualBounds();
	
	public static void main(String[] args) 
	{
		launch(args);

	}
	
	public void start(Stage primaryStage) throws Exception, FileNotFoundException
	{
		// Start screen
		scoreLabel = new Label("Score: ");
		scoreNumber = 0;
		
		Text startScreenText = new Text("Press the button to begin!\n\tMove with WASD");
		startScreenText.relocate(psb.getWidth() * .4, psb.getHeight() * .2);
		
		Button startScreenButton = new Button("Go!");
		startScreenButton.relocate(psb.getWidth() * .44, psb.getHeight() * .3);
		startScreenButton.setOnAction(this::startButton);
		
		Group startScreenGroup = new Group(startScreenText, startScreenButton);
		Scene startScreenScene = new Scene(startScreenGroup, psb.getWidth() * .9, psb.getHeight() * .9);
		
		
		// Game over scene
		Text gameOverText = new Text("Game Over");
		gameOverText.relocate(500, 500);
		
		Group gameOverGroup = new Group(gameOverText);
		Scene gameOverScene = new Scene(gameOverGroup, psb.getWidth() * .9, psb.getHeight() * .9);

		
		// Game
		Image playerImage = new Image("file:src/littleViking.png");
		Image enemyImage = new Image("file:src/enemy.png");
		Image coinImage = new Image("file:src/coin.png");
		
		Group myGroup = new Group();
		myScene = new Scene(myGroup, psb.getWidth() *.9, psb.getHeight() * .9);
		
		
		
		enemy = new Enemy(myScene, enemyImage, primaryStage, gameOverScene);
		coin = new Coin(myScene, coinImage,primaryStage);
		
		
		player1 = new Player(myScene, playerImage,primaryStage,enemy,coin, scoreNumber, scoreLabel);
		player1.playermove();
		enemy.chasePlayer(player1);
		scoreNumber = player1.playerScore();
		
		myGroup.getChildren().addAll(player1.getImgView(), enemy.getImgView(),coin.getImgView(),scoreLabel);
		scoreLabel.setText("Score: " + scoreNumber);	
	
		//player1.addCoin(new Coin());
		
		// Stage
		this.stage = primaryStage;
		primaryStage.setTitle("My Game");
		primaryStage.setScene(startScreenScene);
		//stage.setScene(gameOverScene);
		primaryStage.show();
		//primaryStage.refreshScreen();
	}
	
	public void startButton(ActionEvent args)
	{
		stage.setScene(myScene);
	}
	
	
	
}
		
