public class Store {
    // instance fields
    String productType;
    
    // constructor method
    public Store(String product) {
      productType = product;
    }
    
    // advertise method
    public void advertise() {
      System.out.println("Come spend some money!");
      System.out.println("Selling " + productType + "!");
    }
    
    // main method
    public static void main(String[] args) {
      
    }
  }
  //public void is The first line, public void checkBalance(), is the method declaration. It gives the program some information about the method:

    // public means that other classes can access this method. We will learn more about that later in the course.
    // The void keyword means that there is no specific output from the method. We will see methods that are not void later in this lesson, but for now, all of our methods will be void.
    // checkBalance() is the name of the method.

    public class Store {
        // instance fields
        String productType;
        
        // constructor method
        public Store(String product) {
          productType = product;
        }
        
        // advertise method
        public void advertise() {
              System.out.println("Selling " + productType + "!");
          System.out.println("Come spend some money!");
        }
        
        // main method
        public static void main(String[] args) {
          Store lemonadeStand = new Store("Lemonade");
          lemonadeStand.advertise();
          lemonadeStand.advertise();
          lemonadeStand.advertise();
        }
      }
//In the main section we now could call the lemonadeStand method.
// This will read out "Selling lemonade!" \n"Come spend some money!"

public class Store {
    // instance fields
    String productType;
    
    // constructor method
    public Store(String product) {
      productType = product;
    }
    
    // advertise method
    public void advertise() {
      String message = "Selling " + productType + "!";
          System.out.println(message);
    }
    
    // main method
    public static void main(String[] args) {
      String cookie = "Cookies";
      Store cookieShop = new Store(cookie);
      // String message = "Selling Cookies!";
      cookieShop.advertise();
    }
  }

  //The above was used to teach "scope" the scope is the domain of the method. We can't access information that is declared outside the scope of the method.
  //So that String message = "Selling Cookies!" part wouldn't actually print that, because the System.out.println
  //section is in the Advertise section. And advertise() doesn't take any inputs from the main in the first place.

  public class Store {
    // instance fields
    String productType;
    
    // constructor method
    public Store(String product) {
      productType = product;
    }
    
    // advertise method
    public void advertise() {
      String message = "Selling " + productType + "!";
          System.out.println(message);
    }
  
    // greeting method
    public void greetCustomer(String customer) {
      System.out.println("Welcome to the store, " + customer + "!");
    }
    
    // main method
    public static void main(String[] args) {
      Store lemonadeStand = new Store("Lemonade");
      lemonadeStand.greetCustomer("Dipshit");
    }
  }
//unlike advertise() this new greetCustomer() does take a parameter string to get the greeting right

public class Store {
    // instance fields
    String productType;
    double price;
    
    // constructor method
    public Store(String product, double initialPrice) {
      productType = product;
      price = initialPrice;
    }
    
    // increase price method
    public void increasePrice(double priceToAdd){
      double newPrice = price + priceToAdd;
      price = newPrice;
    }
    
    // main method
    public static void main(String[] args) {
      Store lemonadeStand = new Store("Lemonade", 3.75);
      lemonadeStand.increasePrice(1.5);
      System.out.println(lemonadeStand.price);
    }
}

public class Store {
    // instance fields
    String productType;
    double price;
    
    // constructor method
    public Store(String product, double initialPrice) {
      productType = product;
      price = initialPrice;
    }
    
    // increase price method
    public void increasePrice(double priceToAdd){
      double newPrice = price + priceToAdd;
      price = newPrice;
    }
    
    // get price with tax method
    public double getPriceWithTax(){
      double totalPrice = price + price * 0.08;
      return totalPrice;
    }
    // main method
    public static void main(String[] args) {
      Store lemonadeStand = new Store("Lemonade", 3.75);
      double lemonadePrice = lemonadeStand.getPriceWithTax();
      System.out.println(lemonadePrice);
    }
}
//Interesting note, a method that indicates it will return a double is public double whateverName()
//This pattern is consistant. What if it returns an integer? public int whateverName();

public class Store {
    // instance fields
    String productType;
    double price;
    
    // constructor method
    public Store(String product, double initialPrice) {
      productType = product;
      price = initialPrice;
    }
    
    // increase price method
    public void increasePrice(double priceToAdd){
      double newPrice = price + priceToAdd;
      price = newPrice;
    }
    
    // get price with tax method
    public double getPriceWithTax(){
      double tax = 0.08;
      double totalPrice = price + price*tax;
      return totalPrice;
    }
  
    public String toString() {
      return "This store sells " + productType + " at a price of " + price + ".";
    }
  
    // main method
    public static void main(String[] args) {
      Store lemonadeStand = new Store("Lemonade", 3.75);
      Store cookieShop = new Store("Cookies", 5);
  
      System.out.println(lemonadeStand);
      System.out.println(cookieShop);
  
    }
}
//If you don't do something like the toSTring() method, if you try to print out the class, you will get it's position in the code, which is kinda useless

public class SavingsAccount {
  
    int balance;
    
    public SavingsAccount(int initialBalance){
      balance = initialBalance;
    }
  
    public void checkBalance() {
      System.out.println("Hello!");
      System.out.println("Your balance is " + balance);
    }
  
    public void deposit(int amountToDeposit) {
      balance = balance + amountToDeposit;
      System.out.println("You just deposited " + amountToDeposit);
    }
  
    public int withdraw(int amountToWithdraw) {
      balance = balance - amountToWithdraw;
      System.out.println("You just withdrew " + amountToWithdraw);
      return amountToWithdraw;
    }
    
    public static void main(String[] args){
      SavingsAccount savings = new SavingsAccount(2000);
      
      //Check balance:
      // System.out.println("Hello!");
      // System.out.println("Your balance is "+savings.balance);
      savings.checkBalance();
      //Withdrawing:
      // int afterWithdraw = savings.balance - 300;
      // savings.balance = afterWithdraw;
      // System.out.println("You just withdrew "+300);
      savings.withdraw(300);
      
      //Check balance:
      // System.out.println("Hello!");
      // System.out.println("Your balance is "+savings.balance);
      savings.checkBalance();
  
      //Deposit:
      // int afterDeposit = savings.balance + 600;
      // savings.balance = afterDeposit;
      // System.out.println("You just deposited "+600);
      savings.deposit(600);
  
      //Check balance:
      // System.out.println("Hello!");
      // System.out.println("Your balance is "+savings.balance);
      savings.checkBalance();
      
      //Deposit:
      // int afterDeposit2 = savings.balance + 600;
      // savings.balance = afterDeposit2;
      // System.out.println("You just deposited "+600);
      savings.deposit(600);
      
      //Check balance:
      // System.out.println("Hello!");
      // System.out.println("Your balance is "+savings.balance);
      savings.checkBalance();
      
    }       
}
//Final test of the section
