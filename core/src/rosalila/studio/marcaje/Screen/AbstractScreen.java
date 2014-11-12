package rosalila.studio.marcaje.Screen;

import rosalila.studio.marcaje.MarcajeMain;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Stage;

public abstract class AbstractScreen implements Screen {
	protected MarcajeMain game;
	protected int width, height;

	public AbstractScreen(MarcajeMain game) {
		this.game=game;
		width=game.width;
		height=game.height;
	}

	@Override
	public void pause() {
		
	}
	
	@Override
	public void resize(int width, int height) {
		
	}
	
	@Override
	public void resume() {
		
	}

}
