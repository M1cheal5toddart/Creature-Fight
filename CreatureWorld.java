import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.List;

/**
 * Micheal Stoddart
 * CS20S
 *  Mr. Hardman
 * Lab #1, Program #1
 * 
 */
public class CreatureWorld extends World
{
    private Creature playerOneCreature; 
    private Creature playerTwoCreature;
    /**
     * Default constructor for objects of class MyWorld.
     * 
     * @param There are no parameters
     * @return an object of class MyWorld
     */
    public CreatureWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super( 900, 900, 1); 
        playerOneCreature = new Charmander(this);
        playerTwoCreature = new Pikachu(this);

        prepareCreatures();
    }

    public Creature getPlayerOne()
    {
        return playerOneCreature;
    }
    
    public Creature getPlayerTwo()
    {
        return playerTwoCreature;
    }

    private void prepareCreatures()
    {
        addObject(playerOneCreature, playerOneCreature.getImage().getWidth()/2, getHeight() - playerOneCreature.getImage().getHeight()/2);
        addObject( new Button(Color.RED, 50), getWidth()/2 , getHeight() - 100 ); 
        addObject(playerTwoCreature, getWidth() - playerTwoCreature.getImage().getWidth()/2, playerTwoCreature.getImage().getHeight()/2);
        addObject( new Button(Color.RED, 50), getWidth()/2 , 100 );
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
    public void act()
    {
      List allObjects = getObjects(null);
      if ( playerOneCreature.getHealthBar().getCurrent() <= 0)
      {
          removeObjects(allObjects);
          
          
          Greenfoot.stop();
      }
      if ( playerTwoCreature.getHealthBar().getCurrent() <= 0)
      {
          removeObjects(allObjects);
          
          
          Greenfoot.stop();
      }
    }
    
}