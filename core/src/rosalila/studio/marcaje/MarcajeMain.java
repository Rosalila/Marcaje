package rosalila.studio.marcaje;

import rosalila.studio.marcaje.Screen.ActivityScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.ScalingViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MarcajeMain extends Game {
	public static AssetManager MANAGER;
	private SpriteBatch batch;
	public Viewport view;
	public int width=500, height=1536;
	
	@Override
	public void create () {
		MANAGER = new AssetManager();
		view = new ScalingViewport(Scaling.stretch, width, height);
		batch = new SpriteBatch();
		
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
		MANAGER.load("Jaduken.png", Texture.class);
	}
	
	public Texture getTexture(String name){
		return MANAGER.get(name, Texture.class);
	}
	
	public SpriteBatch getSpriteBatch(){
		return batch;
	}
}
