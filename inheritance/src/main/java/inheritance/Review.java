package inheritance;


public class Review {
    public String body;
    public String author;
    public int reviewRating;
    public Restaurant restaurant;


//  Constructor
    public Review(String body, String author, int reviewRating){

        this.body = body;
        this.author = author;
        this.reviewRating = reviewRating;
    }

//  toString method
    public String toString(){
        return this.body + " I'd give it a " + this.reviewRating +" Out of 5. Reviewed by: " +this.author;
    }
}

