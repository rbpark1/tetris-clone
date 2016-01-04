import greenfoot.*;

/**
 * Class for the J Tetronimo of the game.
 * 
 * @author "Tetris" Group P4
 * @version 5/18/15
 */
public class J_Piece extends Shape
{
    
    public J_Piece(Block i1, Block i2, Block i3, Block i4){
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
        
        else if (Greenfoot.isKeyDown("up") && canMoveRight()) {
             if(parts[0].getX()==parts[1].getX()-1){
                            parts[0].setLocation(parts[0].getX() , parts[0].getY()-1);
                            parts[1].setLocation(parts[1].getX()-1 , parts[1].getY());
                            parts[2].setLocation(parts[2].getX() , parts[2].getY()+1);
                            parts[3].setLocation(parts[3].getX()+1 , parts[3].getY()+2);
           
            
          
            }
            else if(parts[0].getY()==parts[1].getY()-1){
                            parts[0].setLocation(parts[0].getX()+1 , parts[0].getY()-1);
                            parts[1].setLocation(parts[1].getX() , parts[1].getY()-2);
                            parts[2].setLocation(parts[2].getX()-1, parts[2].getY()-1);
                            parts[3].setLocation(parts[3].getX()-2 , parts[3].getY());
           
            
          
            }
                 else if(parts[0].getX()==parts[1].getX()+1){
                            parts[0].setLocation(parts[0].getX()+1 , parts[0].getY()+2);
                            parts[1].setLocation(parts[1].getX()+2 , parts[1].getY()+1);
                            parts[2].setLocation(parts[2].getX()+1, parts[2].getY());
                            parts[3].setLocation(parts[3].getX() , parts[3].getY()-1);
           
            
          
            }
            
            
                 else if(parts[0].getY()==parts[1].getY()+1){
                            parts[0].setLocation(parts[0].getX()-2 , parts[0].getY());
                            parts[1].setLocation(parts[1].getX()-1 , parts[1].getY()+1);
                            parts[2].setLocation(parts[2].getX(), parts[2].getY());
                            parts[3].setLocation(parts[3].getX()+1 , parts[3].getY()-1);
           
            
          
            }
            

     
        }
        else if (Greenfoot.isKeyDown("down")&canMoveDown()) {
                    parts[0].setLocation(parts[0].getX() , parts[0].getY()+1);
                       parts[1].setLocation(parts[1].getX() , parts[1].getY()+1);
                            parts[2].setLocation(parts[2].getX() , parts[2].getY()+1);
                   parts[3].setLocation(parts[3].getX() , parts[3].getY()+1);
                }
        
         
}
}