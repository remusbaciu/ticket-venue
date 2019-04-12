package actions.roles;

import actions.User;

public class Agent extends User {
    public void applyPromotion(){
        System.out.println("PROMOTION HAS BEEN APPLIED");
    }
    public void removePromotion(){
        System.out.println("PROMOTION HAS BEEN REMOVED");
    }
}
