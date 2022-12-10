package complexJson;


import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Serializing the objects into Json File
 */
public class Serialization {
    public static void main(String[] args) throws IOException {

        SuperHeroMoviesAndTvSeries obj = new SuperHeroMoviesAndTvSeries();
        obj.setCategory("Super Hero Movies and TV Series");

        List<String> acceptedfranchise = new ArrayList<>();
        acceptedfranchise.add("DC");
        acceptedfranchise.add("Marvel");
        obj.setAcceptedFranchise(acceptedfranchise);

        List<String> genres = new ArrayList<>();
        genres.add("Action");
        genres.add("Adventure");
        genres.add("Dark");
        genres.add("Horror");
        obj.setGenres(genres);

        List<Movies> allmovies = new ArrayList<>();
        Movies dc = new Movies();
        dc.setTitle("The dark knight");
        dc.setYear(2008);

        List<String> dccast = new ArrayList<>();
        dccast.add("Christian Bale");
        dccast.add("Heath Ledger");
        dc.setCast(dccast);
        allmovies.add(dc);

        Movies dc1 = new Movies();
        dc1.setTitle("The Batman");
        dc1.setYear(2021);

        List<String> dccast1 = new ArrayList<>();
        dccast1.add("Robert Pattinson");
        dccast1.add("Paul Dano");
        dc1.setCast(dccast1);
        allmovies.add(dc1);

        List<TVSeries> alltvseries = new ArrayList<>();

        TVSeries tvSeries = new TVSeries();
        tvSeries.setTitle("The dark");
        tvSeries.setYear(2017);
        alltvseries.add(tvSeries);

        TVSeries tvSeries1 = new TVSeries();
        tvSeries1.setTitle("Money Heist");
        tvSeries1.setYear(2021);
        alltvseries.add(tvSeries1);

        OtherDetails otherDetails = new OtherDetails();
        otherDetails.setLanguage("English");
        otherDetails.setCountry("USA");

        obj.setMovies(allmovies);
        obj.setTvseries(alltvseries);
        obj.setOtherDetails(otherDetails);

        /**
         * Object Mapper is coming from jackson binding library
         * This will create a Json file and store in the mentioned path name
         **/
        ObjectMapper mapper = new ObjectMapper();
        File json = new File("/Users/badshah.p/Downloads/MovieJsonfile.json");
        mapper.writerWithDefaultPrettyPrinter().writeValue(json, obj);


    }
}
