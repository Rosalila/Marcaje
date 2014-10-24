package rosalila.studio.marcaje;

import rosalila.studio.marcaje.Screen.ActivityScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MarcajeMain extends Game {
	public static AssetManager MANAGER;
	private SpriteBatch batch;
	
	@Override
	public void create () {
		MANAGER = new AssetManager();
		batch = new SpriteBatch();
		setScreen(new ActivityScreen(this));//error
	}
	
	@Override
	public void dispose() {
		super.dispose();
		MANAGER.dispose();
	}
	
	public SpriteBatch getSpriteBatch(){
		return batch;
	}
}
