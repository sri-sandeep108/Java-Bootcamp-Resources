import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int length = scan.nextInt();
        scan.nextLine();
        String[][] database = new String[length][3];

        for (int i = 0; i < length; i++) {

            System.out.println("\n\tFigure " + (i + 1));

            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine();

            System.out.print("\t - Date of birth: ");
            database[i][1] = scan.nextLine();

            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine();

            System.out.print("\n");

        }

        System.out.println("These are the values you stored:");
        print2DArray(database);

        System.out.print("\nWho do you want information on? ");
        String choice = scan.nextLine();

        for (int i = 0; i < length; i++) {
            if (database[i][0].equals(choice)) {
                System.out.print("\n\t  Name: " + database[i][0]);
                System.out.print("\n\t  Date of birth: " + database[i][1]);
                System.out.print("\n\t  Occupation: " + database[i][2]);
            }
        }

        scan.close();
    }

    /**
     * Function name: print2DArray
     * 
     * @param array (String[][])
     * 
     *              Inside the function
     *              1. print the database
     *              • a tab of space precedes each row.
     *              • each value in database has one space from the other value.
     *              • print a new line.
     */
    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
