package rosalila.studio.marcaje.Screen;

import rosalila.studio.marcaje.MarcajeMain;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Stage;

public abstract class AbstractScreen implements Screen {
	protected MarcajeMain game;
	protected Stage stage;

	public AbstractScreen(MarcajeMain game) {
		this.game=game;
		stage = new Stage();
		stage.getViewport().update(560, 1536, true);
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(560, 1536, true);
	}
	
	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

}
