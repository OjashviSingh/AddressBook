import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("Enter first name (or type 'exit' to stop adding contacts): ");
            String firstName = sc.nextLine();
            if (firstName.equals("exit")) {
                break;
            }
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
            sc.nextLine(); // clear buffer
            System.out.println("Enter phone number: ");
            long phoneNumber = sc.nextLong();
            sc.nextLine(); // clear buffer
            System.out.println("Enter email: ");
            String email = sc.nextLine();

            Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
            addressBook.addContact(contact);
        }

        System.out.println("Contacts in address book: ");
        for (Contact contact : addressBook.getContacts()) {
            System.out.println("Name: " + contact.getFirstName() + " " + contact.getLastName());
            System.out.println("Address: " + contact.getAddress());
            System.out.println("City: " + contact.getCity());
            System.out.println("State: " + contact.getState());
            System.out.println("Zip: " + contact.getZip());
            System.out.println("Phone Number: " + contact.getPhoneNumber());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("--------------");
        }
    }
}

class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}