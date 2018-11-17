import java.util.Scanner;
import java.util.ArrayList;
public class Program
{
  public static void main(String[] args)
  {
  Scanner input = new Scanner(System.in);
  Scanner scan = new Scanner(System.in);
  ArrayList<Cadet> cadets = new ArrayList<Cadet>();
  System.out.println("Welcome to the Raider Team Scorer");
  System.out.println();
  String choice = "0";
  while(!choice.equals("stop") && !choice.equals("-1"))
  {
    
    System.out.println("Enter cadet's last name:");
    String lastName = input.nextLine();
    System.out.println("Enter cadet's first name:");
    String firstName = input.nextLine();
    System.out.println("Is the cadet male or female?");
    String gender = input.nextLine();
    boolean male;
    if(gender.equals("male"))
    {
      male = true;
    }
    else
    {
      male = false;
    }
    System.out.println("Enter pushup count:");
    int pushups = scan.nextInt();
    System.out.println("Enter situp count:");
    int situps = scan.nextInt();
    System.out.println("Enter mile time:");
    int mile = scan.nextInt();
    
    System.out.println("Type -1 to stop, anything else will allow you to continue adding cadets.");
     choice = input.nextLine();
    
   
    cadets.add(new Cadet(lastName, firstName, pushups, situps, mile, male, Raiders.score(pushups, situps, mile, male) ));
    
    
  }
    for(Cadet cadet: cadets)
    {
      System.out.println(cadet);
    }
  }
  
}