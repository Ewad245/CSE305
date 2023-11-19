/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse305;

import java.util.Date;

/**
 *
 * @author Student
 */
public class RentalContract {
    private int contractID;
    private int propertyID;
    private int tenantID;
    private Date startDate;
    private Date endDate;
    private float rentAmount;

    // Constructor

//    public RentalContract(Property property, int durationMonths) {
//        
//        
//    }
    

    public RentalContract(RentalContractBuilder builder) {
        this.contractID = builder.getContractID();
        this.propertyID = builder.getPropertyID();
        this.tenantID = builder.getTenantID();
        this.startDate = builder.getStartDate();
        this.endDate = builder.getEndDate();
        this.rentAmount = builder.getRent();
    }
    
    
     public void createContract(Property property, Tenant tenant, int durationMonths) {
        // Logic to create a new rental contract
        this.propertyID = property.getPropertyID();
        this.tenantID = Integer.parseInt(tenant.getUserID());
        this.startDate = new Date(); // Set the start date to the current date
        // Calculate the end date based on the duration
        // (Note: This is a simple example, and you might want to use a more robust method)
        this.endDate = calculateEndDate(startDate, durationMonths);
        this.rentAmount = property.getRentalRate() * durationMonths;

        System.out.println("Rental contract created successfully.");
    }
    public void terminateContract() {
      this.endDate = new Date(); // Set the end date to the current date

        System.out.println("Rental contract terminated successfully.");
    }
     private Date calculateEndDate(Date startDate, int durationMonths) {
        // Implement your logic to calculate the end date based on the start date and duration
        // (This is a placeholder, you may want to use a more sophisticated approach)
        // For simplicity, this example adds the duration directly to the start date
        return new Date(startDate.getTime() + durationMonths * 30 * 24 * 60 * 60 * 1000L);
    }
}
