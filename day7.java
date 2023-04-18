//Arrays in java. 
//The writing of them is different and a little weird.
//double[] name = {12.15, 15.2, 1.0, 11.54}
//String[] name2 = {"Word", "OtherWord"}

public class Newsfeed {
  
  
    public Newsfeed(){
      
    }
    // Create getTopics() below:
    public String[] getTopics() {
      String[] topics = {"Opinion", "Tech", "Science", "Health"};
      return topics;
    }
  
    public static void main(String[] args){
      Newsfeed sampleFeed = new Newsfeed();
  
      String[] topics = sampleFeed.getTopics();
      System.out.println(topics);
  
    }
  }


import java.util.Arrays;

public class Newsfeed {
  
  
  public Newsfeed(){
    
  }
    
  public String[] getTopics(){
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    return topics;
  }
  

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    String[] topics = sampleFeed.getTopics();
    System.out.println(topics);
    String betterPrintout = Arrays.toString(topics);
    System.out.println(betterPrintout);
  }
}
//The above shows 2 things. 1) How to add different array methods and functioanlity
//import java.util.Arrays;
//This gives you the capability to work with the arrays in ways that base java doesn't have
//one such example is Arrays.toString(). Why important? if you just print out the array w/o it
//you just get the information about the array, like it's size and technical nonsense, not what is actually in the string
//but Arrays.toString(topics) will actually print out the topics.

import java.util.Arrays;

public class Newsfeed {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  
  public Newsfeed(){

  }
    
  public String[] getTopics(){
    return topics;
  }
  
  public String getTopTopic(){
    return topics[0];
  }
  
  public void viewTopic(int topicIndex){
    views[topicIndex] = views[topicIndex] +1;
  }

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    System.out.println("The top topic is "+ sampleFeed.getTopTopic());
    
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(3);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(1);
    
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!"); 
  }
}


import java.util.Arrays;

public class Newsfeed {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  String[] favoriteArticles;
  
  public Newsfeed(){
    // Initialize favoriteArticles here:
    favoriteArticles = new String[10];
  }
  
  public void setFavoriteArticle(int favoriteIndex, String newArticle){
    // Add newArticle to favoriteArticles:
    favoriteArticles[favoriteIndex] = newArticle;
    
  }
    
  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
    sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
    sampleFeed.setFavoriteArticle(0, "Oil News");
    
    System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
  }
}
//This shows 2 things, 1) how to initiate an empty Array
//favoriteArticles = new String[10] == an empty string array of 10 places
//nopte favoriteArticles was created earlier, it was just completely empty
//also demonstration how to change the value of a specific index of an array

public int getNumTopics(){
    return topics.length;
  }

//you know what this is


public class HelloYou {
    public static void main(String[] args) {
      System.out.println("Hello " + args[0]);  
    }
  }
//What "args" means is arguments. So the above takes a string array argument
//in this case it's just a name. 
//if we put in the string[] args Joe
//it woudl say Hello Joe

import java.util.Arrays;

public class Classroom {
  
  public static void main(String[] args){
    String[] students = {"Sade", "Alexus", "Sam", "Koma"};
    double[] mathScores = new double[4];
    mathScores[0] = 94.5;
    mathScores[2] = 76.8;

    System.out.println("The number of students in the class is " + students.length + ".");
  }
}
//the review and practice
