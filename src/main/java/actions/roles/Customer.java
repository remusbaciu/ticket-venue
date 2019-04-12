package actions.roles;

import actions.User;

public class Customer extends User {

    public void getProfileInfo() {
        System.out.println("Please enter profile details for " + username);
        System.out.println("First Name:");
        firstName = cin.next();

        System.out.println("Last Name:");
        lastName = cin.next();

        System.out.println("Address:");
        address = cin.next();
    }
}
