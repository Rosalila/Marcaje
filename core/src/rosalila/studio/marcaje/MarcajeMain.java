package rosalila.studio.marcaje;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MarcajeMain extends Game {
	public static AssetManager MANAGER;
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		MANAGER = new AssetManager();
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}
	
	@Override
	public void dispose() {
		super.dispose();
		MANAGER.dispose();
	}
}
