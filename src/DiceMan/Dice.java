package DiceMan;

import java.util.Random;

public class Dice {


    public int rollDice() {
        Random rand = new Random();
        int dice = rand.nextInt(6);
        return dice;
    }
}
