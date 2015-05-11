package modelos;

import java.util.ArrayList;

public class University {

    private String name;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private ArrayList<Registration> registrations;

    public University(String name) {
        this.name = name;
        this.courses = new ArrayList<Course>();
        this.students = new ArrayList<Student>();
        this.registrations = new ArrayList<Registration>();
    }
    
    public void addStudent(Student student) {
        this.students.add(student);
    }

    /*
    Name
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    Courses
    */
    public Course addCourse(String code, String title, Integer numCredits, Integer maxStudents) {
        Course course = getCourse(code);
        if(course == null) {
            course = new Course(code, title, numCredits, maxStudents);
            this.courses.add(course);
        }
        return course;
    }

    public Course updateCourse(String code, String title, Integer numCredits, Integer maxStudents) {
        Course course = getCourse(code);
        if(course != null) {
            course.setTitle(title);
            course.setNumCredits(numCredits);
            course.setMaxStudents(maxStudents);
        }
        return course;
    }

    public Course getCourse(String code) {
        for (Course course : courses)
            if(course.getCode().equals(code))
                return course;
        return null;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Course> getCourses(long studentID) {
        ArrayList<Course> list = new ArrayList<Course>();
        for (Registration reg : this.registrations) {
            if(reg.getStudent().getId() == studentID)
                list.add(reg.getCourse());
        }
        return list;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    /*
    Students
    */
    public UnderGraduateStudent addUnderGraduateStudent(long id, String name, String address, String phone, String email, String major, String minor) {
        Student s = getStudent(id);
        UnderGraduateStudent student = (s instanceof UnderGraduateStudent)? (UnderGraduateStudent) s : null;
        if(s == null) {
            student = new UnderGraduateStudent(major, minor, id, name, address, phone, email);
            this.students.add(student);
        }
        return student;
    }

    public UnderGraduateStudent updateUnderGraduateStudent(long id, String name, String address, String phone, String email, String major, String minor) {
        Student s = getStudent(id);
        UnderGraduateStudent student = (s instanceof UnderGraduateStudent)? (UnderGraduateStudent) s : null;
        if(student != null) {
            student.setName(name);
            student.setAddress(address);
            student.setPhone(phone);
            student.setEmail(email);
            student.setMajor(major);
            student.setMinor(minor);
        }
        return student;
    }

    public PostGraduateStudent addPostGraduateStudent(long id, String name, String address, String phone, String email, String thesisTitle, String supervisor) {
        Student s = getStudent(id);
        PostGraduateStudent student = (s instanceof PostGraduateStudent)? (PostGraduateStudent) s : null;
        if(s == null) {
            student = new PostGraduateStudent(thesisTitle, supervisor, id, name, address, phone, email);
            this.students.add(student);
        }
        return student;
    }

    public PostGraduateStudent updatePostGraduateStudent(long id, String name, String address, String phone, String email, String thesisTitle, String supervisor) {
        Student s = getStudent(id);
        PostGraduateStudent student = (s instanceof PostGraduateStudent)? (PostGraduateStudent) s : null;
        if(student != null) {
            student.setName(name);
            student.setAddress(address);
            student.setPhone(phone);
            student.setEmail(email);
            student.setThesisTitle(thesisTitle);
            student.setSupervisor(supervisor);
        }
        return student;
    }

    public Student getStudent(long id) {
        for (Student student : students) {
            if (student.getId() == id) 
                return student;
        }
        return null;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Student> getStudents(String courseCode) {
        ArrayList<Student> list = new ArrayList<Student>();
        for (Registration reg : this.registrations) {
            if (reg.getCourse().getCode().equals(courseCode))
                list.add(reg.getStudent());
        }
        return list;
    }

    public ArrayList<UnderGraduateStudent> getUnderGraduateStudents() {
        ArrayList<UnderGraduateStudent> list = new ArrayList<UnderGraduateStudent>();
        for(Student student : this.students) {
            if(student instanceof UnderGraduateStudent)
                list.add((UnderGraduateStudent) student);
        }
        return list;
    }

    public ArrayList<PostGraduateStudent> getPostGraduateStudent() {
        ArrayList<PostGraduateStudent> list = new ArrayList<PostGraduateStudent>();
        for(Student student : this.students) {
            if(student instanceof PostGraduateStudent)
                list.add((PostGraduateStudent) student);
        }
        return list;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    /*
    Registrations
    */
    public ArrayList<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(ArrayList<Registration> registrations) {
        this.registrations = registrations;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
