import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);

        person.name = "Sam Billings";
        person.nationality = "England";
        person.dateOfBirth = "10/10/2010";
        person.passport = new String[] { "H", "A", "D", "P", "1", "2", "3", "4" };
        person.seatNumber = 1;

        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);
    }
}
