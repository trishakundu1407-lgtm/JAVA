import java.util.Scanner;

public class Marks {
    static String grade(int marks){
        if (marks >= 91)
            return "AA";

        else if (marks >= 81)
            return "AB";

        else if (marks >= 71)
            return "BB";

        else if (marks >= 61)
            return "BC";

        else if (marks >= 51)
            return "CD";

        else if (marks >= 41)
            return "DD";

        else
            return "Fail";
    }
     public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = in.nextInt();

        System.out.println("Grade = " + grade(marks));
    }
}
