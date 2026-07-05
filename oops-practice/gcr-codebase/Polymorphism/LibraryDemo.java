class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void displayDetails() {
        System.out.println("Name : " + memberName);
        System.out.println("ID   : " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class LibraryDemo {

    static void searchMember(LibraryMember[] members, String id) {

        for (LibraryMember m : members) {

            if (m.memberId.equals(id)) {

                System.out.println("\nMember Found");
                m.displayDetails();
                return;
            }
        }

        System.out.println("Member Not Found");
    }

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Mayank", "S101"),
                new FacultyMember("Dr. Sharma", "F201"),
                new GuestMember("Rohit", "G301")
        };

        int overdueDays = 6;

        System.out.println("Library Members\n");

        for (LibraryMember m : members) {

            m.displayDetails();
            System.out.println("Fine = Rs. " + m.calculateFine(overdueDays));
            System.out.println();
        }

        searchMember(members, "F201");
    }
}