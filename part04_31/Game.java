package part04_31;

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

	public String getHomeTeam() {
		return this.homeTeam;
	}

	public String getVisitingTeam() {
		return this.visitingTeam;
	}

	public boolean isWinner(String teamName) {
		if (teamName.equalsIgnoreCase(homeTeam) && homeTeamPoints > visitingTeamPoints) {
			return true;
		} else if (teamName.equalsIgnoreCase(visitingTeam) && visitingTeamPoints > homeTeamPoints) {
			return true;
		} else {
			return false;
		}
	}
}
