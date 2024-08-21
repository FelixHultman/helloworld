import java.util.InputMismatchException;
import java.util.Scanner;

public class Complex {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        stackOverFlow();
    }

    public static void stackOverFlow() {
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;

        System.out.println("Please enter name");
        String player1Name = sc.nextLine();
        System.out.println("Please enter your starting score");
        int player1StartingScore = readInt(sc);


        Player player1 = new Player(player1Name, player1StartingScore);
        player1.increaseScore();
        System.out.println(player1.getName() + " has scored " + player1.getScore());

        System.out.println("Please enter player twos name");
        String player2Name = sc.nextLine();
        System.out.println("Please enter starting score for player two");
        int player2StartingScore = readInt(sc);

        Player player2 = new Player(player2Name, player2StartingScore);
        player2.increaseScore();
        System.out.println(player2.getName() + " has scored " + player2.getScore());

    }

    public static int readInt(Scanner scanner) {
        int startingScore = 0;
        while(true) {
            try {
                startingScore = sc.nextInt();
                sc.nextLine();
                return startingScore;
            } catch (InputMismatchException e) {
                System.out.println("You cant do that. Try again.");
                sc.nextLine();
            }
        }
    }
}

