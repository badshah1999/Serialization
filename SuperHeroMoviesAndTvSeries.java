package complexJson;

import java.util.List;

public class SuperHeroMoviesAndTvSeries {
    String category;
    List<String> acceptedFranchise;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getAcceptedFranchise() {
        return acceptedFranchise;
    }

    public void setAcceptedFranchise(List<String> acceptedFranchise) {
        this.acceptedFranchise = acceptedFranchise;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<Movies> getMovies() {
        return movies;
    }

    public void setMovies(List<Movies> movies) {
        this.movies = movies;
    }

    public List<TVSeries> getTvseries() {
        return tvseries;
    }

    public void setTvseries(List<TVSeries> tvseries) {
        this.tvseries = tvseries;
    }

    public OtherDetails getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(OtherDetails otherDetails) {
        this.otherDetails = otherDetails;
    }

    List<String> genres;
    List<Movies> movies;
    List<TVSeries> tvseries;
    OtherDetails otherDetails;

}
