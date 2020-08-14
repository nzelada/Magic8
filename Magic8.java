import java.util.Random;
public class Magic8{
int num;
public Magic8(int number){
  num = number;
}

public void magic() {
  switch(num){
  case 1:
  System.out.println("Great things are coming");
  break;
  case 2:
  System.out.println("Careful with tomorrow");
  break;
  case 3:
  System.out.println("Your lucky number is 10");
  break;
  case 4:
  System.out.println("Someone in the room is fearful of you");
  break;
  case 5:
  System.out.println("You shouldn't have done what you did today");
  break;
  case 6:
  System.out.println("Play the lotto");
  break;
  case 7:
  System.out.println("Money is coming");
  break;
  case 8:
  System.out.println("Be better");
  break;
  default:
  System.out.println("Sorry, nothing, try again");
  break;}

}

  public static void main(String args[]){
    Random rand = new Random(); 
   
		int randNum;
    randNum = rand.nextInt(9) + 0; // picks random numbers from 0 to 8
    Magic8 num = new Magic8(randNum);
    num.magic();
		
	
		
    
  }
}
