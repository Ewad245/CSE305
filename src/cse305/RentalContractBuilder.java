/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse305;

import java.util.Date;

/**
 *
 * @author Admin
 */
public interface RentalContractBuilder {
    void setContractID(int ContractID);
    void setPropertyID(int PropertyID);
    void setTenantID(int TenantID);
    void setStartDate(Date StartDate);
    void setEndDate(Date EndDate);
    void setRent(float Rent);
    int getContractID();
    int getPropertyID();
    int getTenantID();
    Date getStartDate();
    Date getEndDate();
    float getRent();
    RentalContract RentBuild();
    
}
