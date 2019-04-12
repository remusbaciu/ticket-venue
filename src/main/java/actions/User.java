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

        while(password.length() > 10 || password.length() < 4){
            System.out.println("Your password's length should be between 4 and 10 characters.");
            System.out.println("Please re-enter your password:");
            password = cin.next();
        }

        this.password = password;
        System.out.println("You have successfully signed in as " + username);
    }
}

