package DiceMan;

import java.util.Objects;

public class DiceMan {
    private int antalAktiviteter = 0;
    private int counter;


    Dice dice = new Dice();

    public void startDay() {
        System.out.println("DiceMan står op og ved ikke hvad han skal tage sig til i dag.");

        while (antalAktiviteter != 6) {
            int result = dice.rollDice();
            switch (result) {
                case 1:
                    System.out.println("han spiser morgenmad");
                    break;
                case 2:
                    System.out.println("han læser op på noget kedeligt");
                    break;
                case 3:
                    System.out.println("han svømmer en tur");
                    break;
                case 4:
                    System.out.println("han tager ud og fisker");
                    break;
                case 5:
                    System.out.println("han ringer til mor");
                    break;
                case 6:
                    System.out.println("han går tilbage i seng");
                    break;
            }
            antalAktiviteter++;
        }
    }
/*
    public void endDay(){
    System.out.println(navn + );
    }

 */
}