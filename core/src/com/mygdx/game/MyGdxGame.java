package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	ShapeRenderer shape;
	Texture background_image;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		shape = new ShapeRenderer();
		background_image = new Texture("Grassy_Mountains_preview.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // clear every frame
		
		batch.begin();
		batch.draw(background_image, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.end(); // draw background
		
		shape.begin(ShapeType.Filled);
		shape.setColor(0, 0, 0, 0);
		shape.rect(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight()/4);
		shape.end();
	}
	
}
