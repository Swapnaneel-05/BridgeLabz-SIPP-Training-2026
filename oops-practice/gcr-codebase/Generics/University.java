import java.util.*;

abstract class CourseType {
    String name;

    CourseType(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class ExamCourse extends CourseType {
    ExamCourse(String name) {
        super(name);
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String name) {
        super(name);
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String name) {
        super(name);
    }
}

class Course<T extends CourseType> {

    ArrayList<T> list = new ArrayList<>();

    void addCourse(T c) {
        list.add(c);
    }

    List<T> getCourses() {
        return list;
    }
}

public class University {

    public static void display(List<? extends CourseType> list) {

        for (CourseType c : list)
            System.out.println(c);
    }

    public static void main(String[] args) {

        Course<ExamCourse> exam = new Course<>();
        exam.addCourse(new ExamCourse("Java"));

        Course<ResearchCourse> research = new Course<>();
        research.addCourse(new ResearchCourse("AI"));

        display(exam.getCourses());
        display(research.getCourses());
    }
}