//If/then statements and conditionals

public class Order {
  
    public static void main(String[] args) {
      
      double itemCost = 30.99;
      
      // Write an if-then statement:
      if (itemCost > 24.00) {
        System.out.println("High value item!");
      }
    }
}

public class Order {
  
    public static void main(String[] args) {
      
      boolean isFilled = false;
      
      // Write an if-then-else statement:
      if (isFilled == true) {
        System.out.println("Shipping");
      } else {
        System.out.println("Order not ready");
      }
    }
}

public class Order {
    boolean isFilled;
    double billAmount;
    String shipping;
    
    public Order(boolean filled, double cost, String shippingMethod) {
          if (cost > 24.00) {
        System.out.println("High value item!");
      }
      isFilled = filled;
      billAmount = cost;
      shipping = shippingMethod;
    }
    
    public void ship() {
      if (isFilled) {
        System.out.println("Shipping");
        System.out.println("Shipping cost: " + calculateShipping());
      } else {
        System.out.println("Order not ready");
      }
    }
    
    public double calculateShipping() {
           // declare conditional statement here
      if (shipping.equals("Regular")) {
        return 0;
      } else if (shipping.equals("Express")) {
        return 1.75;
      } else {
        return .50;
      }
       }
    
    public static void main(String[] args) {
      // do not alter the main method!
      Order book = new Order(true, 9.99, "Express");
      Order chemistrySet = new Order(false, 72.50, "Regular");
      
      book.ship();
      chemistrySet.ship();
    }
}
//public double calculateShipping() method is the important bit
//shows the pattern of the if/then/else statements
//remember for strings use equals.("whatevere the string is") not == 

public class Order {
    boolean isFilled;
    double billAmount;
    String shipping;
    String couponCode;
    
    public Order(boolean filled, double cost, String shippingMethod, String coupon) {
          if (cost > 24.00) {
        System.out.println("High value item!");
      }
      isFilled = filled;
      billAmount = cost;
      shipping = shippingMethod;
      couponCode = coupon;
    }
    
    public void ship() {
      if (isFilled) {
        System.out.println("Shipping");
        System.out.println("Shipping cost: " + calculateShipping());
      } else {
        System.out.println("Order not ready");
      }
    }
    
    public double calculateShipping() {
      if (shipping.equals("Regular")) {
        return 0;
      } else if (shipping.equals("Express")) {
        // Add your code here
        if (couponCode.equals("ship50")) {
          return .85;
        } else {
          return 1.75;
        }
        
      } else {
        return .50;
      }
       }
    
    public static void main(String[] args) {
      // do not alter the main method!
      Order book = new Order(true, 9.99, "Express", "ship50");
      Order chemistrySet = new Order(false, 72.50, "Regular", "freeShipping");
      
      book.ship();
      chemistrySet.ship();
    }
  }
//This code shows that you cna make nested if/then statements. So if shipping = "Express" and if couponCode = "ship50" then something happens

public class Order {
    boolean isFilled;
    double billAmount;
    String shipping;
    
    public Order(boolean filled, double cost, String shippingMethod) {
          if (cost > 24.00) {
        System.out.println("High value item!");
      }
      isFilled = filled;
      billAmount = cost;
      shipping = shippingMethod;
    }
    
    public void ship() {
      if (isFilled) {
        System.out.println("Shipping");
        System.out.println("Shipping cost: " + calculateShipping());
      } else {
        System.out.println("Order not ready");
      }
    }
    
    public double calculateShipping() {
      double shippingCost;
           // declare switch statement here
      switch(shipping) {
        case "Regular":
        shippingCost = 0;
        break;
        case "Express":
        shippingCost = 1.75;
        break;
        default:
        shippingCost = .50;
        break;
      }
      
      return shippingCost;
       }
    
    public static void main(String[] args) {
      // do not alter the main method!
      Order book = new Order(true, 9.99, "Express");
      Order chemistrySet = new Order(false, 72.50, "Regular");
      
      book.ship();
      chemistrySet.ship();
    }
}
//This is interesting a new means of determining chaining if-then statements
//called "switch statement"
//switch(variable) {
    //case "potential for variable 1":
    //do stuff
    //break;
    //if you don't break the programs runs the stuff below it.
//}

public class Order {
    boolean isFilled;
    double billAmount;
    String shipping;
    
    public Order(boolean filled, double cost, String shippingMethod) {
          if (cost > 24.00) {
        System.out.println("High value item!");
      } else {
        System.out.println("Low value item!");
      }
      isFilled = filled;
      billAmount = cost;
      shipping = shippingMethod;
    }
    
    public void ship() {
      if (isFilled) {
        System.out.println("Shipping");
      } else {
        System.out.println("Order not ready");
      }
      
      double shippingCost = calculateShipping();
      
      System.out.println("Shipping cost: ");
      System.out.println(shippingCost);
    }
    
    public double calculateShipping() {
      double shippingCost;
      switch (shipping) {
        case "Regular":
          shippingCost = 0;
          break;
        case "Express":    
          shippingCost = 1.75;
          break;
        default:
          shippingCost = .50; 
      }
      return shippingCost;
       }
    
    public static void main(String[] args) {
      // create instances and call methods here!
      Order book = new Order(true, 9.99, "Express");
      Order chemistrySet = new Order(false, 72.50, "Express");
      
      // book.ship();
      chemistrySet.ship();
    }
}
//Review and example, can fiddle with the main to create new Orders and mess with the instances.