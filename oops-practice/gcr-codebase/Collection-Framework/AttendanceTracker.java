import java.util.*;

public class AttendanceTracker {

    HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    // Mark attendance
    public void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println("Duplicate attendance not allowed");
        }
    }

    // Display attendance
    public void displayAttendance() {

        System.out.println();

        for (String subject : attendance.keySet()) {

            ArrayList<String> students = attendance.get(subject);

            System.out.println("Subject: " + subject);
            System.out.println("Students: " + students);
            System.out.println("Total Students: " + students.size());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        AttendanceTracker tracker = new AttendanceTracker();

        tracker.markAttendance("Java", "Mayank");
        tracker.markAttendance("Java", "Rahul");
        tracker.markAttendance("Java", "Mayank"); // Duplicate

        tracker.markAttendance("DBMS", "Aman");
        tracker.markAttendance("DBMS", "Rahul");

        tracker.markAttendance("DSA", "Mayank");
        tracker.markAttendance("DSA", "Aman");

        tracker.displayAttendance();
    }
}