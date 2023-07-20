import java.util.Arrays;

class CricketKiller {
    public static void main(String[] args) {
        System.out.println("Invoking main in CricketKiller");

        CricketTeam cricketTeam = new CricketTeam();
        System.out.println("Team Name: " + cricketTeam.teamName);
        System.out.println("Players: " + Arrays.toString(cricketTeam.players));
        System.out.println("Captain: " + cricketTeam.captain);

        CricketTeam cricketTeam1 = new CricketTeam("India", new String[]{"Player1", "Player2", "Player3", "Player4", "Player5"}, "Virat Kohli");
        System.out.println("Team Name: " + cricketTeam1.teamName);
        System.out.println("Players: " + Arrays.toString(cricketTeam1.players));
        System.out.println("Captain: " + cricketTeam1.captain);
    }
}

class CricketTeam {
    String teamName;
    String[] players;
   
    String captain;

    CricketTeam() {
       
        System.out.println("Invoking no-argument constructor in CricketTeam");
        this.teamName = "Default Team";
        this.players = new String[]{"Player1", "Player2", "Player3"};
        this.captain = "Dhoni";
    }

    CricketTeam(String teamName, String[] players, String captain) {
        System.out.println("Invoking String, String[], String constructor in CricketTeam");
        this.teamName = teamName;
        this.players = players;
        this.captain = captain;
    }
}
