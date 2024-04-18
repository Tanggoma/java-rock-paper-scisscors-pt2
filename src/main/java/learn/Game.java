package learn;

import learn.players.Computer;
import learn.players.Human;
import learn.players.Player;
import learn.players.PlayerHelper;

public class Game {

    // Play method
    public void play(){
        System.out.printf("Welcome to | %s | %s | %s |%n", PlayerHelper.ROCK, PlayerHelper.PAPER,PlayerHelper.SCISSORS);
        System.out.println();

        // create player
        Player human = new Human();
        Player computer = new Computer();

        // prompt human for a move
        String humanMove = human.generateMove();
        System.out.println();
        System.out.println("Good Luck .....");
        System.out.println();

        // randomly generate computer move
        String computerMove = computer.generateMove();

        System.out.println(determineWinner(humanMove,computerMove));
    }

    // Determine Winner
    public String determineWinner(String humanMove, String computerMove) {
        // Tie
        if (computerMove.equals(humanMove)) {
            return String.format("You both picked %s -- It's a Tie! ", humanMove);
            // Win
        } else if ((computerMove.equals(PlayerHelper.PAPER) && humanMove.equals(PlayerHelper.SCISSORS)) ||
                (computerMove.equals(PlayerHelper.ROCK) && humanMove.equals(PlayerHelper.PAPER)) ||
                (computerMove.equals(PlayerHelper.SCISSORS) && humanMove.equals(PlayerHelper.ROCK))
        ) {
            return String.format("You picked %s and computer picked %s. You Won! 🎉 ", humanMove, computerMove);
        } else
            return String.format("You picked %s and computer picked %s. You Lose! 🙁", humanMove, computerMove);
    }
}
