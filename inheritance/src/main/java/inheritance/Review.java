package inheritance;


public class Review {
    public String body;
    public String author;
    public int reviewRating;
    public Restaurant restaurant;
    public Shop shop;
    public Theater theater;
    public String movieTitle;


//  Constructor
    public Review(String body, String author, int reviewRating){
        this.body = body;
        this.author = author;
        this.reviewRating = reviewRating;
    }
//  Overloaded Constructor to pass in movie title to include in reviews
    public Review(String body, String author, int reviewRating, String movieTitle){
        this.body = body;
        this.author = author;
        this.reviewRating = reviewRating;
        this.movieTitle = movieTitle;
    }

//  toString method
    public String toString(){
//  Checks to see if movie title is being passed & builds proper string.
        if(this.movieTitle == null){
            return this.body + " I'd give it a " + this.reviewRating +" Out of 5. Reviewed by: " +this.author;
        } else {
            return this.body + " I'd give it a " + this.reviewRating +" Out of 5. Reviewed by: " +this.author + ". Saw " + this.movieTitle;
        }
    }
}

