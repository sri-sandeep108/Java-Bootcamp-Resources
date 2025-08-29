public class Store {

    private Movie[] movies;

    public Store() {
        movies = new Movie[10];
    }

    public Movie getMovie(int index) {
        Movie temp = new Movie(movies[index]);
        return temp;
    }

    public void setMovie(int index, Movie movie) {
        Movie temp = new Movie(movie);
        movies[index] = temp;
    }

    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
