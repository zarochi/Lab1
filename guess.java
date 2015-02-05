import cs1.Keyboard;

public class guess
{
   public int number;
   public guess()
   {
      number=(int)(Math.random()*100);
   }
   
   public static void main(String[] args)
   {
      guess g = new guess();
      System.out.println("Please enter a number between 1 and 100 to guess: ");
      int user = Keyboard.readInt();
      if (user==g.number)
         System.out.println("Correct");
      else
         System.out.println("Incorrect; the answer is: "+g.number);
   }
}