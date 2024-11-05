import java.util.ArrayList;

public class User {


   private String userName;
   private String email;
    private ArrayList<Media> purchaseMediaList=new ArrayList<>();
    private ArrayList<Media> shoppingCart =new ArrayList<>();

    User(String userName,String email ){
        this.userName=userName;
        this.email=email;
        this.purchaseMediaList=new ArrayList<>();
        this.shoppingCart=new ArrayList<>();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPurchaseMediaList(ArrayList<Media> purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


    public String getUserName(){
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }


    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }



    public void addToCart (Media media){
      shoppingCart.add(media);
    }

    public void removeFromCart (Media media){
       shoppingCart.remove(media);
    }


public void addPurchase (Media media){
        purchaseMediaList.add(media);
}


    public void checkout(){
        if(shoppingCart.isEmpty()){
            System.out.println(" checkout failed : shopping cart is empty");
        }
        else {
        purchaseMediaList.addAll(shoppingCart);
        shoppingCart.clear();
            System.out.println(" checkout completed");}
    }

    @Override
    public String toString() {
        return "User: " +
                "userName= " + userName +
                ". email= " + email;
    }
}
