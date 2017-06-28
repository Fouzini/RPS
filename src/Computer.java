/**
 * Created by Fouad Soukeur on 27/06/2017.
 */

public class Computer extends Items {

    public Computer()
    {
        super();
    }

    public MOVES getMove()
    {
        int choice = (int) (Math.random()*3);

        switch (choice){
            case 1:
                return MOVES.ROCK;
            case 2:
                return MOVES.PAPER;
        }
        return MOVES.SCISSORS;
    }
}
