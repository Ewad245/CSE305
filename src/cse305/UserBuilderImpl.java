/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse305;

/**
 *
 * @author Admin
 */
class UserBuilderImpl implements UserBuilder {

    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    @Override
    public UserBuilder setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public UserBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public User build() {
        return new User(this);
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public UserBuilder setPassword(String password) {
       this.password=password;
       return this;
    }

    @Override
    public String getPassword() {
        return password;
    }

}
