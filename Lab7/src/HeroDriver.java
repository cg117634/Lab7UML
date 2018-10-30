import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

//made October 19, 2018
public class HeroDriver extends Application
{
	Scene currentScene;
	Player player1;
	Enemy enemy;
	
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
		currentScene = startScreenScene;
		
		// Game
		Group myGroup = new Group();
		player1 = new Player(new Scene(myGroup, psb.getWidth() * .9, psb.getHeight() * .9), myGroup);
		player1.addEnemy(new Enemy());
		
		// Stage
		this.stage = primaryStage;
		primaryStage.setTitle("My Game");
		primaryStage.setScene(currentScene);
		primaryStage.show();
	}
	
	public void startButton(ActionEvent args)
	{
		stage.setScene(player1.playermove());
	}
}
