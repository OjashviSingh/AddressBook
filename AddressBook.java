import java.util.Scanner;

public class AddressBook {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;
    private String email;

    public AddressBook(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter last name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        System.out.println("Enter city: ");
        String city = sc.nextLine();
        System.out.println("Enter state: ");
        String state = sc.nextLine();
        System.out.println("Enter zip: ");
        int zip = sc.nextInt();
        System.out.println("Enter phone number: ");
        long phoneNumber = sc.nextLong();
        sc.nextLine(); // clear buffer
        System.out.println("Enter email: ");
        String email = sc.nextLine();

        AddressBook contact = new AddressBook(firstName, lastName, address, city, state, zip, phoneNumber, email);
        System.out.println("Contact information: ");
        System.out.println("Name: " + contact.getFirstName() + " " + contact.getLastName());
        System.out.println("Address: " + contact.getAddress());
        System.out.println("City: " + contact.getCity());
        System.out.println("State: " + contact.getState());
        System.out.println("Zip: " + contact.getZip());
        System.out.println("Phone Number: " + contact.getPhoneNumber());
        System.out.println("Email: " + contact.getEmail());
    }
}
