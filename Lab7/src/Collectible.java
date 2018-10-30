import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

public class Collectible
{
	private ImageView imgView;
	private Rectangle2D psb = Screen.getPrimary().getVisualBounds();
	
	
	// Constructor
	public Collectible()
	{
		imgView = new ImageView(new Image("file:src/coin.png"));
		imgView.relocate(psb.getWidth() * .9, psb.getHeight() * .9);
		imgView.setFitHeight(30);
		imgView.setFitWidth(30);
	}	
}
