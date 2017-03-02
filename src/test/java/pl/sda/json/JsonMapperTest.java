package pl.sda.json;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class JsonMapperTest {
    @Test
    public void test1() throws IOException {
        String jsonToDeserialize = "{\"firstName\":\"Jan\",\"lastName\":\"Kowalski\",\"addresses\":" +
                "{\"Work\":{\"street\":\"Marcelinska\",\"code\":\"22-444\",\"city\":\"Slupsk\"}" +
                ",\"Home\":{\"street\":\"Baraniaka\",\"code\":\"22-222\",\"city\":\"Poznan\"" +
                "}},\"childrenNames\":[\"Marek\",\"Anna\"]}\n";

        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(jsonToDeserialize, User.class);

        Assert.assertEquals("Jan", user.getFirstName());
        Assert.assertNotNull(user.getChildrenNames());
        Assert.assertTrue(user.getChildrenNames() != null);
        Assert.assertTrue(user.getChildrenNames().size() == 2);
        Assert.assertEquals(Arrays.asList("Marek", "Anna"), user.getChildrenNames());
    }

    @Test
    public void test2() throws IOException {
        User user = new UserBuilder()
                .withFirstName("Jan")
                .withlastName("Kowalski")
                .withAddress("work", new AddressBuilder()
                        .withCity("Slupsk")
                        .withCode("22-444")
                        .withStreet("Marcelinska")
                        .build())
                .withAddress("home", new AddressBuilder()
                        .withCity("Poznan")
                        .withCode("22-222")
                        .withStreet("Baraniaka")
                        .build())
                .withChildrenNames(Arrays.asList("Marek", "Anna"))
                .build();

        ObjectMapper mapper = new ObjectMapper();

        String serializedObject = mapper.writeValueAsString(user);

        Assert.assertTrue(serializedObject.contains("\"firstName\":\"Jan\""));
        Assert.assertTrue(serializedObject.contains("Kowalski"));
        Assert.assertTrue(serializedObject.contains("Anna"));

    }

    @Test
    public void test3() throws IOException {
        User user = new UserBuilder()
                .withFirstName("Jan")
                .withlastName("Kowalski")
                .withAddress("work", new AddressBuilder()
                        .withCity("Slupsk")
                        .withCode("22-444")
                        .withStreet("Marcelinska")
                        .build())
                .withAddress("home", new AddressBuilder()
                        .withCity("Poznan")
                        .withCode("22-222")
                        .withStreet("Baraniaka")
                        .build())
                .withChildrenNames(null)
                .build();

        ObjectMapper mapper = new ObjectMapper();

        String serializedObject = mapper.writeValueAsString(user);

        System.out.println(serializedObject);


    }

}

