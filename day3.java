public class Store {
    // declare instance fields here!
    String productType;
    //This creates a quality productType that all Stores will then have
    
    // constructor method
    public Store() {
      System.out.println("I am inside the constructor method.");
    }
    
    // main method
    public static void main(String[] args) {
      System.out.println("This code is inside the main method.");
      
      Store lemonadeStand = new Store();
      
      System.out.println(lemonadeStand);
    }
  }

  public class Store {
    // instance fields
    String productType;
    
    // constructor method
    public Store(String product) {
      productType = product;
    }
    
    // main method
    public static void main(String[] args) {
      
      
    }
  }
  //In the constructor method, I made a string variable product, and that will become the necessary productType value in each instance of Store.

  public class Store {
    // instance fields
    String productType;
    
    // constructor method
    public Store(String product) {
      productType = product;
    }
    
    // main method
    public static void main(String[] args) {
      Store lemonadeStand = new Store("lemonade");
      System.out.println(lemonadeStand.productType);
    }
  }
  //in the constructor we are building the ones we're using in this example a lemonade stand

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
      Store cookieShop = new Store("cookies", 12, 3.75);
    }
  }
  //demonstrating that we can have multiple types of instances. But, we need to do things in the right order

  public class Dog {
    String breed;
    boolean hasOwner;
    int age;
    
    public Dog(String dogBreed, boolean dogOwned, int dogYears) {
      System.out.println("Constructor invoked!");
      breed = dogBreed;
      hasOwner = dogOwned;
      age = dogYears;
    }
    
    public static void main(String[] args) {
      System.out.println("Main method started");
      Dog fido = new Dog("poodle", false, 4);
      Dog nunzio = new Dog("shiba inu", true, 12);
      boolean isFidoOlder = fido.age > nunzio.age;
      int totalDogYears = nunzio.age + fido.age;
      System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
      System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
      System.out.println("The total age of the dogs is: " + totalDogYears);
      System.out.println("Main method finished");
    }
  }