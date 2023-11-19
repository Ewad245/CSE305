/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse305;

import java.util.List;

/**
 *
 * @author Admin
 */
public class TenantBuilderImp implements TenantBuilder {

    private List<RentalContract> rentedProperties;

    @Override
    public void setPropList(List<RentalContract> rentedProperties) {
        this.rentedProperties = rentedProperties;
    }

    @Override
    public List<RentalContract> getList() {
        return rentedProperties;
    }

    @Override
    public Tenant BuildTenent(UserBuilder userbuild) {
        return new Tenant(this,userbuild);
    }


}
