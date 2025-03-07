import java.util.List;
import java.util.ArrayList;

public class GSportTeam {
    private String teamName;
    private List<Player> teamMembers = new ArrayList();
    //it is best practice to use the interface name - List here so be more generic

    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public GSportTeam(String teamName){
        this.teamName = teamName;
    }

    public String getTeamName(){
        return teamName;
    }

    public void addTeamMember(Player player){
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }
    public void listTeamMembers(){
        System.out.println(teamName + "Roster: ");
        System.out.println(teamMembers);
    }

    public int ranking(){
        return (totalLosses*2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore){
        String message = "lost to";
        if(ourScore > theirScore){
            totalWins++;
            message = "beat";
        }
        else if( ourScore < theirScore) {
            totalLosses++;
        }
        else {
            totalTies++;
            message = "Tied";
        }
        return message;
    }



}
