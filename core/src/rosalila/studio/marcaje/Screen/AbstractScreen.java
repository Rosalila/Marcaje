package rosalila.studio.marcaje.Screen;

import rosalila.studio.marcaje.MarcajeMain;

import com.badlogic.gdx.Screen;

public abstract class AbstractScreen implements Screen {
	protected MarcajeMain game;

	public AbstractScreen(MarcajeMain game) {
		this.game=game;
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

}
