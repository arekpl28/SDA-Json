package pl.sda.json;

import java.util.List;
import java.util.Map;

public class UserBuilder {

    private User user;

    public UserBuilder() {
        this.user = new User();
    }

    public UserBuilder withFirstName(String firstName) {
        user.setFirstName(firstName);
        return this;
    }

    public UserBuilder withlastName(String lastName) {
        user.setLastName(lastName);
        return this;
    }

    public UserBuilder withAddresses(Map<String, Address> addresses) {
        user.setAddresses(addresses);
        return this;
    }

    public UserBuilder withAddress(String addressName, Address address) {
        user.getAddresses().put(addressName, address);
        return this;
    }

    public UserBuilder withChildrenNames(List<String> childrenNames) {
        user.setChildrenNames(childrenNames);
        return this;
    }

    public User build() {
        return user;
    }


}
