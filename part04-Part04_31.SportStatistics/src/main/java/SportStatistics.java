
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        
        ArrayList<Game> games = readGamesFromFile(fileName);
        
        System.out.println("Team:");
        String team = scan.nextLine();
        int gameCount = 0;
        int wins = 0;
        int losses = 0;
        for (Game game : games) {
            if (game.isGameOfTeam(team)) {
                gameCount++;
                if (game.isWinnedBy(team)) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }
        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
    }
    
    public static ArrayList<Game> readGamesFromFile(String fileName) {
        ArrayList<Game> games = new ArrayList<>();
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                games.add(new Game(parts[0],
                                   parts[1],
                                   Integer.valueOf(parts[2]),
                                   Integer.valueOf(parts[3])));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }   

        return games;
    }

}
