import greenfoot.*;

/**
 * Class containing the characteristics of the Block() Object which will be used to form pieces.
 * 
 * @author "Tetris" Group P4
 * @version 5/18/15
 */
public class Block extends Actor {
    
    /**
     * Constructor for creating Block() Objects. Once they are declared and initialized.
     * Each block has two boolean values, one of which are immediately initalized, as well as an int variable that is also immediately initalized.
     */
    public Block() {
    }
    private boolean canMoveLeft; // Returns true if the Block can move left.
    private int timer = 0; // Int variable that is continuously incremented to determine when the block will automatically move down.
    private boolean hasStopped = false; // boolean variable that determines whether the block is operational or not.

    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
    }
    
    
    /**
     * Method that checks if this Block has enough space to its left to make a shift to the left.
     */
    public boolean canMoveL(){
        if(getOneObjectAtOffset(-1,0, Block.class)==null){
            return true;
        }
        return false;
    }
    
    /**
     * Method that checks if this Block has enough space to its right to make a shift to the right.
     */
    public boolean canMoveR(){
        if(getOneObjectAtOffset(1,0, Block.class)==null){
            return true;
        }
        return false;
    }
    
    /**
     * Method that checks if this Block has enough space below it to make a shift one cell downwards.
     */
    public boolean canMoveD(){
        if(getOneObjectAtOffset(0,1, Block.class)==null){
            return true;
        }
        return false;
    }
    
    
    public boolean end(){
        if(getIntersectingObjects(Block.class).size()>0){
            return true;
        }
        return false;
    }
}
