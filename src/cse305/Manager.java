package cse305;

import java.util.ArrayList;

public class Manager {

    private ArrayList<Tenant> listTenant;
    private ArrayList<PropertyOwner> listOwner;
    private int numOfTenant;
    private int numOfOwner;

    //Constructor
    public Manager() {
        listTenant = new ArrayList<Tenant>();
        listOwner = new ArrayList<PropertyOwner>();
        numOfTenant = listTenant.size();
        numOfOwner = listOwner.size();
    }

    //Methods
    public void Register(TenantBuilder builder) {
        Tenant newTenant = new Tenant(builder);
        listTenant.add(newTenant);
        numOfTenant = listTenant.size();
    }

    public void Register(PropertyOwnerBuilder builder) {
        PropertyOwner newOwner = new PropertyOwner(builder);
        listOwner.add(newOwner);
        numOfOwner = listOwner.size();

    }

    public User Login(String name, String password) {
        for (int i = 0; i < listOwner.size(); i++) {
            if (listOwner.get(i).getName().equals(name)) {
                if (listOwner.get(i).getPassword().equals(password)) {
                    return listOwner.get(i);
                }
            }
        }
        for (int i = 0; i < listTenant.size(); i++) {
            if (listTenant.get(i).getName().equals(name)) {
                if (listTenant.get(i).getPassword().equals(password)) {
                    return listTenant.get(i);
                }
            }
        }
        return null;
    }

}
