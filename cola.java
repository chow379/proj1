import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: 5");
        int num = reader.nextInt();

        if(num % 2 == 1)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
