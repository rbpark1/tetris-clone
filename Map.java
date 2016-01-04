import greenfoot.*;
import java.util.*;

/**
 * This class contains the properties of the "World" in which the blocks and
 * piece are spawned in. It also contains the image that you see in the
 * background of the game.
 * 
 * @author "Tetris" Group P4
 * @version 5/18/15
 */
public class Map extends World {
	private Shape liveShape = new Shape(); // Declares and initializes a Shape()
											// object so that the piece objects
											// have an instance of Shape() in
											// order to access its methods and
											// variables.

	/**
	 * Method that spawns a new tetronimo piece into the world. This method will
	 * be repeatedly called to spawn more pieces.
	 */
	public void spawn() {
		Random rand = new Random();
		int selector = rand.nextInt(7) + 1;
		switch (selector) {
		case 1:
			spawnJ();
			break;
		case 2:
			spawnI();
			break;
		case 3:
			spawnL();
			break;
		case 4:
			spawnS();
			break;
		case 5:
			spawnZ();
			break;
		case 6:
			spawnO();
			break;
		case 7:
			spawnT();
			break;
		}
	}

	/**
	 * Method that spawns that declares, intializes, and adds a J_Piece() object
	 * into the world.
	 */
	public void spawnJ() {
		Block x1 = new Block();
		Block x2 = new Block();
		Block x3 = new Block();
		Block x4 = new Block();
		x1.setImage("J_Piece.png");
		x2.setImage("J_Piece.png");
		x3.setImage("J_Piece.png");
		x4.setImage("J_Piece.png");
		Shape test = new J_Piece(x1, x2, x3, x4);
		test.setImage("Invis.png");
		addObject(test, 3, 0);
		addObject(test.getList()[0], 4, 2);
		addObject(test.getList()[1], 5, 2);
		addObject(test.getList()[2], 5, 1);
		addObject(test.getList()[3], 5, 0);
		liveShape = test;
	}

	/**
	 * Method that spawns that declares, intializes, and adds a I_Piece() object
	 * into the world.
	 */
	public void spawnI() {
		Block x1 = new Block();
		Block x2 = new Block();
		Block x3 = new Block();
		Block x4 = new Block();
		x1.setImage("I_Piece.png");
		x2.setImage("I_Piece.png");
		x3.setImage("I_Piece.png");
		x4.setImage("I_Piece.png");
		Shape test = new I_Piece(x1, x2, x3, x4);
		test.setImage("Invis.png");
		addObject(test, 3, 0);
		addObject(test.getList()[0], 3, 0);
		addObject(test.getList()[1], 4, 0);
		addObject(test.getList()[2], 5, 0);
		addObject(test.getList()[3], 6, 0);
		liveShape = test;
	}

	/**
	 * Method that spawns that declares, intializes, and adds a L_Piece() object
	 * into the world.
	 */
	public void spawnL() {
		Block x1 = new Block();
		Block x2 = new Block();
		Block x3 = new Block();
		Block x4 = new Block();
		x1.setImage("L_Piece.png");
		x2.setImage("L_Piece.png");
		x3.setImage("L_Piece.png");
		x4.setImage("L_Piece.png");
		Shape test = new L_Piece(x1, x2, x3, x4);
		test.setImage("Invis.png");
		addObject(test, 3, 0);
		addObject(test.getList()[0], 5, 2);
		addObject(test.getList()[1], 4, 2);
		addObject(test.getList()[2], 4, 1);
		addObject(test.getList()[3], 4, 0);
		liveShape = test;
	}

	/**
	 * Method that spawns that declares, intializes, and adds a S_Piece() object
	 * into the world.
	 */
	public void spawnS() {
		Block x1 = new Block();
		Block x2 = new Block();
		Block x3 = new Block();
		Block x4 = new Block();
		x1.setImage("S_Piece.png");
		x2.setImage("S_Piece.png");
		x3.setImage("S_Piece.png");
		x4.setImage("S_Piece.png");
		Shape test = new S_Piece(x1, x2, x3, x4);
		test.setImage("Invis.png");
		addObject(test, 3, 0);
		addObject(test.getList()[0], 4, 1);
		addObject(test.getList()[1], 5, 1);
		addObject(test.getList()[2], 5, 0);
		addObject(test.getList()[3], 6, 0);
		liveShape = test;
	}

	/**
	 * Method that spawns that declares, intializes, and adds a Z_Piece() object
	 * into the world.
	 */
	public void spawnZ() {
		Block x1 = new Block();
		Block x2 = new Block();
		Block x3 = new Block();
		Block x4 = new Block();
		x1.setImage("Z_Piece.png");
		x2.setImage("Z_Piece.png");
		x3.setImage("Z_Piece.png");
		x4.setImage("Z_Piece.png");
		Shape test = new Z_Piece(x1, x2, x3, x4);
		test.setImage("Invis.png");
		addObject(test, 3, 0);
		addObject(test.getList()[0], 3, 0);
		addObject(test.getList()[2], 4, 1);
		addObject(test.getList()[1], 4, 0);
		addObject(test.getList()[3], 5, 1);
		liveShape = test;
	}

	/**
	 * Method that spawns that declares, intializes, and adds a O_Piece() object
	 * into the world.
	 */
	public void spawnO() {
		Block x1 = new Block();
		Block x2 = new Block();
		Block x3 = new Block();
		Block x4 = new Block();
		x1.setImage("O_Piece.png");
		x2.setImage("O_Piece.png");
		x3.setImage("O_Piece.png");
		x4.setImage("O_Piece.png");
		Shape test = new O_Piece(x1, x2, x3, x4);
		test.setImage("Invis.png");
		addObject(test, 3, 0);
		addObject(test.getList()[0], 4, 0);
		addObject(test.getList()[1], 5, 0);
		addObject(test.getList()[2], 4, 1);
		addObject(test.getList()[3], 5, 1);
		liveShape = test;
	}

	/**
	 * Method that spawns that declares, intializes, and adds a T_Piece() object
	 * into the world.
	 */
	public void spawnT() {
		Block x1 = new Block();
		Block x2 = new Block();
		Block x3 = new Block();
		Block x4 = new Block();
		x1.setImage("T_Piece.png");
		x2.setImage("T_Piece.png");
		x3.setImage("T_Piece.png");
		x4.setImage("T_Piece.png");
		Shape test = new T_Piece(x1, x2, x3, x4);
		test.setImage("Invis.png");
		addObject(test, 3, 0);
		addObject(test.getList()[0], 4, 1);
		addObject(test.getList()[1], 5, 0);
		addObject(test.getList()[2], 5, 1);
		addObject(test.getList()[3], 6, 1);
		liveShape = test;
	}

	/**
	 * Constructor for objects of class Map.
	 * 
	 */
	public Map() {
		// Create a new world with 600x400 cells with a cell size of 1x1 pixels.
		super(10, 20, 24);
		// testing code
		spawn();
	}

	/**
	 * Method that checks if the current operational piece is still alive. If it
	 * has reached the very bottom or the top of a dead piece, this method will
	 * cause the world to spawn a new random piece at the very top of the grid.
	 */
	public void act() {
		if (liveShape.getAlive() == false) {
			removeObject(liveShape);
			checkLine();
			spawn();
		}

		if (liveShape.end()) {
			addObject(new GameOver(), 5, 9);
			removeObject(liveShape);
		}

	}

	/**
	 * Method that uses iterators to check if a line is completed in the grid.
	 * If it iteratively finds one, it destroys the line then moves all blocks
	 * above it one cell downwards. If there are more than one line, then all
	 * blocks will be moved down to the lowest line that was destroyed.
	 */
	public void checkLine() {
		for (int r = 0; r < 20; r++) {// start of 1st for loop
			ArrayList<Block> rowList = new ArrayList<Block>();
			for (int c = 0; c < 10; c++) {
				List<Block> temp = new ArrayList<Block>();
				temp = getObjectsAt(c, r, Block.class);
				Iterator<Block> tempIterator = temp.iterator();// *****iterator
																// object with
																// elements from
																// temp*****
				while (tempIterator.hasNext()) {
					rowList.add(tempIterator.next());//traversing through iterator
				}

			}
			if (rowList.size() == 10) {
				int lineNum = rowList.get(0).getY();

				recursivelyRemove(rowList.size(), rowList);// ******recursion call*******
				ArrayList<Block> all = new ArrayList<Block>();
				for (int r2 = 0; r2 < lineNum; r2++) {
					for (int c2 = 0; c2 < 10; c2++) {
						List<Block> temp = new ArrayList<Block>();
						temp = getObjectsAt(c2, r2, Block.class);
						Iterator<Block> tempIterator = temp.iterator();
						while (tempIterator.hasNext()) {
							all.add(tempIterator.next());
						}

					}
				}
				for (Block x : all) {
					x.setLocation(x.getX(), x.getY() + 1);
				}
			}
		}
	}
	 /**
     * Recursive method that removes from the world all elements in the inputted ArrayList
     * @param1 x - size of the arrayList
     * @param2 list - designated arrayList
     */
	public void recursivelyRemove(int x, ArrayList<Block> list) {
		if (x - 1 < 0) {
			return;
		}
		removeObject(list.get(x - 1));
		recursivelyRemove(x - 1, list);
	}
}