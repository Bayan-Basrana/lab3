import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Store store = new Store();
//movies
        Movie movie1=new Movie("Inception","Christopher Nolan",
                "12568",20,115);
        Movie movie2=new Movie("Oppenheimer","Christopher Nolan",
                "56789",20,180);
        Movie movie3=new Movie("The Blue Elephant","Marwan Hamed",
                "548997",20,170);
//books
        Book book1=new Book("The 48 Laws of Power","Robert Greene","97884670",
                74.34,4);
        Book book2 = new Book("Java Programming", "John Doe", "123456789", 50.0, 1);
//music
        Music music1= new Music("Tetnafasek Denyaay","Ahmed El Harmi",
                "978141298",5,"Abdul Majeed Abdullah");
        Music music2=new Music("Ya Boaadhom", "Samy ","1236588",20,"Abdul Majeed Abdullah");
        Music music3=new Music("Hala Bish", "Turky ","15689725",7,"Abdul Majeed Abdullah");
        Music music4=new Music("Omry Ebtada", "Sherif Badr ","1111586",15,"Tamer Hosny");

 //novell & AcademicBook
        Novel novel1 = new Novel("The Java Novel", "Emily Brown", "2468101214", 20.0, 5, "Fantasy");
        AcademicBook academicBook1 = new AcademicBook("Advanced Java", "Prof. Alan Turing", "135791113", 70.0, 7, "Computer Science");
        store.addMedia(book1);
        store.addMedia(book2);

        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(movie3);

        store.addMedia(music1);
        store.addMedia(music2);
        store.addMedia(music3);
        store.addMedia(music4);

        store.addMedia(novel1);
        store.addMedia(academicBook1);

        System.out.println("Available Media in Store:");
        store.displayMedias();

        User user1=new User("Bayan","bayan@hotmail.com");
        User user2=new User("Farida", "jory@hotmail.com");
        User user3=new User("Toha", "toha@hotmail.com");

        store.adduser(user1);
        store.adduser(user2);

        user1.addToCart(music1);
        user1.addToCart(movie1);
        user1.addToCart(book1);
        user2.addToCart(book1);

        System.out.println("*****************************************");
        // checkout for user 1
        user1.checkout();

        System.out.println("*****************************************");
        System.out.println("stock of book: "+ book2.getTitle()+  " = " + book2.getStock());
     book2.purchase(user2);
        System.out.println("stock of book after purchase: "+ book2.getTitle()+  " = " + book2.getStock());
        //out of stock
        book2.purchase(user3);
        System.out.println("*****************************************");

// try to check out for empty  shopping cart
        System.out.println(" trying checkout for empty shoppingCart: ");
        user3.checkout();
        Review review1=new Review("bayan",5,"Amazing book");
        Review review2= new Review("Farida",5,"nice book");

        Review review3= new Review("bayan",4,"nice book");

        book1.addReview(review1);
        book1.addReview(review2);
        book2.addReview(review3);
        System.out.println("*****************************************");
        System.out.println(" Average rating for book " + book1.getTitle() + "  =" + book1.getAverageRating());

        System.out.println("*****************************************");

//search book
        Book foundBook=store.searchBook("Java Programming");
        if (foundBook != null) {
            System.out.println(" Searched Book Found" + foundBook.toString());
        } else {
            System.out.println("Book not found in store.");
        }
        System.out.println("*****************************************");
        System.out.println();
        System.out.println("Registered Users:");
        store.displayUser();
        System.out.println("*****************************************");

        System.out.println("Similar Movies Recommended:");
        movie1.recommendSimilarMovies(store.getMediaList());
        System.out.println("*****************************************");

        System.out.println("stock of book: " +book1.getTitle()+  " = " + book1.getStock());
        book1.restock(3);
        System.out.println("stock after restock: " + book1.getTitle() + book1.toString());
        System.out.println("*****************************************");

        System.out.println("is " +book1.getTitle()+ " best seller? "
        + (book1.isBestSeller() ? "yes" : "no"));

        System.out.println("is " +book2.getTitle()+ " best seller? "
                + (book2.isBestSeller() ? "yes" : "no"));

        System.out.println("*****************************************");

        System.out.println(user1.getUserName() );
        movie1.watch(user1);
        System.out.println("*****************************************");
        System.out.println(user1.getUserName() );
        music1.listen(user1);

        System.out.println("*****************************************");

        ArrayList<Music> musicCatalog =new ArrayList<>();
        musicCatalog.add(music1);
        musicCatalog.add(music2);
        musicCatalog.add(music3);
        musicCatalog.add(music4);
        music1.generatePlaylist(musicCatalog);

        System.out.println("*****************************************");
        System.out.println(" Testing media type :");
        //books
        System.out.println(book1.getTitle() + " >> " + book1.getMediaType());
        System.out.println(book2.getTitle() + " >> " + book2.getMediaType());
        //movies
        System.out.println(movie1.getTitle() + " >> " + movie1.getMediaType());
        System.out.println(movie2.getTitle() + " >> " + movie2.getMediaType());
        //music
        System.out.println(music2.getTitle() + " >> " + music2.getMediaType());
        System.out.println(music3.getTitle() + " >> "  + music3.getMediaType());

    }
}



