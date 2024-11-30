package part04_31;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("File:");
			String fileName = scanner.nextLine();

			System.out.println("Team:");
			String teamName = scanner.nextLine();

			ArrayList<Game> games = readFromFile(fileName);
			ArrayList<Game> numberOfGames = new ArrayList<>();

			for (Game game : games) {
				if (teamName.equalsIgnoreCase(game.getHomeTeam())
						|| teamName.equalsIgnoreCase(game.getVisitingTeam())) {
					numberOfGames.add(game);
				}
			}

			int teamWins = 0;
			for (Game game : numberOfGames) {
				if (game.isWinner(teamName)) {
					teamWins++;
				}
			}

			System.out.println("Games: " + numberOfGames.size());
			System.out.println("Wins: " + teamWins);
			System.out.println("Losses: " + (numberOfGames.size() - teamWins));

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	public static ArrayList<Game> readFromFile(String fileName) {
		ArrayList<Game> games = new ArrayList<>();

		try (Scanner fileReader = new Scanner(Paths.get("src/part04_31/" + fileName))) {
			while (fileReader.hasNextLine()) {
				String match = fileReader.nextLine();

				String[] matchInfo = match.split(",");

				String homeTeam = matchInfo[0];
				String visitingTeam = matchInfo[1];
				int homeTeamPoints = Integer.valueOf(matchInfo[2]);
				int visitingTeamPoints = Integer.valueOf(matchInfo[3]);

				games.add(new Game(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
			}
		} catch (Exception e) {
			System.out.println("File not found.");
		}

		return games;
	}
}
