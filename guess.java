import cs1.Keyboard;

public class guess
{
   public int number;
   public guess()
   {
      number=(int)(Math.random()*10);
   }
   
   public static void main(String[] args)
   {
      guess g = new guess();
      boolean incorrect=true;
      System.out.println("Please enter a number between 1 and 10 to guess: ");
      while (incorrect)
      {
         int user = Keyboard.readInt();
         if (user==g.number)
            incorrect=false;
         else
            System.out.println("Incorrect, please guess again");
      }
      System.out.println("Congrats; "+g.number+" was correct.");
   }
}