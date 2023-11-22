
package cse305;

import java.util.ArrayList;


public class Manager {
    private ArrayList<Tenant> listTenant;
    private ArrayList<PropertyOwner> listOwner;
    private int numOfTenant;
    private int numOfOwner;
    //Constructor
    public Manager() {
        listTenant=new ArrayList<Tenant>();
        listOwner=new ArrayList<PropertyOwner>();
        numOfTenant=listTenant.size();
        numOfOwner=listOwner.size();
    }
    //Methods
    public void Register(TenantBuilder tbuilder,UserBuilder ubuilder) {
        Tenant newTenant = new Tenant(tbuilder, ubuilder);
        listTenant.add(newTenant);
    }
    public void Register(UserBuilder ubuilder) {
        PropertyOwner newOwner = new PropertyOwner(ubuilder);
        
    }
    
}
