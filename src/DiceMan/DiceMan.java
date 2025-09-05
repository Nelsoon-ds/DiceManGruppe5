package DiceMan;

import java.util.Objects;

public class DiceMan {
    final private int antalAktiviteter = 6;
    private int counter;
    private String navn;


    Dice dice = new Dice();

    // Konstruktør
    public DiceMan(int antalAktiviteter, int counter, String navn) {
        this.antalAktiviteter = antalAktiviteter;
        this.counter = counter;
        this.navn = navn;
    }


    public void startDay() {
        System.out.println(navn + " står op og ved ikke hvad han skal tage sig til i dag");

        while (antalAktiviteter != 5) {


            int result = dice.rollDice();
            switch (result) {
                case 1:
                    System.out.println("Spiser morgenmad");
                    break;
                case 2:
                    System.out.println("Læser op på noget kedeligt");
                    break;
                case 3:
                    System.out.println("Svømmer en tur");
                    break;
                case 4:
                    System.out.println("Tager ud og fisker");
                    break;
                case 5:
                    System.out.println("Ringer til mor");
                    break;
                case 6:
                    System.out.println("Går tilbage i seng");
                    break;
            }
            antalAktiviteter = antalAktiviteter - 1;
        }
    }
/*
    public void endDay(){
    System.out.println(navn + );
    }

 */
}