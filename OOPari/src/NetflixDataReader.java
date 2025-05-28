import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NetflixDataReader {
    private String filePath;

    public NetflixDataReader(String filePath) {
        this.filePath = filePath;
    }

    public List<NetflixShow> readAllShows() {
        List<NetflixShow> shows = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filePath));
            scanner.nextLine(); // skip header
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                String showId = tokens[0];
                String type = tokens[1];
                String title = tokens[2];
                String director = tokens[3];
                String cast = tokens[4];
                String country = tokens[5];
                String dateAdded = tokens[6];
                int releaseYear = Integer.parseInt(tokens[7]);
                String rating = tokens[8];
                String duration = tokens[9];
                String listedIn = tokens[10];
                String description = tokens[11];
                NetflixShow show = new NetflixShow(showId, type, title, director, cast, country, dateAdded, releaseYear, rating, duration, listedIn, description);
                shows.add(show);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (Exception e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
        return shows;
    }
}
