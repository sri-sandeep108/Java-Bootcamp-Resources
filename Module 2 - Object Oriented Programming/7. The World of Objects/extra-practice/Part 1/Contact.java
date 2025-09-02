public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String brithDate, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = brithDate;
        this.age = age;
    }

    public Contact(Contact source) {
        this.name = source.getName();
        this.phoneNumber = source.getPhoneNumber();
        this.birthDate = source.getBirthDate();
        this.age = source.getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
