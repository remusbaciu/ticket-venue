package actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ticket {

    public Scanner cin = new Scanner(System.in);

    public String ticketName;
    public double ticketPrice;

    public Ticket(){}
    public Ticket(String ticketName, double ticketPrice){
        this.ticketName = ticketName;
        this.ticketPrice = ticketPrice;
    }

    public void getTicketPrice() {
        Ticket chosenTicket;
        System.out.println("The following tickets are available for you to purchase: \n");
        for (int i = 0; i < getAvailableTickets().size(); i++){
            int ticketNumber = i+1;
            Ticket ticket = getAvailableTickets().get(i);
            System.out.println("\n["+ticketNumber+"] - " + "TYPE: " + ticket.ticketName + " - PRICE: £"+ticket.ticketPrice);
        }

        System.out.println("PLEASE MAKE A TICKET SELECTION!");
        int selectedOption = cin.nextInt();
        chosenTicket = getAvailableTickets().get(selectedOption-1);

        System.out.println("\n How many " + chosenTicket.ticketName +" tickets would you like ? ");
        int quantity = cin.nextInt();

        System.out.println("\nYOUR TICKET SELECTION IS NOW COMPLETE.");
        System.out.println("You have chosen the following:");
        System.out.println(quantity + " times " + chosenTicket.ticketName + " at a price of £" + chosenTicket.ticketPrice);
        System.out.println("TOTAL COST: " + quantity*chosenTicket.ticketPrice);
    }

    public List<Ticket> getAvailableTickets(){
        List<Ticket> availableTickets = new ArrayList<>();
        availableTickets.add(new Ticket("Adult", 15.00));
        availableTickets.add(new Ticket("Child", 8.00));
        availableTickets.add(new Ticket("Student", 12.00));
        return availableTickets;
    }
}