import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.Timer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

//made October 19, 2018
public class HeroDriver extends Application
{
	

	Scene currentScene;
	Player player1;
	Enemy enemy;
	
	Scene myScene;
	private Timer myTimer;
	Stage stage;

	Rectangle2D psb = Screen.getPrimary().getVisualBounds();
	
	public static void main(String[] args) 
	{
		launch(args);

	}
	
	public void start(Stage primaryStage) throws Exception, FileNotFoundException
	{
		// Start screen
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
		
		Group myGroup = new Group();
		myScene = new Scene(myGroup, psb.getWidth() *.9, psb.getHeight() * .9);
		
		player1 = new Player(myScene, playerImage);
		player1.playermove();
		
		enemy = new Enemy(myScene, enemyImage, primaryStage, gameOverScene);
		enemy.chasePlayer(player1);
		
		myGroup.getChildren().addAll(player1.getImgView(), enemy.getImgView());
				
		//player1.addCoin(new Coin());
		
		// Stage
		this.stage = primaryStage;
		primaryStage.setTitle("My Game");
		primaryStage.setScene(startScreenScene);
		primaryStage.show();
		//primaryStage.refreshScreen();
	}
	
	public void startButton(ActionEvent args)
	{
		stage.setScene(myScene);
	}
	
	public void refreshScreen()
	{
		
		myTimer = new Timer(50, new myTimeHandler());
		myTimer.start();
	}
	private class myTimeHandler implements ActionListener
	{
		

		@Override
		public void actionPerformed(java.awt.event.ActionEvent e) {
			// TODO Auto-generated method stub
			//stage.setScene(player1.playermove());
			
		}
			
		}
}
