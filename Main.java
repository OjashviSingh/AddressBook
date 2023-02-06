import java.util.*;

class Person {
    String name;
    String phone;
    String email;

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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("1. Add Person");
            System.out.println("2. Show People");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter phone: ");
                String phone = scanner.nextLine();
                System.out.print("Enter email: ");
                String email = scanner.nextLine();
                addressBook.addPerson(new Person(name, phone, email));
            } else if (choice == 2) {
                addressBook.showPeople();
            } else if (choice == 3) {
                break;
            }
        }
    }
}
