package part04_31;

public class Game {
	private String homeTeam;
	private String visitingTeam;
	private int homeTeamPoints;
	private int visitingTeamPoints;

	public Game(String hometeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
		this.homeTeam = hometeam;
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

	public int homeTeamPoints() {
		return this.homeTeamPoints;
	}

	public int visitingTeamPoints() {
		return this.visitingTeamPoints;
	}

	public boolean isWinner(String team) {
		if (team.equalsIgnoreCase(homeTeam)) {
			return homeTeamPoints > visitingTeamPoints;
		} else if (team.equalsIgnoreCase(visitingTeam)) {
			return visitingTeamPoints > homeTeamPoints;
		}

		return false;
	}
}
