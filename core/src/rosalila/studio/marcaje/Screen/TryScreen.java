package rosalila.studio.marcaje.Screen;

import rosalila.studio.marcaje.MarcajeMain;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class TryScreen extends AbstractScreen {

	Image image;
	
	public TryScreen(MarcajeMain game) {
		super(game);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(1, 1, 1, 1);
		stage.act();
		stage.draw();
	}

	@Override
	public void show() {
//		stage = new Stage();
//		stage.getViewport().update(560, 1536, true);
		Gdx.input.setInputProcessor(stage);
		
		image = new Image(game.getTexture("badlogic.jpg"));
		image.setPosition(200, 200);
		image.addListener(new ClickListener(){
			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				image.remove();
				game.setScreen(new ActivityScreen(game));
				return true;
			}
		});
		
		stage.addActor(image);
	}

	@Override
	public void hide() {
		Gdx.input.setInputProcessor(null);
		stage.clear();
	}

	@Override
	public void dispose() {
		stage.dispose();
	}
	
	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
//		stage.getViewport().update(560, 1536, true);
	}

}
