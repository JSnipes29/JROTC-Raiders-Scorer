public class Cadet
{
  String lastName;
  String firstName;
  int pushUps;
  int sitUps;
  int mile;
  boolean isMale;
  int score;
  public Cadet(String lastName, String firstName, int pushUps, int sitUps, int mile, boolean isMale, int score)
  {
    this.lastName = lastName;
    this.firstName = firstName;
    this.pushUps = pushUps;
    this.sitUps = sitUps;
    this.mile = mile;
    this.isMale = isMale;
    this.score = score;
    
  }
  public String toString()
  {
    return "Name: " + lastName + ", " + firstName + "\n" + "\tPushups: " + pushUps + "\n" + "\tSitups: " + sitUps + "\n" + "\tMile: " + mile + "\n" + "\tScore: " + score;
  
  }

}