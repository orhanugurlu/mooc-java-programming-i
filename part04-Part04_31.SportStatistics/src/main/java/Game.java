public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public Game(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }

    public boolean isGameOfTeam(String name) {
        return homeTeam.equals(name) || visitingTeam.equals(name);
    }

    public boolean isWinnedBy(String team) {
        return (visitingTeam.equals(team) && visitingTeamPoints > homeTeamPoints)
                || (homeTeam.equals(team) && homeTeamPoints > visitingTeamPoints);
    }

}
