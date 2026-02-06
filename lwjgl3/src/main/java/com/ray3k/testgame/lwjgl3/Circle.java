package com.ray3k.testgame.lwjgl3;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Circle extends Entity {
	private float radius;
	
	// default constructor
//	public Circle() {
//		this.color = null;
//		this.x = 0;
//		this.y = 0;
//		this.speed = 0;
//		this.radius = 0;
//	}
	
	// parameterized constructor
	public Circle(Color color, float x, float y, float speed, float radius) {
		super(x, y, color, speed);
		this.radius = radius;
	}
	
	@Override
	public void draw(ShapeRenderer shape) { 
        shape.setColor(getColor());
        shape.circle(getX(), getY(), radius);
    }
	
	@Override
    public void movement() {
        if (Gdx.input.isKeyPressed(Keys.UP)) setY(getY() + getSpeed());
        if (Gdx.input.isKeyPressed(Keys.DOWN)) setY(getY() - getSpeed());
    }
	
	@Override
    // Lab 04 codes addition
    public void update() {
		System.out.println("In circle of radius " + radius + " at " + getX() + "," + getY() + " position"); // print update info to console
    }
	
	
	// getter
//	public String getColor() { return color; }
//	public float getX() { return x; }
//	public float getY() { return y; }
//	public float getSpeed() { return speed; }
//	public float getRadius() { return radius; }
//	
//	// setter
//	public void setColor(String color) { this.color = color; }
//	public void setX(float x) { this.x = x; }
//	public void setY(float y) { this.y = y; }
//	public void setSpeed(float speed) { this.speed = speed; }
//	public void setRadius(float radius) { this.radius = radius; }
	
}
