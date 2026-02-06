package com.ray3k.testgame.lwjgl3;

import java.util.ArrayList;
import java.util.List;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class EntityManager {
	private List<Entity> entityList;
	
	public EntityManager() { // constructor
		entityList = new ArrayList<>(); //create ArrayList
	}
	
	public void addEntities(Entity e) { entityList.add(e); } // method to add entities to arraylist
	
	public void update() { // call respective movement update methods fir all entities
		for (Entity e : entityList) {
            e.update();
            e.movement();
        }
	}
	
	public void draw(SpriteBatch batch, ShapeRenderer shape) {
        for (Entity e : entityList) {
        	if (batch != null) e.draw(batch); // guard against null
        	if (shape != null) e.draw(shape);
        }
	}
}
