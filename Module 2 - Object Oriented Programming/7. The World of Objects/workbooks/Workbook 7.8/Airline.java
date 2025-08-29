public class Airline {

    Person[] people; // array that stores Person objects...

    public Airline() {
        people = new Person[11];
    }

    public Person getPerson(int index) {
        Person copy = new Person(people[index]);
        return copy;
    }

    public void setPerson(Person source) {
        people[source.getSeatNumber() - 1] = new Person(source);
    }

}
