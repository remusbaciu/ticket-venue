package actions;

import java.util.Scanner;

public abstract class User {

    protected String username;
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String password;

    public Scanner cin = new Scanner(System.in);

    public void userLogin() {
        String username;
        String password;

        System.out.println("Please login!");
        System.out.println("Enter Username:");
        username = cin.next();
        this.username = username;
        System.out.println("Enter password:");
        password = cin.next();
        this.password = password;
        System.out.println("You have successfully signed in as " + username);
    }
}