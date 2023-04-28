package exercises;
import java.util.*;

public class NumericTypes3 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter miles driven: ");
        Integer miles = sc.nextInt();

        System.out.println("Enter gallons of gas consumed: ");
        Integer gallons = sc.nextInt();

        System.out.println("MPG: " + miles / gallons);
    }
}
