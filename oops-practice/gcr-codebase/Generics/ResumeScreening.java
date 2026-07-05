import java.util.*;

abstract class JobRole {

    String role;

    JobRole(String role) {
        this.role = role;
    }

    public String toString() {
        return role;
    }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {

    T role;

    Resume(T role) {
        this.role = role;
    }

    void process() {
        System.out.println("Processing Resume for " + role);
    }
}

public class ResumeScreening {

    public static void display(List<? extends JobRole> list) {

        for (JobRole r : list)
            System.out.println(r);
    }

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>(new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>(new DataScientist());

        r1.process();
        r2.process();

        List<JobRole> roles = new ArrayList<>();

        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        display(roles);
    }
}