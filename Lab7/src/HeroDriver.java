//made October 19, 2018
public class HeroDriver extends Application
{
	

	Scene currentScene;
	Player player1;
	Enemy enemy;
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
		currentScene = startScreenScene;
		
		// Game
		Group myGroup = new Group();
		player1 = new Player(new Scene(myGroup, psb.getWidth() * .9, psb.getHeight() * .9), myGroup);
		player1.addEnemy(new Enemy());
		player1.addCoin(new Coin());
		
		// Stage
		this.stage = primaryStage;
		primaryStage.setTitle("My Game");
		primaryStage.setScene(currentScene);
		primaryStage.show();
		//primaryStage.refreshScreen();
	}
	
	public void startButton(ActionEvent args)
	{
		stage.setScene(player1.playermove());
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
			stage.setScene(player1.playermove());
			
		}
			
		}
}
