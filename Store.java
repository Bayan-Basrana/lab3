import java.util.ArrayList;

public class Store {

    private ArrayList<Media> mediaList ;
    private ArrayList<User> users;

    Store(){
        this.mediaList=new ArrayList<>();
        this.users=new ArrayList<>();

    }
public void adduser(User user){
        users.add(user);
}

    public void addMedia(Media media){
        mediaList.add(media);
    }


    public void displayUser (){
        for (User user:users)
            System.out.println(user.toString());
    }


    public void displayMedias(){
        for(Media m: mediaList)
            System.out.println(m);
    }
public Book searchBook(String title){
for (Media media: mediaList) {
if (media instanceof Book && media.getTitle().equalsIgnoreCase(title)){
    return (Book) media;
}
}
    return null;
}


public ArrayList<Media> getMediaList(){
        return mediaList;
}
}


