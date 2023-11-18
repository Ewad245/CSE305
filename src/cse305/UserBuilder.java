package cse305;

public interface UserBuilder  {

    void setId(int id);
    void setName(String name);
    void setEmail(String email);
    void setPhoneNumber(String phoneNumber);
    void setPassword(String password);
    String getEmail();
    int getId();
    String getName();
    String getPhoneNumber();
    String getPassword();
    User build();
}
