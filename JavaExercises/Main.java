public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("Unkillable");
        team1.setRank(3);

        System.out.println(team1.toString());
        
        Team team2 = new Team("TheFreaks");
        team2.setRank(1);
        
        System.out.println(team2.toString());
        
        Team team3 = new Team("TheMoneyGuys");
        team3.setRank(5);
        
        System.out.println(team3.toString());
    }
}
