package rosalila.studio.marcaje;

import rosalila.studio.marcaje.Screen.ActivityScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MarcajeMain extends Game {
	public static AssetManager MANAGER;
//	private SpriteBatch batch;
	
	@Override
	public void create () {
		MANAGER = new AssetManager();
//		batch = new SpriteBatch();
		
		initAssets();
		
		while(!MANAGER.update()){
			
		}
		
		setScreen(new ActivityScreen(this));
	}
	
	@Override
	public void dispose() {
		super.dispose();
		MANAGER.dispose();
	}
	
	private void initAssets(){
		MANAGER.load("badlogic.jpg", Texture.class);
	}
	
	public Texture getTexture(String name){
		return MANAGER.get(name, Texture.class);
	}
	
//	public SpriteBatch getSpriteBatch(){
//		return batch;
//	}
}
