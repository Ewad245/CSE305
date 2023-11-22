/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse305;
import java.util.*;
/**
 *
 * @author Admin
 */
public interface TenantBuilder extends UserBuilder{
    void setPropList(ArrayList<RentalContract> rentedProperties);
    ArrayList<RentalContract> getList();
    Tenant BuildTenent(UserBuilder userbuild);
}
