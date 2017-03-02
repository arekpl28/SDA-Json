package pl.sda.json;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        User user1 = new User();
        user1.setFirstName("Jan");
        user1.setLastName("Kowalski");

        Address address1 = new Address();
        address1.setStreet("Baraniaka");
        address1.setCode("22-222");
        address1.setCity("Poznan");


        Address address2 = new Address();
        address2.setStreet("Marcelinska");
        address2.setCode("22-444");
        address2.setCity("Slupsk");

        Map<String, Address> addresses = new HashMap<>();
        addresses.put("Home", address1);
        addresses.put("Work", address2);

        user1.setAddresses(addresses);
        List<String> childrenNames = Arrays.asList("Marek", "Anna");

        user1.setChildrenNames(childrenNames);

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(user1);

        System.out.println(json);

    }
}
