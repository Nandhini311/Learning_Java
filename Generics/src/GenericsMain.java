
interface Player {}
record BaseballPlayer(String name, String position) implements Player {}
record FootballPlayer(String name, String position) implements Player {}


public class GenericsMain {
    public static void main(String[] args) {

        GBaseballTeam phillies1 = new GBaseballTeam("Philadelphia Phillies");
        GBaseballTeam astros1 = new GBaseballTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);
        //now the array list of phillies can only contain GBaseballTeam objects

        GSportTeam phillies2 = new GSportTeam("Philadelphia Phillies");
        GSportTeam astros2 = new GSportTeam("Houston Astros");
        scoreResult(phillies2, 3, astros2, 5);

        Team phillies = new Team<>("Philadelphia Phillies"); //raw use of generics
        Team<BaseballPlayer> astros = new Team<>("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        var guthrie = new BaseballPlayer("D Guthrie", "Center Fielder");
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();

        GSportTeam afc1 = new GSportTeam ("Adelaide Crows");
        Team<FootballPlayer> afc = new Team<>("Adelaide Crows");
        var tex = new FootballPlayer("Tex Walker" , "Centre half forward");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        //now adding a couple of players.


        //now if i want to have the same code but for football team? how do we do it.
        //we could copy the codebase and rename it for football team, but not advised as it would be duplicate of code.
        //we can have an interface for team


        //let's now create few football players.


    }

    public static void scoreResult(GBaseballTeam team1, int t1_score,
                                   GBaseballTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(GSportTeam team1, int t1_score,
                                   GSportTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score,
                                   Team team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }



}
