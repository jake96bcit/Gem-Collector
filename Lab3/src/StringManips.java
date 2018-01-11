import java.util.Scanner;

public class StringManips {
  public static void main (String[] args) {
    String phrase = new String ();
    System.out.println("Please enter your phrase: ");
    Scanner scan = new Scanner(System.in);
    phrase= scan.nextLine();
    
    int phraseLength;
    int middleIndex;
    
    String firstHalf;
    String secondHalf;  
    String switchedPhrase; 
    String middle3;
    
    phraseLength = phrase.length();
    middleIndex = phraseLength / 2;

    firstHalf = phrase.substring(0,middleIndex);
    secondHalf = phrase.substring(middleIndex, phraseLength);
    middle3= phrase.substring(middleIndex-1, middleIndex+2);

    switchedPhrase = secondHalf.concat(firstHalf);
    switchedPhrase = switchedPhrase.replace(' ', '*');
    
    System.out.println();
    System.out.println ("Original phrase: " + phrase);
    System.out.println ("Length of the phrase: " + phraseLength +
      " characters");
    System.out.println ("Index of the middle: " + middleIndex);
    System.out.println ("Character at the middle index: " + phrase.charAt (middleIndex));
    System.out.println ("The 3 charaters at hte middle index are: " + middle3);
    System.out.println ("Switched phrase: " + switchedPhrase);
    System.out.println();
    
    String city;
    String state;
    
    System.out.println("Please enter your state name: ");
    state= scan.nextLine();
    
    System.out.println("Please enter your city name: ");
    city= scan.nextLine();
    
    state= state.toUpperCase();
    city= city.toLowerCase();
    
    System.out.println("The result is: " + state + city + state);
  }
}  