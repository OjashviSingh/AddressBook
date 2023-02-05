import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    Contact person = new Contact();
    public List<Contact> people = new ArrayList<Contact>();
    Scanner sc = new Scanner(System.in);

    public void addContact() {

        System.out.println("First Name :");
        person.firstName = sc.nextLine();

        System.out.println("Last Name :");
        person.lastName = sc.nextLine();

        System.out.println("Address :");
        person.address = sc.nextLine();

        System.out.println("City :");
        person.city = sc.nextLine();

        System.out.println("State :");
        person.state = sc.nextLine();

        System.out.println("Zip :");
        person.zip = sc.nextLine();

        System.out.println("Phone Number :");
        person.phoneNumber = sc.nextLine();

        System.out.println("Email :");
        person.email = sc.nextLine();

        people.add(person);
    }

    public void editContact()
    {

        System.out.println("Enter the person whose contact to be edited :");
        System.out.println("Enter First Name:");
        String fname = sc.nextLine();
        System.out.println("Enter Last Name:");
        String lname = sc.nextLine();

        int flag = 0;
        for (int j = 0; j < people.size(); j++)
        {
            Contact person = people.get(j);
            if (person.firstName.equals(fname) && person.lastName.equals(lname))
            {
                flag = 1;
                System.out.println("First Name : " + person.firstName);
                System.out.println("Last Name  : " + person.lastName);
                System.out.println("Address    : " + person.address);
                System.out.println("City       : " + person.city);
                System.out.println("State      : " + person.state);
                System.out.println("Zip        : " + person.zip);
                System.out.println("Phone Number:" + person.phoneNumber);
                System.out.println("Email      : " + person.email);
                System.out.println("---------------------------------------");
                System.out.println("Enter the number which you want to edit\n1.First Name\n2.Last Name\n3.Address\n4.C\n5.State\n6.Zip\n7.Phone Number\n8.Email");
                int choose = sc.nextInt();
                switch (choose)
                {
                    case 1:
                        System.out.println("first name:");
                        Scanner sc = new Scanner(System.in);
                        person.firstName =  sc.nextLine();
                        System.out.println("edited succesfully");
                        break;
                    case 2:
                        System.out.println("last name:");
                        Scanner scanner = new Scanner(System.in);
                        person.lastName = scanner.nextLine();
                        System.out.println("edited succesfully");
                        break;
                    case 3:
                        System.out.println("address:");
                        Scanner s = new Scanner(System.in);
                        person.address = s.nextLine();
                        System.out.println("edited succesfully");
                        break;

                    case 4:
                        System.out.println("city:");
                        Scanner scan = new Scanner(System.in);
                        person.city = scan.nextLine();
                        System.out.println("edited succesfully");
                        break;
                    case 5:
                        System.out.println("state:");
                        Scanner userInput = new Scanner(System.in);
                        person.state = userInput.nextLine();
                        System.out.println("edited succesfully");
                        break;
                    case 6:
                        System.out.println("zip:");
                        Scanner user = new Scanner(System.in);
                        person.zip = user.nextLine();
                        System.out.println("edited succesfully");
                        break;
                    case 7:
                        System.out.println("phone_number:");
                        Scanner input = new Scanner(System.in);
                        person.phoneNumber = input.nextLine();
                        System.out.println("edited succesfully");
                        break;
                    case 8:
                        System.out.println("email:");
                        Scanner in = new Scanner(System.in);
                        person.email = in.nextLine();
                        System.out.println("edited succesfully");
                        break;
                }
            }
        }
        if (flag == 0)
            System.out.println("Contact not found!!!");
    }

    public void deleteContact() {

        System.out.println("Enter the person whose contact to be deleted :");
        System.out.println("Enter First Name:");
        String fname = sc.nextLine();
        System.out.println("Enter Last Name:");
        String lname = sc.nextLine();

        for (int j = 0; j < people.size(); j++)
        {
            Contact person = people.get(j);
            if (person.firstName.equals(fname) && person.lastName.equals(lname))
            {
                people.remove(person);
                System.out.println("person removed sucessfully");
            }
            else {
                System.out.println("contact not matched");
            }
        }

    }

    public void checkDuplicateContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String 	fname= sc.nextLine();
        System.out.println("Enter Last Name");
        String 	lname= sc.nextLine();
        for (int j = 0; j < people.size(); j++)
        {
            Contact temp = people.get(j);
            if (temp.firstName.equals(fname) && temp.lastName.equals(lname))
            {
                System.out.println("Contact already exists!!Please enter a different contact name");

            }
        }

    }


    public void searchByCityOrState() {
        System.out.println("please enter state or city :");
        String selection = sc.nextLine();
        for (int j = 0; j < people.size(); j++)
        {
            Contact person = people.get(j);
            if (person.city.equals(selection) || person.state.equals(selection))
            {
                System.out.println("person details are");
                System.out.println("First Name : " + person.firstName);
                System.out.println("Last Name  : " + person.lastName);
                System.out.println("Address    : " + person.address);
                System.out.println("City       : " + person.city);
                System.out.println("State      : " + person.state);
                System.out.println("Zip        : " + person.zip);
                System.out.println("Phone Number:" + person.phoneNumber);
                System.out.println("Email      : " + person.email);
            }
            else {
                System.out.println("No contact Found");
            }

        }

    }

    public void NoOfContactPersons() {
        System.out.println("please enter state or city :");
        String selection = sc.nextLine();
        int count = 0;
        for (int j = 0; j < people.size(); j++)
        {
            Contact person = people.get(j);
            if (person.city.equals(selection) || person.state.equals(selection))
            {
                count++;
            }
            else {
                System.out.println("No contact Found");
            }

        }
        System.out.println("List of persons in a AdressBook are :" + count);
    }
}