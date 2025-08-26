import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        String userNameInput = scan.nextLine();
        System.out.print("- Password: ");
        String userPasswordInput = scan.nextLine();

        while( !username.equals(userNameInput) && !password.equals(userPasswordInput)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            userNameInput = scan.nextLine();
            System.out.print("- Password: ");
            userPasswordInput = scan.nextLine(); }
        System.out.println("Sign in successful. Welcome!");
        scan.close();
        
    }
}
