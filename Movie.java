import java.util.ArrayList;

public class Movie extends Media{

    private int duration ;

    Movie(String title, String auteur, String ISBN, double price , int duration) {
        super(title, auteur, ISBN, price);
        this.duration=duration;

    }


    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }


    public void watch (User user){
        user.addPurchase(this);
        System.out.println("Allows users to watch the movie");
    }


    public void recommendSimilarMovies (ArrayList<Media> movieCatalog){
        for(Media movie:movieCatalog){
            if(movie.getAuteur().equalsIgnoreCase(this.getAuteur())){
                System.out.println( "recommend Similar Movies: " + movie.getTitle());
            }}
    }

    @Override
    public String getMediaType() {
        if (duration>=120)
        return "Long Movie";
        else
            return "Movie";
    }

    @Override
    public String toString() {
        return
                "Movie: " +
                "duration=" + duration + super.toString();
    }
}
