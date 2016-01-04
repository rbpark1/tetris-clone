import greenfoot.*;

/**
 * Class for the O Tetronimo of the game.
 * 
 * @author "Tetris" Group P4
 * @version 5/18/15
 */
public class O_Piece extends Shape
{
    
    /**
     * Constructor that accepts four Block() objects to create a O Tetronimo.
     * @param i1 - A Block() object.
     * @param i2 - A Block() object.
     * @param i3 - A Block() object.
     * @param i4 - A Block() object.
     */
    public O_Piece(Block i1, Block i2, Block i3, Block i4){
        parts[0] = i1;
        parts[1] = i2;
        parts[2] = i3;
        parts[3] = i4;
    }

    /**
     * Act - do whatever the Tetronimo wants to do. This method is called
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        shift();
        moveDown();
        incTimer();
    }
    
    /**
     * Method that moves the piece to the left, right, or down.
     */
    public void shift() {
        if (Greenfoot.isKeyDown("left") && canMoveLeft()) {
            for (Block x : parts) {
                x.setLocation(x.getX() - 1, x.getY());
            }
                        setLocation(getX()-1,getY());
        } 
        else if (Greenfoot.isKeyDown("right") && canMoveRight()) {
            for (Block x : parts) {
                x.setLocation(x.getX() + 1, x.getY());
            }
                        setLocation(getX()+1,getY());
        }
        else if (Greenfoot.isKeyDown("down")&canMoveDown()) {
                    parts[0].setLocation(parts[0].getX() , parts[0].getY()+1);
                       parts[1].setLocation(parts[1].getX() , parts[1].getY()+1);
                            parts[2].setLocation(parts[2].getX() , parts[2].getY()+1);
                   parts[3].setLocation(parts[3].getX() , parts[3].getY()+1);
                }
        
            

     
        
        
         
}
}