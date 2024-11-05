import java.util.List;

public class Music extends Media{

    private String artist;

    Music(String title, String auteur, String ISBN, double price ,String artist) {
        super(title, auteur, ISBN, price);
        this.artist=artist;
    }


    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist(){
        return artist;
    }


    public void listen (User user){
user.addPurchase(this);
        System.out.println("Allows users to listen to music");
    }

    public void generatePlaylist (List<Music> musicCatalog){
        System.out.println(" play List for artist: " + artist);
        for(Music music:musicCatalog){
            if(music.getArtist().equalsIgnoreCase(this.artist)){
                System.out.println(music.getTitle());
            }}
    }



    public  String getMediaType (){
        if (super.getPrice()>=10)
            return "Premium Music";
        else
            return "Music" ;}


    @Override
    public String toString() {
        return
                "Music : artist= " + artist +super.toString() ;
    }
}
