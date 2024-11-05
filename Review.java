public class Review {

    private String userName;
    private int rating;
    private String comment;


    Review(String userName,int rating, String comment){
        this.userName=userName;
        this.rating=rating;
        this.comment=comment;

    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUserName() {
        return userName;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}
