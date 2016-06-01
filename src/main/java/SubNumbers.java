import java.util.Scanner;
 
class SubNumbers
{
   public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Enter two integers to calculate their Diff");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
      z = x - y;
      System.out.println("Sub of entered integers = "+z);
   }
}