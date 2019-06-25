package dto;

public class SuperTeam {

    String teamName;

    private int superTeamId ;

    public int getSuperTeamId() {
        return superTeamId;
    }

    public void setSuperTeamId(int superTeamId) {
        this.superTeamId = superTeamId;
    }

    // Just a normal constructor
    public SuperTeam() { }

    public String getHeadQuarter() {
        return headQuarter;
    }

    public void setHeadQuarter(String headQuarter) {
        this.headQuarter = headQuarter;
    }

    public SuperTeam(String teamName, String headQuarter) {
        this.teamName = teamName;
        this.headQuarter = headQuarter;
    }

    String headQuarter;

    public SuperTeam(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }


    @Override
    public String toString() {
        return "SuperTeam{" +
                "teamName='" + teamName + '\'' +
                '}';


    }
}