/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse305;

import java.util.ArrayList;

/**
 *
 * @author thomasjohnson
 */
public interface PropertyOwnerBuilder extends UserBuilder {

    void setPropList(ArrayList<Property> list);

    void setAuthenticKey();

    String getAuthenticKey();

    ArrayList<Property> getList();

    PropertyOwner BuildOwner(UserBuilder userbuild);
}
