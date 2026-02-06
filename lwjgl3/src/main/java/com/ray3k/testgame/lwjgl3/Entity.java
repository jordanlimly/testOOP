package com.ray3k.testgame.lwjgl3;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class Entity implements iMovable{
	private float x;
	private float y;
	private float speed;
	private Color color;
	
	public Entity() { // default constructor
		this.x = 0;
		this.y = 0;
		this.speed = 0;
		this.color = null;
	}
	
	public Entity(float x, float y, Color color, float speed) { // parameterized constructor
		this.x = x;
		this.y = y;
		this.color = color;
		this.speed = speed;
    }
	
	// getter
	public float getX() { return x; }    
    public float getY() { return y; }    
    public float getSpeed() { return speed; }   
    public Color getColor() { return color; }
    
    // setter
    public void setX(float x) { this.x = x; }
    public void setY(float y) { this.y = y; }
    public void setSpeed(float speed) { this.speed = speed; }
    public void setColor(Color color) { this.color = color; }
    
    // overloaded draw methods
    public void draw(SpriteBatch batch) {}
    public void draw(ShapeRenderer shape) {}
    
    public void movement() {}
    
    // Lab 4 codes addition
    public abstract void update(); //forces subclasses to implement their own update logic
}
