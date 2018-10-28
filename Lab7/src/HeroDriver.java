import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//made October 19, 2018
public class HeroDriver extends Application
{
	public static void main(String[] args) 
	{
		launch(args);

	}
	
	public void start(Stage primaryStage) throws Exception, FileNotFoundException
	{
		Group myGroup = new Group();
		Player player1 = new Player(new Scene(myGroup, 600, 600), myGroup);
				
		primaryStage.setTitle("My Game");
		
		primaryStage.setScene(player1.playermove());
		primaryStage.show();
	}
}
