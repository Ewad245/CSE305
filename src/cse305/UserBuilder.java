package cse305;

public interface UserBuilder {

    UserBuilder setId(int id);
    UserBuilder setName(String name);
    UserBuilder setEmail(String email);
    UserBuilder setPhoneNumber(String phoneNumber);
    UserBuilder setPassword(String password);
    String getEmail();
    int getId();
    String getName();
    String getPhoneNumber();
    String getPassword();
    User build();
}
