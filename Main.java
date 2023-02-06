import java.util.*;

class Person {
    private String name;
    private String phone;
    private String email;

    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }
}

class AddressBook {
    private ArrayList<Person> people;

    public AddressBook() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public ArrayList<Person> getPeople() {
        return this.people;
    }

    public void showPeople() {
        for (Person person : this.people) {
            System.out.println("Name: " + person.getName());
            System.out.println("Phone: " + person.getPhone());
            System.out.println("Email: " + person.getEmail());
            System.out.println("-----------------------------");
        }
    }
}

class AddressBookSystem {
    private Map<String, AddressBook> addressBooks;

    public AddressBookSystem() {
        this.addressBooks = new HashMap<>();
    }

    public void addAddressBook(String name) {
        this.addressBooks.put(name, new AddressBook());
    }

    public Map<String, AddressBook> getAddressBooks() {
        return this.addressBooks;
    }

    public void showAddressBooks() {
        System.out.println("Address Books:");
        for (String name : this.addressBooks.keySet()) {
            System.out.println("- " + name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBookSystem system = new AddressBookSystem();

        while (true) {
            System.out.println("1. Add Address Book");
            System.out.println("2. Show Address Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter Address Book name: ");
                String name = scanner.nextLine();
                system.addAddressBook(name);
            } else if (choice == 2) {
                system.showAddressBooks();
            } else if (choice == 3) {
                break;
            }
        }
    }
}
