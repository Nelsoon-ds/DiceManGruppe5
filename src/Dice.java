import java.util.Random;

public class Dice {

    public Dice () {

    }
    /* Laver et terninge kast */
    public int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6);
    }
}


//