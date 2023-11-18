package cse305;

import java.util.*;

public class User {

    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    public User(UserBuilder builder) {
        this.id = builder.getId();
        this.name =builder.getName();
        this.email = builder.getEmail();
        this.phoneNumber =builder.getPhoneNumber();
        this.password=builder.getPassword();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public static UserBuilder builder() {
        return new UserBuilderImpl();
    }
     

    //Methods
//    public void Register() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter your first name: ");
//        this.firstName = sc.nextLine();
//
//        System.out.println("Please enter your last name: ");
//        this.lastName = sc.nextLine();
//
//        System.out.println("Please enter your user ID: ");
//        this.userID = sc.nextLine();
//
//        System.out.println("Please enter your password: ");
//        this.password = sc.nextLine();
//
//        System.out.println("Please enter your email: ");
//        this.email = sc.nextLine();
//    }
//
//    public void Login() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your user ID: ");
//        String enterID = sc.nextLine();
//        System.out.println("Enter your password: ");
//        String enterPassword = sc.nextLine();
//        if (enterID.equals(this.userID) && enterPassword.equals(this.password)) {
//            System.out.println("Login Successfully");
//        } else {
//            System.out.println("Wrong ID or password, please enter again");
//            System.out.println("Enter your user ID: ");
//            enterID = sc.nextLine();
//            System.out.println("Enter your password: ");
//            enterPassword = sc.nextLine();
//        }
//    }
//
//    public void UpdateProfile() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter your new first name: ");
//        this.firstName = sc.nextLine();
//
//        System.out.println("Please enter your new last name: ");
//        this.lastName = sc.nextLine();
//
//        System.out.println("Please enter your new email: ");
//        this.email = sc.nextLine();
//    }
//
//    public void ResetPassword() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter current password: ");
//        String enterPassword = sc.nextLine();
//        if (enterPassword.equals(this.password)) {
//            this.password = enterPassword;
//            System.out.println("You have changed password successfully");
//        } else {
//            System.err.println("Wrong password, please re-enter again!");
//            enterPassword = sc.nextLine();
//
            }
