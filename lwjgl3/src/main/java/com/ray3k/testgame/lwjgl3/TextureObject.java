package com.ray3k.testgame.lwjgl3;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TextureObject extends Entity{
	private Texture tex;
//	private float x;
//	private float y;
//	private float speed;
//	private SpriteBatch batch;
	private boolean isAI; // Lab 04 addition
	    
//    public TextureObject(String fileName, float x, float y, float speed, SpriteBatch batch) {
//        this.tex = new Texture(fileName);
//        this.x = x;
//        this.y = y;
//        this.speed = speed;
//        this.batch = batch;
//    }
//
//    // Getters
//    public Texture getTexture() {
//        return tex;
//    }
//
//    public float getX() {
//        return x;
//    }
//
//    public float getY() {
//        return y;
//    }
//
//    public float getSpeed() {
//        return speed;
//    }
//
//    // Setters
//    public void setX(float x) {
//        this.x = x;
//    }
//
//    public void setY(float y) {
//        this.y = y;
//    }
//
//    public void setSpeed(float speed) {
//        this.speed = speed;
//    }
//    
//    // Movement logic (for drops)
//    public void move() {
//        y -= speed;
//    }
	
	public TextureObject(String fileName, float x, float y, float speed, boolean isAI) {
        super(x, y, null, speed);
        tex = new Texture(Gdx.files.internal(fileName));
        this.isAI = isAI;  // Lab 04 addition
    }

	// getter
    public Texture getTexture() { return tex; }

    @Override
    public void draw(SpriteBatch batch) {
        batch.draw(tex, getX(), getY());
    }

    @Override
    public void movement() {
    	if (isAI) aiMovement(); else userMovement(); // differentiate between bucket and drop movement
    }
    
    public void userMovement() {
        if (Gdx.input.isKeyPressed(Keys.LEFT)) setX(getX() - getSpeed());
        if (Gdx.input.isKeyPressed(Keys.RIGHT)) setX(getX() + getSpeed());
    }
    
    public void aiMovement() {
        setY(getY() - getSpeed());
        if (getY() < 0) setY(480);
    }

    @Override
    // Lab 04 codes addition
    public void update() {
    	System.out.println("In TextureObject at " + getX() + "," + getY() + " position");
    }
   
    
}