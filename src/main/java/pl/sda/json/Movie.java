package pl.sda.json;

public class Movie {
    private String originalTitle;
    private String plTitle;
    private MovieDirector movieDirector;

    public MovieDirector getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(MovieDirector movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getPlTitle() {
        return plTitle;
    }

    public void setPlTitle(String plTitle) {
        this.plTitle = plTitle;
    }
}
