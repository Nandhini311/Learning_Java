import java.util.ArrayList;
import java.util.List;

public class Team <T> {
    //now making this truly generic
    //T -> any player
    private String teamName;
    private List<T> teamMembers = new ArrayList();
    //it is best practice to use the interface name - List here so be more generic

    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public Team(String teamName){
        this.teamName = teamName;
    }

    public String getTeamName(){
        return teamName;
    }

    public void addTeamMember(T player){
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
