import actions.Show;
import actions.Ticket;
import actions.roles.Customer;

public class Main {
    public static void main(String[] args) {
        System.out.println("||*********************************************************************************************************************||");
        String welcomeMessage = "Welcome to the Bucks Centre for the Performing Arts ticket purchasing system!";
        System.out.println(welcomeMessage);
        System.out.println("||*********************************************************************************************************************||");

        Customer customer = new Customer();
        customer.userLogin();
        System.out.println("||*********************************************************************************************************************||");
        customer.getProfileInfo();
        System.out.println("||*********************************************************************************************************************||");

        System.out.println("\n\nNow that you have successfully signed in " +
                "\n you can book a ticket for one of our amazing premieres.\n");

        new Show().selectShow();
        System.out.println("||*********************************************************************************************************************||");

        new Ticket().getTicketPrice();

        System.out.println("\nTHANKS FOR CHOOSING US, ENJOY YOUR FILM!");
    }

}