//if-then statements and conditionals.

public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    public Reservation(int count, int capacity, boolean open) {
      guestCount = count;
          restaurantCapacity = capacity;
          isRestaurantOpen = open;
    }  
    
    public void confirmReservation() {
      /* 
         Write conditional
         ~~~~~~~~~~~~~~~~~
         if restaurantCapacity is greater
         or equal to guestCount
         AND
         the restaurant is open:
           print "Reservation confirmed"
           set isConfirmed to true
         else:
           print "Reservation denied"
           set isConfirmed to false
      */
      if (restaurantCapacity >= guestCount && isRestaurantOpen == true) {
        System.out.println("Reservation confirmed");
        isConfirmed = true;
      } else {
        System.out.println("Reservation denied");
        isConfirmed = false;
      }
    }
    
    public void informUser() {
      System.out.println("Please enjoy your meal!");
    }
    
    public static void main(String[] args) {
      Reservation partyOfThree = new Reservation(3, 12, true);
      Reservation partyOfFour = new Reservation(4, 3, true);
      partyOfThree.confirmReservation();
      partyOfThree.informUser();
      partyOfFour.confirmReservation();
      partyOfFour.informUser();
    }
  }

  public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    public Reservation(int count, int capacity, boolean open) {
      // Write conditional statement below
      if (guestCount > 8 || guestCount <= 0) {
        System.out.println("Invalid reservation!");
      }
      
      guestCount = count;
          restaurantCapacity = capacity;
          isRestaurantOpen = open;
    }  
    
    public void confirmReservation() {
      if (restaurantCapacity >= guestCount && isRestaurantOpen) {
        System.out.println("Reservation confirmed");
        isConfirmed = true;
      } else {
        System.out.println("Reservation denied");
              isConfirmed = false;
      }
    }
    
    public void informUser() {
      System.out.println("Please enjoy your meal!");
    }
    
    public static void main(String[] args) {
      Reservation partyOfThree = new Reservation(3, 12, true);
      Reservation partyOfFour = new Reservation(4, 3, true);
      partyOfThree.confirmReservation();
      partyOfThree.informUser();
      partyOfFour.confirmReservation();
      partyOfFour.informUser();
    }
}


public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    public Reservation(int count, int capacity, boolean open) {
      if (count < 1 || count > 8) {
        System.out.println("Invalid reservation!");
      }
      guestCount = count;
          restaurantCapacity = capacity;
          isRestaurantOpen = open;
    }  
    
    public void confirmReservation() {
      if (restaurantCapacity >= guestCount && isRestaurantOpen) {
        System.out.println("Reservation confirmed");
        isConfirmed = true;
      } else {
        System.out.println("Reservation denied");
              isConfirmed = false;
      }
    }
    
    public void informUser() {
      // Write conditional here
      if (!isConfirmed) {
        System.out.println("Unable to confirm reservation, please contact restaurant.");
      } else {
        System.out.println("Please enjoy your meal!");
      }
    }
    
    public static void main(String[] args) {
      Reservation partyOfThree = new Reservation(3, 12, true);
      Reservation partyOfFour = new Reservation(4, 3, true);
      partyOfThree.confirmReservation();
      partyOfThree.informUser();
      partyOfFour.confirmReservation();
      partyOfFour.informUser();
    }
}

public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    public Reservation(int count, int capacity, boolean open) {
      if (count < 1 || count > 8) {
        System.out.println("Invalid reservation!");
      }
      guestCount = count;
          restaurantCapacity = capacity;
          isRestaurantOpen = open;
    }  
    
    public void confirmReservation() {
      if (restaurantCapacity >= guestCount && isRestaurantOpen) {
        System.out.println("Reservation confirmed");
        isConfirmed = true;
      } else {
        System.out.println("Reservation denied");
              isConfirmed = false;
      }
    }
    
    public void informUser() {
      if (!isConfirmed) {
        System.out.println("Unable to confirm reservation, please contact restaurant.");
      } else {
        System.out.println("Please enjoy your meal!");
      }
    }
    
    public static void main(String[] args) {
      // Create instances here
     Reservation resOne = new Reservation (1, 1, true);
     resOne.confirmReservation();
     resOne.informUser();
     Reservation resZero = new Reservation (0, 10, true);
     resZero.confirmReservation();
     Reservation resTwo = new Reservation (2, 1, true);
     resTwo.confirmReservation();
     resTwo.informUser();
    }
  }

  //This is pretty simple, it's just different combinations of if-then conditionals. 
  //Here's what we've learned:  
  //! for not
  // && for and
  // || for or