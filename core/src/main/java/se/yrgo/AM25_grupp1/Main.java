package se.yrgo.AM25_grupp1;

import com.badlogic.gdx.Game;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends Game {
    private FirstScreen firstScreen;
    @Override
    public void create() {
        setScreen(new FirstScreen(this));
    }
}
