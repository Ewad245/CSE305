/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse305;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TenantBuilderImp implements TenantBuilder {

    private ArrayList<RentalContract> rentedProperties;
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    @Override
    public void setPropList(ArrayList<RentalContract> rentedProperties) {
        this.rentedProperties = rentedProperties;
    }

    @Override
    public ArrayList<RentalContract> getList() {
        return rentedProperties;
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

    @Override
    public Tenant BuildTenent(UserBuilder userbuild) {
        return new Tenant(this);
    }

}
