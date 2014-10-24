package rosalila.studio.marcaje.Screen;

import rosalila.studio.marcaje.MarcajeMain;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.viewport.Viewport;

public class ActivityScreen extends AbstractScreen {
	private Stage stage;

	public ActivityScreen(MarcajeMain game) {
		super(game);
		
	}

	@Override
	public void show() {
		stage = new Stage();
		stage.getViewport().update(400, 700, true);
		
		Image image = new Image(new Texture(Gdx.files.internal("badlogic.jpg")));
		
		stage.addActor(image);
	}

	@Override
	public void render(float delta) {
		stage.draw();
		stage.act();
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		
	}
	
	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		stage.getViewport().update(400, 700);;
	}
}
