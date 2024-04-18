package learn;

import learn.players.PlayerHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 3A of testing
class GameTest {

    // Arranging
    Game game = new Game();

    // ties
    @Test
    void twoOfTheSameInputShouldTie() {
        //arranging
        String result = game.determineWinner(PlayerHelper.ROCK, PlayerHelper.ROCK);
        //assert
        assertNotNull(result);
        assertEquals(String.format("You both picked %s -- It's a Tie! ", PlayerHelper.ROCK), result);

        result = game.determineWinner(PlayerHelper.PAPER, PlayerHelper.PAPER);
        //assert
        assertNotNull(result);
        assertEquals(String.format("You both picked %s -- It's a Tie! ", PlayerHelper.PAPER), result);

        result = game.determineWinner(PlayerHelper.SCISSORS, PlayerHelper.SCISSORS);
        //assert
        assertNotNull(result);
        assertEquals(String.format("You both picked %s -- It's a Tie! ", PlayerHelper.SCISSORS), result);
    }

    // happy path >> win conditions are working
    @Test
    void RockShouldBeatScissors() {
        String result = game.determineWinner(PlayerHelper.ROCK, PlayerHelper.SCISSORS);
        //assert
        assertNotNull(result);
        assertEquals((String.format("You picked %s and computer picked %s. You Won! 🎉 ", PlayerHelper.ROCK, PlayerHelper.SCISSORS)), result);
    }

    @Test
    void ScissorsShouldBeatPaper() {
        String result = game.determineWinner(PlayerHelper.SCISSORS, PlayerHelper.PAPER);
        //assert
        assertNotNull(result);
        assertEquals((String.format("You picked %s and computer picked %s. You Won! 🎉 ", PlayerHelper.SCISSORS, PlayerHelper.PAPER)), result);
    }

    @Test
    void PaperShouldBeatRock() {
        String result = game.determineWinner(PlayerHelper.PAPER, PlayerHelper.ROCK);
        //assert
        assertNotNull(result);
        assertEquals((String.format("You picked %s and computer picked %s. You Won! 🎉 ", PlayerHelper.PAPER, PlayerHelper.ROCK)), result);
    }


    // unhappy path >> lose are working
    @Test
    void rockShouldNotBeatPapar(){
        String result = game.determineWinner(PlayerHelper.ROCK, PlayerHelper.PAPER);
        //assert
        assertNotNull(result);
        assertEquals((String.format("You picked %s and computer picked %s. You Lose! 🙁", PlayerHelper.ROCK, PlayerHelper.PAPER)), result);
    }

    @Test
    void paperShouldNotBeatScissors(){
        String result = game.determineWinner(PlayerHelper.PAPER, PlayerHelper.SCISSORS);
        //assert
        assertNotNull(result);
        assertEquals((String.format("You picked %s and computer picked %s. You Lose! 🙁", PlayerHelper.PAPER, PlayerHelper.SCISSORS)), result);
    }

    @Test
    void scissorsShouldNotBeatRock(){
        String result = game.determineWinner(PlayerHelper.SCISSORS, PlayerHelper.ROCK);
        //assert
        assertNotNull(result);
        assertEquals((String.format("You picked %s and computer picked %s. You Lose! 🙁", PlayerHelper.SCISSORS, PlayerHelper.ROCK)), result);
    }

}