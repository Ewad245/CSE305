
package cse305;


public class Property {
    int PropertyID;
    String Description;
    float RentalRate;
    String status;
    
    //Contructor
    public Property(PropertyBuilder builder){
        this.PropertyID=builder.getPropertyID();
        this.Description=builder.getDescription();
        this.RentalRate=builder.getRentalRate();
        this.status="Vacant";
    }
    //Method
    public void CreateProperty() {
        
    }
    public void UpdateProperty(String status) {
        this.status=status;
    }
    public void DeleteProperty() {
        
    }
}
