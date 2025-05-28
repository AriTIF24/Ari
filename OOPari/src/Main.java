import java.util.List;

public class Main {
    public static void main(String[] args) {
        NetflixDataReader reader = new NetflixDataReader("C:/Users/LENOVO LOQ/IdeaProjects/OOPari/src/netflix_titles.csv");
        List<NetflixShow> shows = reader.readAllShows();

        if (!shows.isEmpty()) {
            System.out.println("Total data terbaca: " + shows.size());
            System.out.println("Data pertama:");
            shows.get(0).printDetails();
            System.out.println("Data kedua:");
            shows.get(1).printDetails();
            // Atau tampilkan semuanya:
            /*
            for (NetflixShow show : shows) {
                show.printDetails();
                System.out.println("---------------");
            }
            */
        } else {
            System.out.println("Tidak ada data yang berhasil dibaca.");
        }
    }
}
