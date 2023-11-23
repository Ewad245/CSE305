/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse305;

import java.util.ArrayList;

/**
 *
 * @author thomasjohnson
 */
public class ConcreteOwnerBuilder implements PropertyOwnerBuilder {

    private ArrayList<Property> Proplist;
    private String AuthenticKey;
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    @Override
    public void setPropList(ArrayList<Property> list) {
        this.Proplist=list;
    }

    @Override
    public ArrayList<Property> getList() {
        return Proplist;
    }

    @Override
    public PropertyOwner BuildOwner(UserBuilder userbuild) {
        return new PropertyOwner(this);
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    private static String getAlphaNumericString(int n) {

        // choose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb 
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    @Override
    public void setAuthenticKey() {
        this.AuthenticKey = ConcreteOwnerBuilder.getAlphaNumericString(10);
    }

    @Override
    public String getAuthenticKey() {
        return AuthenticKey;
    }

}
