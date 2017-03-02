package pl.sda.json;

public class MovieDirectorBuilder {
    private MovieDirector movieDirector;

    public MovieDirectorBuilder() {
        this.movieDirector = new MovieDirector();
    }
    public MovieDirectorBuilder withFirstName(String firstName){
        movieDirector.setFirstName(firstName);
        return this;
    }
    public MovieDirectorBuilder withLastName(String lastName){
        movieDirector.setLastName(lastName);
        return this;
    }
    public MovieDirector build(){
        return movieDirector;
    }
}
