package learn.players;

import java.util.Random;

public class Computer implements Player {
    @Override
    public String generateMove() {
        Random random = new Random();
        int choice = random.nextInt(3)+1; // get number between 1-3

        return PlayerHelper.getPlayerMove(choice);
    }
}
