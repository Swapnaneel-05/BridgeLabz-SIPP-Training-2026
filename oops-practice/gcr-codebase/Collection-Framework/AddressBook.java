import java.util.*;

class Contact {
    String name, phone, email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();
    HashMap<String, Contact> map = new HashMap<>();
    HashSet<String> phoneSet = new HashSet<>();

    public void addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed!");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);
    }

    public void search(String name) {
        if (map.containsKey(name)) {
            Contact c = map.get(name);
            System.out.println(c.name + " " + c.phone + " " + c.email);
        } else {
            System.out.println("Contact not found");
        }
    }

    public void delete(String name) {
        if (map.containsKey(name)) {
            Contact c = map.get(name);
            contacts.remove(c);
            phoneSet.remove(c.phone);
            map.remove(name);
            System.out.println("Contact Deleted");
        } else {
            System.out.println("Contact not found");
        }
    }

    public void display() {
        Collections.sort(contacts, (a, b) -> a.name.compareToIgnoreCase(b.name));

        System.out.println("\nContacts:");
        for (Contact c : contacts) {
            System.out.println(c.name + " " + c.phone + " " + c.email);
        }
    }

    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        book.addContact("Mayank", "9876543210", "mayank@gmail.com");
        book.addContact("Rahul", "9876500000", "rahul@gmail.com");
        book.addContact("Aman", "9999999999", "aman@gmail.com");

        book.search("Rahul");

        book.delete("Aman");

        book.display();
    }
}