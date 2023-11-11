package lab_cse305;

import java.util.ArrayList;
import java.util.List;

public class Tenant extends User {

    private List<RentalContract> rentedProperties;

    public Tenant(String userID, String firstName, String lastName, String email, String password) {
        super(userID, firstName, lastName, email, password);
        rentedProperties = new ArrayList<>();
    }

    public Tenant() {
    }
    
    
    public List<RentalContract> getRentedProperties() {
        return new ArrayList<>(rentedProperties); // Return a copy to prevent external modification
    }

    public void createRentalContract(Property property, int durationMonths) {
       
        RentalContract newContract = new RentalContract(property, durationMonths);
        rentedProperties.add(newContract);

        System.out.println("Rental contract created successfully.");
    }

    public void terminateRentalContract(RentalContract contract) {
        if (rentedProperties.contains(contract)) {
            contract.terminateContract();
            rentedProperties.remove(contract);
            System.out.println("Rental contract terminated successfully.");
        } else {
            System.out.println("Invalid rental contract. Unable to terminate.");
        }
    }
}
