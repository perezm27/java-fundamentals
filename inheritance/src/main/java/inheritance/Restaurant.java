package inheritance;


import java.util.ArrayList;

public class Restaurant {
    public String name;
    public int starRating;
    public String priceCategory;
    public ArrayList<Review> reviews = new ArrayList<>();

// Constructor
    public Restaurant(String name, int starRating, String priceCategory){
        this.name = name;
        this.starRating = starRating;
        this.priceCategory = priceCategory;
    }

//  Add Review
    public void addReview(Review review){
//  Checks if review already exists in ArrayList
        if (!reviews.contains(review)){
//  Attaches review to restaurant & adds review to reviews ArrayList
            this.reviews.add(review);
//  Updates star rating
            this.starRating = review.reviewRating;
        }
    }
//  toString method
    public String toString(){
        return this.name + " has a start rating of " + this.starRating +
        " & has a price category of " + this.priceCategory;
    }
}
