package Q4_2009;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TileGameTest {

	@Test
	void testGetIndexForFit() {
		TileGame game = new TileGame();
		game.insertTile(new NumberTile(4,3,7,4));
		game.insertTile(new NumberTile(6,4,3,3));
		game.insertTile(new NumberTile(1,2,3,4));
		game.insertTile(new NumberTile(3,2,5,2));
		game.insertTile(new NumberTile(5,9,2,2));

		ArrayList<NumberTile> board = game.getBoard();
		int size = board.size();
		boolean areTilesAligned = true;
		for (int i = 0; i <  size - 1; i++)
		{
		    if (board.get(i).getRight() != board.get(i + 1).getLeft()){
		        areTilesAligned = false;
		    }
		}
		assertTrue(areTilesAligned);
		//assertEquals(3, game.getIndexForFit(new NumberTile(4,2,9,2)));
	}

	@Test
	void testGetIndexForFitEmptyBoard() {
		TileGame game = new TileGame();
		assertEquals(0, game.getIndexForFit(new NumberTile(4,2,9,2)));
	}
	
	@Test
	void testInsertTile() {
		TileGame game = new TileGame();
		NumberTile tile0 = new NumberTile(4,3,7,4);
		NumberTile tile1 = new NumberTile(6,4,3,3);
		NumberTile tile2 = new NumberTile(1,2,3,4);
		NumberTile tile3 = new NumberTile(3,2,5,2);
		NumberTile tile4 = new NumberTile(5,9,2,2);
		NumberTile tile5 = new NumberTile(4,2,9,2);
		game.insertTile(tile0);
		game.insertTile(tile1);
		game.insertTile(tile2);
		game.insertTile(tile3);
		game.insertTile(tile4);
		game.insertTile(tile5);
		ArrayList<NumberTile> board = game.getBoard();
		int size = board.size();
		boolean areTilesAligned = true;
		for (int i = 0; i <  size - 1; i++)
		{
		    if (board.get(i).getRight() != board.get(i + 1).getLeft()){
		        areTilesAligned = false;
		    }
		}
		assertTrue(areTilesAligned);
	}


}
