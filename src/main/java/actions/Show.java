package actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Show {

    private String name;
    private String time;
    private String date;

    public Scanner cin = new Scanner(System.in);

    public Show(){}

    public Show(String name, String time, String date){
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public void selectShow(){
        System.out.println("Here are the existing shows that you can choose to watch\n");
        int i = 0;
        for (Show show : existingShows()){
            i++;
            System.out.println("[" + i + "] - " + show.name + " - " + show.date + " - " + show.time);
        }
        int selectedOption;
        System.out.println("\n My selection is: ");

        selectedOption = Integer.parseInt(cin.next());

        this.name = existingShows().get(selectedOption-1).name;
        this.date = existingShows().get(selectedOption-1).date;
        this.time = existingShows().get(selectedOption-1).time;

        System.out.println(this.toString());
    }

    public List<Show> existingShows(){
        List<Show> availableShows = new ArrayList<>();
        availableShows.add(new Show("Watch Mike Ride His BMW Bike", "12/04/2019", "20:00"));
        availableShows.add(new Show("Watch Remus get 100% on OO Module", "12/04/2019", "20:00"));
        return availableShows;
    }

    @Override
    public String toString() {
        return "\n You have selected the following show - " + name + " - " + date + " - " + time;
    }
}
