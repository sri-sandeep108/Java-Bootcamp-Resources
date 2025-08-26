import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // See Learn the Part for the instructions.
        System.out.print(" Hey Timmy! Choose a number to count to: ");
        int input = scan.nextInt();
        System.out.println("Great! Here's how it's done");
        for (int i = 0; i<=input; i++)
        {
            System.out.print(i + " ");
        }
        scan.close();
    }
}
