package exercises;
import java.util.*;
public class NumericTypes {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        Integer length = sc.nextInt();

        System.out.println("Enter the width of the rectangle: ");
        Integer width = sc.nextInt();

        System.out.println("The area of the rectangle is: " + length * width);

    }

}
