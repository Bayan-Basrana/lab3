import java.util.ArrayList;

public class Book extends Media{
    private int stock;
    private ArrayList<Review> reviews;




    Book(String title, String auteur, String ISBN, double price , int stock) {
        super(title, auteur, ISBN, price);
        this.stock=stock;
        this.reviews=new ArrayList<>();
    }


    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setReview(ArrayList<Review> review) {
        this.reviews = review;
    }

    public int getStock() {
        return stock;
    }

    public ArrayList<Review> getReview() {
        return reviews;
    }

    public void addReview (Review review ){
reviews.add(review);
    }
 public double getAverageRating(){
if (reviews.isEmpty())
    return 0;
int sum=0;
for( Review review: reviews){
    sum+=review.getRating();
}
return (double) sum/reviews.size();
 }

public void purchase (User user){
        if (stock>0){
            user.addToCart(this);
        stock--;}
        else
            System.out.println(" out of stock");}



public boolean isBestSeller(){
        return  (getAverageRating()>=4.5);
}

public void restock(int quantity){
        stock+=quantity;
    System.out.println("restocking " + stock);
}



    public String getMediaType() {
        if (getAverageRating()>=4.5)
            return " Bestselling Book";
        else
            return "Book";
    }

    @Override
    public String toString() {
        return "Book : "+
                " stock= " + stock + super.toString();
    }
}
