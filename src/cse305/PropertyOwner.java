/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse305;

import java.util.ArrayList;
import java.util.List;

public class PropertyOwner extends User {

    private String AuthenticationKey;
    private ArrayList<Property> ListProperty;

    public PropertyOwner(PropertyOwnerBuilder builder) {
        super(builder);
        ListProperty = builder.getList();
        AuthenticationKey = builder.getAuthenticKey();

    }

    public PropertyOwner getOwner() {
        return this;
    }
    public String getKey() {
        return AuthenticationKey;
    }

    public ArrayList<Property> getList() {
        return ListProperty;
    }
    public Property findPropertyByID(int ID) {
    for (int i=0;i<ListProperty.size();i++){
        Property prop=ListProperty.get(i);
        if(prop.getPropertyID()==ID){
            return prop;
        }
    }
    return null;
}

    //Contructors
    //Default
    //Method
//    public ArrayList ListProperty(ArrayList List) {
//        return List;
//    }
//
//    public class PropertyOwner extends User {
//
//        private List<Property> ownedProperties;
//
//        public PropertyOwner(List<Property> ownedProperties) {
//            this.ownedProperties = ownedProperties;
//        }
//
//        public void listProperties() {
//            System.out.println("Owned Properties:");
//            for (Property property : ownedProperties) {
//                System.out.println(property.toString());
//            }
//    
//
//    
//
//        public void createProperty(String propertyName, double rentalRate, String location) {
//            int propertyID = generatePropertyID();
//            Property newProperty = new Property(propertyID, propertyName, rentalRate);
//            ownedProperties.add(newProperty);
//            System.out.println("Property created successfully.");
//        }
//
//        public void updateProperty(Property property, String newPropertyID, double newRentalRate, String newLocation) {
//            property.setPropertyID(Integer.parseInt(newPropertyID));
//            property.setRentalRate(newRentalRate);
//
//            System.out.println("Property updated successfully.");
//        }
//
//        public void deleteProperty(Property property) {
//            ownedProperties.remove(property);
//            System.out.println("Property deleted successfully.");
//        }
    private int generatePropertyID() {
        return (int) (Math.random() * 1000);
    }
}
