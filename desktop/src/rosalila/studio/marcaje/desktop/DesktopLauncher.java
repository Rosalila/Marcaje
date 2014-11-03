package rosalila.studio.marcaje.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import rosalila.studio.marcaje.MarcajeMain;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 560;
		config.height = 1536;
		new LwjglApplication(new MarcajeMain(), config);
	}
}
