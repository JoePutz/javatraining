public class Store {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;
    
    // constructor method
    public Store(String product, int count, double price) {
      productType = product;
      inventoryCount = count;
      inventoryPrice = price;
    }
    
    // main method
    public static void main(String[] args) {
      Store lemonadeStand = new Store("lemonade", 42, .99);
      Store cookieShop = new Store("cookies", 12, 3.75);
      
      System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
      
      System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
    }
  }

  public class Store {
  
    // new method: constructor!
    public Store() {
      System.out.println("I am inside the constructor method.");
    }
    
    // main method is where we create instances!
    public static void main(String[] args) {
      System.out.println("Start of the main method.");
      
      // create the instance below
      Store lemonadeStand = new Store();
      // print the instance below
      System.out.println(lemonadeStand);
    }
  }
  //this is interesting. It's how to create the constructors of a class. This is all w/in the class of it
  //I'm a little confused how this will work when outside of the class though. 