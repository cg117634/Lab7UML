import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

public class Coin {
	private Rectangle2D psb = Screen.getPrimary().getVisualBounds();
	private ImageView imgView;
	
	public Coin()
	{
		
		imgView = new ImageView(new Image("file:src/coin.png"));
		imgView.relocate(psb.getWidth() * .1, psb.getHeight() * .1);
		imgView.setFitHeight(30);
		imgView.setFitWidth(30);
	}
	
	public ImageView getImgView()
	{
		return imgView;
	}
	

}
