import java.util.Scanner;
public class SuperTask {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a starting distance: ");
    String Sdistance = in.nextLine();
    Double distance = Double.parseDouble(Sdistance);
    while(distance != 0) {
      System.out.println(distance);
      distance = distance / 2;
    }
  }
}

/**  Kill terminal with " CTRL + C "
 *   The only exeption for SuperTasks
 *   are if you start at 0 units
 *   The terminal usually ends around "4.9E-324,"
 *   This doesn't necessarily mean that
 *   super tasks end
 *   The terminal is just mean :(
 */
