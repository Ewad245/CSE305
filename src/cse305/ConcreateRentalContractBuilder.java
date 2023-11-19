package cse305;

import java.util.Date;

public class ConcreateRentalContractBuilder implements RentalContractBuilder {

    private int contractID;
    private int propertyID;
    private int tenantID;
    private Date startDate;
    private Date endDate;
    private float rentAmount;

    @Override
    public void setContractID(int ContractID) {
        this.contractID=contractID;
    }

    @Override
    public void setPropertyID(int PropertyID) {
        this.propertyID=propertyID;
    }

    @Override
    public void setTenantID(int TenantID) {
        this.tenantID=tenantID;
    }

    @Override
    public void setStartDate(Date StartDate) {
        this.startDate=StartDate;
    }

    @Override
    public void setEndDate(Date EndDate) {
        this.endDate=endDate;
    }

    @Override
    public void setRent(float Rent) {
        this.rentAmount=Rent;
    }

    @Override
    public int getContractID() {
        return contractID;
    }

    @Override
    public int getPropertyID() {
        return propertyID;
    }

    @Override
    public int getTenantID() {
        return tenantID;
    }

    @Override
    public Date getStartDate() {
        return startDate;
    }

    @Override
    public Date getEndDate() {
        return endDate;
    }

    @Override
    public float getRent() {
        return rentAmount;
    }

    @Override
    public RentalContract RentBuild() {
        return new RentalContract(this);
    }

}
