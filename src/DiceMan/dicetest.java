package DiceMan;

public class dicetest {
    public static void main(String[] args) {
        //opret en DiceMan med navn
        Dice dice = new Dice();
        DiceMan diceman = new DiceMan(2,3,"test");

        //starter dagen - han ruller 5 gange eller stopper tideligt
        diceman.startDay();

    }
}
