package com.ray3k.testgame.lwjgl3;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


public class GameMaster extends ApplicationAdapter { 
    private Entity bucket, circle, triangle;
    private Entity[] drops;
    private SpriteBatch batch;
    private ShapeRenderer shape;
    private EntityManager em; // Lab 04 addition

    @Override
    public void create() {
        batch = new SpriteBatch();
        shape = new ShapeRenderer();
        em = new EntityManager(); // Lab 04 addition
        
//        bucket = new TextureObject("bucket.png", 100, 20, 5);
//        circle = new Circle(Color.RED, 400, 240, 3, 30);
//        triangle = new Triangle(Color.GREEN, 100, 100, 3);
//        
//        drops = new Entity[5];
//        for (int i = 0; i < drops.length; i++) {
//            drops[i] = new TextureObject("droplet.png", (float)Math.random()*360, 500, 2);
//        }
        em.addEntities(new TextureObject("bucket.png", 100, 20, 5, false));
        em.addEntities(new Circle(Color.RED, 400, 240, 3, 30));
        em.addEntities(new Triangle(Color.RED, 100, 100, 3));
        
        
        for (int i = 0; i < 5; i++) {
        	float speed = (float)(Math.random()+2);
            em.addEntities(new TextureObject("droplet.png", (float)Math.random()*360, 500, speed, true));
        }
       
    }

    @Override
    public void render() {
        ScreenUtils.clear(0, 0, 0.2f, 1);
        
//        // handle movement
//        bucket.movement();
//        circle.movement();
//        triangle.movement();
//        for (Entity drop : drops) {
//            drop.setY(drop.getY() - drop.getSpeed()); // Simple drop logic
//            if (drop.getY() < 0) drop.setY(480);
//        }
//
//        // draw textures
//        batch.begin();
//        bucket.draw(batch);
//        for (Entity drop : drops) drop.draw(batch);
//        batch.end();
//
//        // draw shapes
//        shape.begin(ShapeRenderer.ShapeType.Filled);
//        circle.draw(shape);
//        triangle.draw(shape);
//        shape.end();
        
        //Lab 04 addition
        em.update(); // handles console updates and movement
        
        batch.begin();
        em.draw(batch, null); // only draw textures
        batch.end();
        
        shape.begin(ShapeRenderer.ShapeType.Filled);
        em.draw(null, shape); // only draw shapes
        shape.end();
        
    }
}