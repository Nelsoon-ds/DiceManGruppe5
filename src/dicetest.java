public class dicetest {
    public static void main(String[] args) {
        //opret en DiceMan med navn
        Dice dice =new Dice();
        DiceMan diceman =new DiceMan();

        //starter dagen - han ruller 5 gange eller stopper tideligt
        diceman.startDag();

    }
}
