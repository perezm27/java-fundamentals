package inheritance;

import java.util.ArrayList;

public class Shop {
    public String name;
    public String description;
    public String price;
    public ArrayList<Review> reviews = new ArrayList<>();

//  Constructor
    public Shop (String name, String description, String price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

//  Add Review
    public void addShopReview(Review review){
        this.reviews.add(review);
}

//  toString method
    public String toString(){
        return this.name + this.description +
                " & has a price category of " + this.price;
    }

}
