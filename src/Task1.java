import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static class Person {
        String name;
        String address;

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        Person(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return name;
        }
    }

    public static class Student extends Person {
        int numCourses = 0;
        List<String> courses = new ArrayList<>();

        Student(String name, String address) {
            super(name, address);
        }

        public int getNumCourses() {
            return numCourses;
        }
    }

    public static class Teacher extends Person {
        int numCourses = 0;
        List<String> courses = new ArrayList<>();

        Teacher(String name, String address) {
            super(name, address);
        }

        public void addCourse(String course) {
            courses.add(course);
            numCourses++;
        }
    }

    public class SchoolManagementSystem {
        public static void main(String[] args) {
            Student student = new Student("John Doe", "123 Main St");
            Teacher teacher = new Teacher("Jane Smith", "456 Elm St");

            student.courses.add("Math");
            student.courses.add("Science");
            teacher.addCourse("English");

            System.out.println("Student: " + student.getName() + "(" + student.address + ")");
            System.out.println("Teacher: " + teacher.getName() + "(" + teacher.address + ")");
        }
    }
}