import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//made October 19, 2018
public class HeroDriver extends Application{

	public static void main(String[] args) 
	{
		launch(args);

	}
	
	
	public void start(Stage primaryStage) throws Exception, FileNotFoundException
	{
		Text myText = new Text("Hello World");
		Group gameplay = new Group(myText);
		Scene gameScene = new Scene(gameplay,600,600);
		Player game =new Player(gameScene);
		
		
		
		primaryStage.setTitle("My Game");
		
		primaryStage.setScene(game.playermove());
		primaryStage.show();
		
		
		

	
	}
}
