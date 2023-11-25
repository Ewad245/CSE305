/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cse305;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.reflect.Field;

/**
 *
 * @author Student
 */
public class CSE305 {

    static Scanner reader = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id;
        String name;
        String email;
        String phoneNumber;
        String password;
        ArrayList<RentalContract> rentedProperties = null;
        ArrayList<Property> Properties = null;
        User loggedUser = null;
        Manager man = new Manager();
        int command = 0;
        while (command != 10) {
            System.out.println("1.Register" + "\n" + "2.Log in" + '\n' + "3.Exit");
            command = reader.nextInt();
            switch (command) {
                case 1:
                    System.out.print("Please write ID(consist a string with no space): ");
                    id = reader.nextInt();
                    System.out.print("Please write your Name: ");
                    name = reader.next();
                    System.out.print("Write your email: ");
                    email = reader.next();
                    System.out.print("Plase write your phone number");
                    phoneNumber = reader.next();
                    System.out.print("Password:");
                    password = reader.next();
                    System.out.println("What do you want to be?(Tenant or Property Owner)");
                    reader.nextLine();
                    String choice = reader.nextLine();
                    if (choice.equalsIgnoreCase("Tenant")) {
                        TenantBuilder tbuild = new TenantBuilderImp();
                        tbuild.setId(id);
                        tbuild.setEmail(email);
                        tbuild.setName(name);
                        tbuild.setPhoneNumber(phoneNumber);
                        tbuild.setPassword(password);
                        tbuild.setTenantID();
                        tbuild.setRentalList(rentedProperties);
                        System.out.println(man.Register(tbuild).getEmail());
                    } else if (choice.equalsIgnoreCase("Property Owner")) {
                        PropertyOwnerBuilder obuild = new ConcreteOwnerBuilder();
                        obuild.setId(id);
                        obuild.setName(name);
                        obuild.setPassword(password);
                        obuild.setEmail(email);
                        obuild.setPhoneNumber(phoneNumber);
                        obuild.setPropList(Properties);
                        obuild.setAuthenticKey();
                        System.out.println(man.Register(obuild).getEmail());
                    }
                    break;
                case 2:
                    System.out.print("Please write your name:");
                    name = reader.next();
                    System.out.print("Please write your password");
                    password = reader.next();
                    loggedUser = man.Login(name, password);
                    break;

            }
            if (loggedUser != null) {
                break;
            }
        }
        if (loggedUser instanceof PropertyOwner) {
            PropertyOwner owner = (PropertyOwner)loggedUser;
            System.out.println(owner.getKey());
        } else if(loggedUser instanceof Tenant) {
            Tenant tenant = (Tenant)loggedUser;
        }

    }
    private static void OwnerTerminal(PropertyOwner owner,Manager man) {
        int command=0;
        System.out.println("1.Add Property" + "\n" + "2.Delete Property" + '\n' + "3.Update Property"+'\n' + "4.Exit");
        while(command!=4) {
            switch (command) {
                case 1:
                    
            }
        }
    }
    private static void TenantTerminal(Tenant tenant,Manager man) {
        
    }
}
