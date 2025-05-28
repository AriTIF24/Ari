public class NetflixShow {
    private String showId, type, title, director, cast, country, dateAdded, rating, duration, listedIn, description;
    private int releaseYear;

    public NetflixShow(String showId, String type, String title, String director, String cast, String country, String dateAdded, int releaseYear, String rating, String duration, String listedIn, String description) {
        this.showId = showId;
        this.type = type;
        this.title = title;
        this.director = director;
        this.cast = cast;
        this.country = country;
        this.dateAdded = dateAdded;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.duration = duration;
        this.listedIn = listedIn;
        this.description = description;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Type: " + type);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Duration: " + duration);
        System.out.println("Country: " + country);
        System.out.println("Description: " + description);
    }

    // Getters dan Setters jika diperlukan
}
