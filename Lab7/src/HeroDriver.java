import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//made October 19, 2018
public class HeroDriver extends Application
{
	Scene currentScene;
	Player player1;
	
	Stage stage;

	public static void main(String[] args) 
	{
		launch(args);

	}
	
	public void start(Stage primaryStage) throws Exception, FileNotFoundException
	{
		// Start screen
		Text startScreenText = new Text("Press the button to begin!");
		startScreenText.relocate(220, 200);
		
		Button startScreenButton = new Button("Go!");
		startScreenButton.relocate(280, 230);
		startScreenButton.setOnAction(this::startButton);
		
		Group startScreenGroup = new Group(startScreenText, startScreenButton);
		Scene startScreenScene = new Scene(startScreenGroup, 600, 600);
		currentScene = startScreenScene;
		
		// Game
		Group myGroup = new Group();
		player1 = new Player(new Scene(myGroup, 600, 600), myGroup);
				
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
