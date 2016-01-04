import greenfoot.*;
import java.util.*;

/**
 * Class that contains methods that all tetronimo pieces use to move and function.
 * 
 * @author "Tetris" Group P4
 * @version 5/18/15
 */
public class Shape extends Actor
{
    Block[] parts = new Block[4]; // Array containing 4 Block() objects that form a tetronimo piece.
    private boolean isAlive; // Boolean vlaue that determines whether the tetronimo is still operational or not.
    int timer = 0; // int variable that is continously incremented to make the piece move downwards automatically.
    
    /**
     * Constructor for a shape object which each piece will need in order to function.
     */
    public Shape(){
        isAlive = true;
    }
    
    /**
     * Method that checks if all Blocks in a piece can move left.
     * @return - If true, the entire piece can move left. If false, then the piece cannot move left.
     */
    public boolean canMoveLeft() {
        for (Block x : parts) {
            if(x.getX()==0){
                return false;
             }
        }
        for (Block x: parts){
            if(x.canMoveL()==false && contains(getWorld().getObjectsAt(x.getX()-1, x.getY(), Block.class))==false){
                return false;
        }
    }
            return true;
}
    
    /**
     * Method that checks if all Blocks in a piece can move right.
     * @return - If true, the entire piece can move right. If false, then the piece cannot move right.
     */
    public boolean canMoveRight() {
        for (Block x : parts) {
            if(x.getX()==9){
                return false;
             }
        }
        for (Block x: parts){
            if(x.canMoveR()==false && contains(getWorld().getObjectsAt(x.getX()+1, x.getY(), Block.class))==false){
                return false;
        }
    }
        return true;
    }
    
    /**
     * Method that checks if all BLocks in a piece can move down.
     * @return - If true, the entire piece can move down. If false, then it cannot move down.
     */
    public boolean canMoveDown() {
        for (Block x : parts) {
              if(x.getY()==19){
       isAlive = false;
       return false;
    }
   }
   for (Block x: parts){
            if(x.canMoveD()==false && contains(getWorld().getObjectsAt(x.getX(), x.getY()+1, Block.class))==false){
                                       isAlive = false;
                return false;

        }
    }
   
  return true;
 }
    
    /**
     * Method that uses the canMoveDown() to determine if it can move down or not. If that method returns true, then this method will move
     * all the blocks of the piece down.
     */
    public void moveDown() {
  if(canMoveDown() && timer==25){
     for (Block x : parts) {
   x.setLocation(x.getX(), x.getY() + 1);
  }
    setLocation(getX(), getY()+1);
        timer=0;
        }
 }
    
    /**
     * Method that checks if the given block comes from the same class but a different object of it.
     * @param b - The block that will be checked.
     * @return - True if similar block, false if otherwise.
     */
 public boolean contains(Actor b){
     if(b==null){
        return false;
        }
     
     for(Block x: parts){
         if(b==x){
            return true;
        }
     }
        return false;
 }
 
 /**
  * Method that checks if the given ArrayList contains a Block() object that is similar to the Block() objects of this class.
  * @param l - The ArrayList of Blocks() that will be checked.
  * @return True if blocks are similar, false if otherwise.
  */
 public boolean contains(List<Block> l){
     if(l.size()==0){
        return false;
        }
     for(Block x: parts){
         if(x==l.get(0)){
            return true;
        }
    } 
     return false;
 }
 
 /**
  * Getter method that returns the array of Block() objects (parts).
  * @return - The array of Block() objects (parts).
  */
 public Block[] getList() {
  return parts;
 }
 
 /**
  * Getter method that returns the isAlive variable (Which is used to determine if the piece is dead or not.)
  * @return isAlive variable.
  */
 public boolean getAlive() {
  return isAlive;
 }
 
 /**
  * Setter method that sets the isAlive variable to the given value.
  * @param b True or false;
  */
 public void setAlive(boolean b) {
  isAlive = b;
 }
 
 /**
  * Incrementer method that increments the timer variable.
  */
 public void incTimer(){
     timer++;
}
 
 /**
  * Boolean method that checks if the piece contains a block that is dead.
  * @return True if piece contains dead block, false if otherwise.
  */
 public boolean end(){
    for(Block x: parts){
         if(x.end()){
            return true;
        }
    }
    return false;
}
}