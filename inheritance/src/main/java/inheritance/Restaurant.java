package inheritance;

public class Restaurant {
    private final String name;
    private final int starRating;
    private final int numOfDollarSigns;

// Constructor
    public Restaurant(String name, int starRating, int numOfDollarSigns){

        this.name = name;
        this.starRating = starRating;
        this.numOfDollarSigns = numOfDollarSigns;
    }

//  Add Review
    public void addReview(){

    }

    public String toString(){
        return this.name + " has a start rating of " + this.starRating +
        " & has a price category of " + this.numOfDollarSigns;
    }
}
