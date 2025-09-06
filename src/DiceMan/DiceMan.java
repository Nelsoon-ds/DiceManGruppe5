package DiceMan;

public class DiceMan {
    private int antalAktiviteter = 0;
    private int counter = 0;

    Dice dice = new Dice();

    public void startDay() {
        System.out.println("DiceMan står op og ved ikke hvad han skal tage sig til i dag.");
        while (antalAktiviteter <= 4) {
            int diceResult = dice.rollDice();

            // Vi tjækker om han er gået tilbage i seng 3 gange endnu
            if (counter >= 3) {
                System.out.println("DiceMan blev for doven og blev i sengen for evigt...");
                antalAktiviteter = antalAktiviteter + 3;
            } else {
                switch (diceResult) {
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
                        counter++;
                        break;
                }
                antalAktiviteter++;
            }
        }
    }
}