package Q2_2013;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TokenPassTest {

	@Test
	void testTokenPassCtor1() {
		TokenPass tokens = new TokenPass(5);
		assertEquals(5,tokens.getBoard().length);
	}
	@Test
	void testTokenPassCtor2() {
		TokenPass tokens = new TokenPass(5);
		// Ensure all values are between 1 and 10
		int[] players = tokens.getBoard();
		boolean allInRange = true;
		for (int val : players) {
			if (val < 1 || val > 10)
				allInRange = false;
		}
		assertTrue(allInRange);
	}
	@Test
	void testTokenPassCtor3() {
		TokenPass tokens = new TokenPass(5);
		// Ensure currentPlayer is between 0 and playerCount - 1
		int curPlayer = tokens.getCurrentPlayer();
		boolean curPlayerInRange = curPlayer >= 0 && curPlayer < 5;
		assertTrue(curPlayerInRange);
	}
	@Test
	void testDistributeCurrentPlayerTokens() {
		// init tokens.
		TokenPass tokens = new TokenPass(5);
		// determine the current player and current board state.
		int curPlayer = tokens.getCurrentPlayer();
		int[] playersBefore = tokens.getBoard().clone();
		// distribute the tokens.
		tokens.distributeCurrentPlayerTokens();
		// determine the board state after distributing the tokens.
		int[] playersAfter = tokens.getBoard();

		// ensure the current player and the player after them has changed.
		boolean allInRange = true;

		// Ensure that the current player has less tokens than
		// previously.
		if (playersAfter[curPlayer] >= playersBefore[curPlayer])
			allInRange = false;
		// Ensure at least the player after the current player has more
		// Check to see if currentPlayer is the last index
		if (curPlayer == playersBefore.length - 1) {
			if (playersAfter[0] <= playersBefore[0]) {
				allInRange = false;
			}
		}
		else {
			if(playersAfter[curPlayer + 1] <= playersBefore[curPlayer + 1]) {
				allInRange = false;
			}
		}
		assertTrue(allInRange);
	}
	@Test
	void testDistributeCurrentPlayerTokens2() {
		// init tokens.
		TokenPass tokens = new TokenPass(5);
		// determine the current player and current board state.
		int curPlayer = tokens.getCurrentPlayer();
		// distribute the tokens.
		tokens.distributeCurrentPlayerTokens();
		// Ensure that the current player has not changed after distribution.
		assertEquals(curPlayer, tokens.getCurrentPlayer());
	}
}
