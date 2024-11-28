package part04_31;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("File:");
		String file = scanner.nextLine();

		System.out.println("Team:");
		String teamName = scanner.nextLine();

		ArrayList<Game> games = readFromFile(file);

		int gamesCount = 0;
		int winsCount = 0;

		for (Game game : games) {
			if (game.getHomeTeam().equalsIgnoreCase(teamName) || game.getVisitingTeam().equalsIgnoreCase(teamName)) {
				gamesCount++;
				if (game.isWinner(teamName)) {
					winsCount++;
				}
			}
		}

		int lossesCount = gamesCount - winsCount;

		System.out.println("Games: " + gamesCount);
		System.out.println("Wins: " + winsCount);
		System.out.println("Losses: " + lossesCount);

		scanner.close();
	}

	public static ArrayList<Game> readFromFile(String file) {
		ArrayList<Game> games = new ArrayList<>();

		try (Scanner fileReader = new Scanner(Paths.get("src/part04_31/" + file))) {
			while (fileReader.hasNextLine()) {
				String match = fileReader.nextLine().trim();

				if (match.isEmpty()) {
					continue;
				}

				String[] parts = match.split(",");

				String homeTeam = parts[0];
				String visitingTeam = parts[1];
				int homeTeamPoints = Integer.valueOf(parts[2]);
				int visitingTeamPoints = Integer.valueOf(parts[3]);

				games.add(new Game(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
			}

		} catch (Exception e) {
			System.out.println("File not found.");
		}

		return games;
	}

}
