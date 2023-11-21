/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse305;

/**
 *
 * @author Admin
 */
public class ConcretePropertyBuilder implements PropertyBuilder {

    int PropertyID;
    String Description;
    float RentalRate;

    @Override
    public void setPropertyID(int PropertyID) {
        this.PropertyID=PropertyID;
    }

    @Override
    public void setDescription(String description) {
        this.Description=description;
    }

    @Override
    public void setRentalRate(float RentalRate) {
        this.RentalRate=RentalRate;
    }

    @Override
    public int getPropertyID() {
        return PropertyID;
    }

    @Override
    public String getDescription() {
        return Description;
    }

    @Override
    public float getRentalRate() {
        return RentalRate;
    }

    @Override
    public Property buildProperty() {
        return new Property(this);
    }

}
