import java.util.Scanner;

public class Movie {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("===MOVIE MENU===");
    System.out.println("1. DEADPOOL        ₹250\n" + //
                "2. SUPERMAN        ₹220\n" + //
                "3. F1              ₹300\n" + //
                "4. JURASSIC WORLD  ₹280\n" + //
                "");

    System.out.println("Enter choice");
    int choice = in.nextInt();

    System.out.println("Number of tickets: ");
    int tickets = in.nextInt();

    int total = 0;

    switch (choice) {
        case 1:
            System.out.print("Your choice is DEADPOOL");
            total = tickets * 250;

            System.out.println("Tickets: " + tickets);
            System.out.println("Price per ticket: ₹250");
            System.out.println("Total Bill: ₹" + total);
        break;

        case 2:
            System.out.print("Your choice is SUPERMAN");
            total = tickets * 220;

            System.out.println("Tickets: " + tickets);
            System.out.println("Price per ticket: ₹220");
            System.out.println("Total Bill: ₹" + total);
        break;

        case 3:
            System.out.print("Your choice is F1");
            total = tickets * 300;

            System.out.println("Tickets: " + tickets);
            System.out.println("Price per ticket: ₹300");
            System.out.println("Total Bill: ₹" + total);
        break;

        case 4:
            System.out.print("Your choice is JURASSIC WORLD");
            total = tickets * 280;

            System.out.println("Tickets: " + tickets);
            System.out.println("Price per ticket: ₹280");
            System.out.println("Total Bill: ₹" + total);
        break;
    
        default:
            System.out.println("Enter valid choice");
            break;
    }
  }
    
}