
package cse305;


public interface PropertyBuilder {
    public void setPropertyID(int PropertyID);
    public void setDescription(String description);
    public void setRentalRate(float RentalRate);
    public int getPropertyID();
    public String getDescription();
    public float getRentalRate();
    public Property buildProperty();
}
