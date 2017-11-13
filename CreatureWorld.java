import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.List;

/**
 * Micheal Stoddart
 * CS20S
 *  Mr. Hardman
 * Lab #2, Program #1
 * last updated Oct.25
 */
public class CreatureWorld extends World
{
    private Creature playerOneCreature; 
    private Creature playerTwoCreature;
    private boolean playerOneTurn;
    private String playerOneName;
    private String playerTwoName;
    private Menu oneFightMenu;
    private Menu oneSwitchMenu;
    private Menu twoFightMenu;
    private Menu twoSwitchMenu;
    private boolean start;
    private boolean playerOneMenusAdded;
    private boolean playerTwoMenusAdded;
    
    
    /**
     * Default constructor for objects of class MyWorld.
     * 
     * @param There are no parameters
     * @return an object of class MyWorld
     */
    public CreatureWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super( 400, 400, 1); 
        
        playerOneCreature = new Charmander(this);
        
        playerTwoCreature = new Pikachu(this);   

        start = true;
        prepareCreatures();
        Greenfoot.start();
    }
    
    public boolean playerOneTurn()
    {
       return playerOneTurn; 
    }

    public Creature getPlayerOne()
    {
        return playerOneCreature;
    }
    
    public Creature getPlayerTwo()
    {
        return playerTwoCreature;
    }
    
    public boolean isPlayerOneTurn()
    {
        return playerOneTurn;
    }
    
    public void changePlayerOneTurn( boolean turn )
    {
       playerOneTurn = turn; 
    }

    private void prepareCreatures()
    {
        
        addObject(playerOneCreature, playerOneCreature.getImage().getWidth()/2, getHeight() - playerOneCreature.getImage().getHeight()/2);
        
        addObject(playerTwoCreature, getWidth() - playerTwoCreature.getImage().getWidth()/2, playerTwoCreature.getImage().getHeight()/2);
       
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
        
<<<<<<< HEAD
        if ( start == true )
        {
           playerOneName = JOptionPane.showInputDialog( " Player One, please enter your name: ", null );
           playerTwoName = JOptionPane.showInputDialog( " Player Two, please enter your name: ", null );
           start = false;
           playerOneTurn = true;
        }
        else if( playerOneTurn == true )
        {
            showText( playerOneName+ ", Your Turn", getWidth() / 2, getHeight()/ 2);
            showText("", getWidth() /2, getHeight()/2 + 26 );     
        }
        else 
        {
            showText( playerTwoName+ ", Your Turn", getWidth() / 2, getHeight()/ 2);
            showText("", getWidth() /2, getHeight()/2 + 26 );     
        }
       
        if( playerOneMenusAdded == false )
        {
            oneFightMenu = new Menu( "Fight", "Scratch\nFlamethrower ", 24, Color.BLACK, Color.WHITE, Color.BLACK, Color.WHITE, new FightCommands());
            addObject( oneFightMenu, 173, getHeight() - 100 );
            oneSwitchMenu = new Menu( "Switch", "Golem\nIvysaur", 24, Color.BLACK, Color.WHITE, Color.BLACK, Color.WHITE, new SwitchCommands());
            addObject( oneSwitchMenu, 241, getHeight() - 100 );
            playerOneMenusAdded = true;
        }
        
        if( playerTwoMenusAdded == false )
        {
            twoFightMenu = new Menu( "Fight", "Tackle\nThunderbolt", 24, Color.BLACK, Color.WHITE, Color.BLACK, Color.WHITE, new FightCommands());
            addObject( twoFightMenu, 131, 75 );
            twoSwitchMenu = new Menu( "Switch", "Lapras\nPidgeot", 24, Color.BLACK, Color.WHITE, Color.BLACK, Color.WHITE, new SwitchCommands());
            addObject( twoSwitchMenu, 199, 75 );
        }
        
        if ( playerOneCreature.getHealthBar().getCurrent() <= 0)
        {
            removeObjects(allObjects);
            showText( " Player Two Wins! " , getWidth() / 2, getHeight()/ 2);
            showText( "" , getWidth() /2, getHeight()/2 + 26 );
            Greenfoot.stop();
        }
       
        if ( playerTwoCreature.getHealthBar().getCurrent() <= 0)
        {
            removeObjects(allObjects);
            showText( " Player One Wins! " , getWidth() / 2, getHeight()/ 2);
            showText( "" , getWidth() / 2, getHeight()/ 2 + 26 );
            Greenfoot.stop();
        }
    }   
    
}
=======
    }
    private boolean start()
}
>>>>>>> 3fc2ddab335680076002ccaa8f330bf2ee62cd27
