package inheritance;

import java.util.ArrayList;

public class Theater {
    public String name;
    public ArrayList<Review> reviews = new ArrayList<>();
    public ArrayList<String> movies = new ArrayList<>();

    public Theater(String name){

        this.name = name;
    }

//  Add movie review
    public void addMovieReview(Review review){
        this.reviews.add(review);
    }

//  add movies
    public void addMovie(String name){
        this.movies.add(name);

    }

//  Remove Movie
    public void removeMovie(int index){
        this.movies.remove(index);
    }


//  toString method
    public String toString(){
        return this.name;
    }
}
