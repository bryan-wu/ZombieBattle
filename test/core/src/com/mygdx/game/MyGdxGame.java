package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	//private Skin skin;
	private Stage stage;
	private Table table;
	private TextButton startButton;
	private TextButton instructionButton;

	@Override
	public void create () {
		//batch = new SpriteBatch();
		img = new Texture("Zombie Battle.png");
		Skin skin = new Skin(Gdx.files.internal("default/raw/uiskin.json"));
		stage = new Stage(/*new ScreenViewport()*/);
		table = new Table();
		table.setWidth(stage.getWidth());
		table.setHeight(stage.getHeight());
		startButton = new TextButton("New Game",skin);
		//startButton.getLabel().setFontScale(2f,2f);
		instructionButton = new TextButton("Instructions",skin);
		//instructionButton.getLabel().setFontScale(2f,2f);
		Image gameLogo = new Image(img);
		//gameLogo.setScale(1.2f,1.2f);
		table.setDebug(true);
		table.add(gameLogo).top();
		table.row();
		table.add(startButton);
		table.row();
		table.add(instructionButton);
		stage.addActor(table);

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.draw();
		//batch.begin();
		//batch.draw(img, Gdx.graphics.getWidth()/2 - img.getWidth()/2, Gdx.graphics.getHeight() - img.getHeight());
		//batch.end();
	}

	/*@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}*/
}
