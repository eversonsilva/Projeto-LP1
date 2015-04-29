package modelos;

import java.util.ArrayList;

public class University {

    private String name;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private ArrayList<Registration> registrations;

    public University(String name) {
        this.name = name;

        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
        this.registrations = new ArrayList<>();
    }

    public Course addCourse(String code, String title, Integer numCredits, Integer maxStudents) {
        Course tmpCourse = new Course(code, title, numCredits, maxStudents);

        this.courses.add(tmpCourse);

        return tmpCourse;
    }

    public Course updateCourse(String code, String title, Integer numCredits, Integer maxStudents) {
        Course tmpCourse = new Course(code, title, numCredits, maxStudents);

        return tmpCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(ArrayList<Registration> registrations) {
        this.registrations = registrations;
    }
}
