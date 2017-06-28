/**
 * Created by Fouad Soukeur on 27/06/2017.
 */
import java.util.Scanner;
public class Player extends Items {

    Scanner scanner;

    public Player()
    {
        super();
        scanner = new Scanner(System.in);
    }

    public MOVES getMove()
    {
        System.out.println("Enter your choice: R = Rock, P = Paper, S = Scissors!");
        char playerChoice = scanner.nextLine().toUpperCase().charAt(0);

        switch (playerChoice)
        {
            case 'R':
                return MOVES.ROCK;
            case 'P':
                return MOVES.PAPER;
            case 'S':
                return MOVES.SCISSORS;
        }
        // tell user they have inputted an incorrect variable!
        System.out.println("Error! Please enter R, P or S as one of your choices!");
        return getMove();
    }

}
