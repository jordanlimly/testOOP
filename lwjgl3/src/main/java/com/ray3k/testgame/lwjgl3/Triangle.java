package com.ray3k.testgame.lwjgl3;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Triangle extends Entity {
	
//	// default constructor
//		public Triangle() {
//			this.color = null;
//			this.x = 0;
//			this.y = 0;
//			this.speed = 0;
//			this.base = 0;
//			this.height= 0;
//		}
		
		// parameterized constructor 
		public Triangle(Color color, float x, float y, float speed) {
			super(x, y, color, speed);	
		}
		
		@Override
		public void draw(ShapeRenderer shape) {
	        shape.setColor(getColor());
	        // Plot 3 points around center (x,y)
	        shape.triangle(
	            getX() - 50, getY() - 50,
	            getX() + 50, getY() - 50, 
	            getX(), getY() + 30
	        );
	    }

	    @Override
	    public void movement() {
	        if (Gdx.input.isKeyPressed(Keys.A)) setX(getX() - getSpeed());
	        if (Gdx.input.isKeyPressed(Keys.D)) setX(getX() + getSpeed());
	    }
		
	    @Override
	    // Lab 04 codes addition
	    public void update() {
	    	System.out.println("In triangle at " + getX() + "," + getY() + " position");
	    }
	    
	    
		// getter
//		public String getColor() { return color; }
//		public float getX() { return x; }
//		public float getY() { return y; }
//		public float getSpeed() { return speed; }
//		public float getBase() { return base; }
//		public float getHeight() { return height; }
//		
//		// setter
//		public void setColor(String color) { this.color = color; }
//		public void setX(float x) { this.x = x; }
//		public void setY(float y) { this.y = y; }
//		public void setSpeed(float speed) { this.speed = speed; }
//		public void setBase(float base) { this.base = base; }
//		public void setHeight(float height) { this.height = height; }
}
