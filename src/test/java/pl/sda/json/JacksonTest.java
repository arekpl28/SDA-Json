package pl.sda.json;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class JacksonTest {
    @Test
    public void test1() {
        String jsonToDeserialize = "{\"firstName\":\"Bartosz\"," +
                "\"lastName\":\"Nowak\"," +
                "\"addresses\":{\"Home\":{\"street\":\"Al. Niepodległości\",\"city\":\"Poznań\"}}}";
    }

    @Test
    public void test2() throws IOException {
        String jsonToDeserialize = "{\"originalTitle\":\"Saving Private Ryan\",\"plTitle\":\"Szeregowiec Ryan\",\"director\":" +
                "{\"firstName\":\"Steven\",\"lastName\":\"Spielberg\"}}";

//        ObjectMapper mapper = new ObjectMapper();
//        Movie movie = mapper.readValue(jsonToDeserialize, Movie.class);
//
//        Assert.assertEquals("Saving Private Ryan", movie.getOriginalTitle());
//        Assert.assertEquals("Szeregowiec Ryan", movie.getPlTitle());
    }

    @Test
    public void test3() {
        String jsonToDeserialize = "{\"originalTitle\":\"Empire Strikes Back\",\"plTitle\":\"Imperium kontratakuje\",\"director\":" +
                "{\"firstName\":\"Irvin\",\"lastName\":\"Kershner\"}, \"boxOffice\":538375067}";

    }
}
