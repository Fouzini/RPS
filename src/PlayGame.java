import java.util.Scanner;
/**
 * Created by Fouad Soukeur on 27/06/2017.
 */
public class PlayGame {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        Game game = new Game();
        char quit =' ';

        while (quit != 'N')
        {
            game.play();
            System.out.println("Do you wish to play again? Press Any key to continue, or 'N' to quit playing");

            quit = scan.nextLine().toUpperCase().charAt(0);
        }
        scan.close();
    }
}
