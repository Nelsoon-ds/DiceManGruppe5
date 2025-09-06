package DiceMan;

public class DiceMan {
    private int activityCount = 0;
    private int counter = 0;

    Dice dice = new Dice();

    public void startDay() {
        System.out.println("DiceMan står op og ved ikke hvad han skal tage sig til i dag.\n");
        while (activityCount <= 4) {

            // Vi tjækker om han er gået tilbage i seng 3 gange endnu
            if (counter >= 3) {
                System.out.println("DiceMan blev for doven og blev i sengen for evigt...");
                activityCount = activityCount + 3;
            } else {
                whichActivity();
            }
        }
    }

    public void whichActivity() {
        int diceResult = dice.rollDice();
        //int diceResult = 6;

        switch (diceResult) {
            case 1:
                System.out.println("Han spiser morgenmad");
                break;
            case 2:
                System.out.println("Han læser op på noget kedeligt");
                break;
            case 3:
                System.out.println("Han svømmer en tur");
                break;
            case 4:
                System.out.println("Han tager ud og fisker");
                break;
            case 5:
                System.out.println("Han ringer til mor");
                break;
            case 6:
                System.out.println("Han går tilbage i seng");
                counter++;
                break;
        }
        activityCount++;
    }
}