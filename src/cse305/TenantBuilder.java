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
public interface TenantBuilder{
    void setPropList(List<RentalContract> rentedProperties);
    List<RentalContract> getList();
    Tenant BuildTenent(UserBuilder userbuild);
}
