/**
 * Created by Fouad Soukeur on 27/06/2017.
 */
public class Game {
    private Player player;
    private Computer computer;
    private Items.MOVES playerChoice;
    private Items.MOVES computerChoice;
    private Items.RESULT result;
    private int wins, loses, draw, gamesPlayed;
    private double wonPercentage;

    // constructor
    public Game(){
        super();
        player = new Player();
        computer = new Computer();
    }

    public void play()
    {
        playerChoice = player.getMove();
        computerChoice = computer.getMove();
        result = getResult();
        EndResult();
        statistics();
        ShowStatistics();
    }

    private void EndResult()
    {
        switch (result)
        {
            case WIN:
                System.out.println(playerChoice +  "Successfully beats " + computerChoice + ". PLAYER WINS!");
                break;
            case LOSE:
                System.out.println(playerChoice +  "loses to " + computerChoice + ". COMPUTER WINS!");
                break;
            case DRAW:
                System.out.println(playerChoice +  "DRAWS to " + computerChoice + ". It's a draw!");
                break;
        }
    }

    private Items.RESULT getResult()
    {
        if(playerChoice == computerChoice)
            return Items.RESULT.DRAW;

        switch(playerChoice){
            case ROCK:
                return (computerChoice == Items.MOVES.SCISSORS ? Items.RESULT.WIN : Items.RESULT.LOSE);

            case PAPER:
                return (computerChoice == Items.MOVES.ROCK ? Items.RESULT.WIN : Items.RESULT.LOSE);

            case SCISSORS:
                return (computerChoice == Items.MOVES.PAPER ? Items.RESULT.WIN : Items.RESULT.LOSE);
        }
        return Items.RESULT.LOSE;
    }

    private void statistics()
    {
        if (result == Items.RESULT.WIN)
            wins++;
        else if(result == Items.RESULT.LOSE)
            loses++;
        else
            draw++;
    }

    private void ShowStatistics()
    {
        gamesPlayed = wins + loses + draw;
        wonPercentage = (wins + ((double) draw) / 2) / gamesPlayed;
        System.out.println("You have played" + (gamesPlayed) + ". times ");
        System.out.println("You have won " + wins + ". times");
        System.out.println("You have lost " + loses + ". times");
        System.out.println("You have drawn" + draw + ". times");
        System.out.printf("Your win percentage is:  %13.2f%%  |\n", wonPercentage * 100);

    }
}
