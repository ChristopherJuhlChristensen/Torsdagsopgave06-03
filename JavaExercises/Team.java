import java.util.ArrayList;

public class Team {
    private String teamName;
    private int rank;
    private ArrayList<String> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<String>();
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void addPlayer(String playerName) {
        this.players.add(playerName);
    }

    @Override
    public String toString() {
        String playerNames = "";
        for (String player : players) {
            playerNames += player + "\n";
        }
        return "Hold: " + teamName + " Rang: " + rank + "\nSpillere:\n" + playerNames;
    }
}
