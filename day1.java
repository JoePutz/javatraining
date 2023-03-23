//in every class there is a main() method that lists program tasks
public class HelloWorld {
    public static void main(String[] args) {
        //This is the main() it also indicates it is public, static, and void. will learn more later
        System.out.println("Hello World!");

    }
}
public class HelloYou {
  public static void main(String[] args) {
    System.out.println("Hello Joe!");
    
  }
}
//println and print are differnet. println means it takes up a whole line
//print just runs it all together.
public class HideAndSeek {
  public static void main(String[] args) {
    System.out.println("Let's play hide and seek.");
    System.out.print("Three...");
    System.out.print("Two...");
    System.out.println("One...");
    System.out.println("Ready or not, here I come!");

  }
}
//in this example One will be on the same line as three two because println works on the line after it

public class Timeline {
    public static void main(String[] args) {
      System.out.println("Hello Java!");
      
      System.out.println("You were born in 1995");
  
      //Sun Microsystems announced the release of Java in 1995
      
      System.out.println("You were created by James Gosling");
      
          /*James Gosling is a Canadian engineer who 
          created Java while working at Sun Microsystems. 
          His favorite number is the square root of 2!*/
      
      System.out.println("You are a fun language!");
    }
  } 

  //terminal command to compile: javac FileName.java
  //If the file compiles successfully, this command produces an executable class: FileName.class. Executable means we can run this program from the terminal. 

  public class Review {
    public static void main(String[] args) {
      //The main method executes the tasks of the class
      System.out.println("My first Java program from scratch!");
    }
  }

  public class Creator {
	public static void main(String[] args) {
    String name = "James Gosling";
    int yearCreated = 1995;
    System.out.println(name);
    System.out.println(yearCreated);
	}
}
//for Java need to write what the variable is first, int (integer), boolean, String.
//double is weird, it's basically very big numbers, very small numbers, and decimals
//char is like worse strings? it holds any single character like letter or space, must be surrounded by single quotations ''
//Strings have some weird rules, like String being capitalized. Also must be double quotes ""
//Ways out of string usually using \\ w/in string or \n to change lines w/in string

public class GreaterThanEqualTo {
    public static void main(String[] args){
    double recommendedWaterIntake = 8;
    double daysInChallenge = 30;
    double yourWaterIntake = 235.5;
    double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
    boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
    System.out.println(isChallengeComplete);
  }       
}
public class Song {
    public static void main(String[] args){
    String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
    String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    System.out.println(line1.equals(line2));
    System.out.println(line2.equals(line3));
  }       
}
//Strings don't work with == for complicated reasons. So you gotta use .equals() instead

public class Final {
	public static void main(String[] args) { 
      final double pi = 3.14;
      System.out.println(pi);
      pi ++;
		
	}
}
//This gives an ERROR
//final variables means it cannot change. Get error if you ever try.

public class BankAccount {
    public static void main(String[] args){
    double balance = 1000.75;
    double amountToWithdraw = 250;
    double updatedBalance = balance - amountToWithdraw;
    double amountForEachFriend = updatedBalance / 3;
    boolean canPurchaseTicket = amountForEachFriend >= 250;
    System.out.println(canPurchaseTicket);
    System.out.println("I gave each friend " + amountForEachFriend + "...");
  }       
}