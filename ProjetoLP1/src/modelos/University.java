package modelos;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Course> courses;
    private List<Student> students;
    private List<Registration> registrations;

    public University(String name) {
        this.name = name;
        this.courses = new ArrayList<Course>();
        this.students = new ArrayList<Student>();
        this.registrations = new ArrayList<Registration>();
    }
    
    public Course getCourse(String code) {
        for(Course course : courses) {
            if(course.getCode() == code) return course;
        }
        
        return null;
    }
    
    public Registration getRegistration(Long studentID, String courseCode) {
        for(Registration registration : registrations) {
            if(registration.getStudent().getId() == studentID && registration.getCourse().getCode() == courseCode) return registration;
        }
        
        return null;
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

    public void updateCourse(String code, String title, Integer numCredits, Integer maxStudents) {
        for(Course course : courses) {
            if(course.getCode() == null ? code == null : course.getCode().equals(code)) {
                course.setTitle(title);
                course.setMaxStudents(maxStudents);
                course.setNumCredits(numCredits);
            }
        }
    }
    
    /*public Course updateCourse(String code, String title, Integer numCredits, Integer maxStudents) {
        Course course = getCourse(code);
        if(course != null) {
            course.setTitle(title);
            course.setNumCredits(numCredits);
            course.setMaxStudents(maxStudents);
        }
        return course;
    }*/

    public ArrayList<Course> getCourses(Long studentID) {
        ArrayList<Course> list = new ArrayList<Course>();
        for (Registration reg : this.registrations) {
            if(reg.getStudent().getId() == studentID)
                list.add(reg.getCourse());
        }
        return list;
    }

    /*
    Students
    */
    public UnderGraduateStudent addUnderGraduateStudent(Long id, String name, String address, String phone, String email, String major, String minor) {
        Student s = getStudent(id);
        UnderGraduateStudent student = (s instanceof UnderGraduateStudent)? (UnderGraduateStudent) s : null;
        if(s == null) {
            student = new UnderGraduateStudent(major, minor, id, name, address, phone, email);
            this.students.add(student);
        }
        return student;
    }

    public UnderGraduateStudent updateUnderGraduateStudent(Long id, String name, String address, String phone, String email, String major, String minor) {
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

    public PostGraduateStudent addPostGraduateStudent(Long id, String name, String address, String phone, String email, String thesisTitle, String supervisor) {
        Student s = getStudent(id);
        PostGraduateStudent student = (s instanceof PostGraduateStudent)? (PostGraduateStudent) s : null;
        if(s == null) {
            student = new PostGraduateStudent(thesisTitle, supervisor, id, name, address, phone, email);
            this.students.add(student);
        }
        return student;
    }

    public PostGraduateStudent updatePostGraduateStudent(Long id, String name, String address, String phone, String email, String thesisTitle, String supervisor) {
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

    public Student getStudent(Long id) {
        for (Student student : students) {
            if (student.getId() == id) 
                return student;
        }
        return null;
    }

    public ArrayList<Student> getStudents(String courseCode) {
        ArrayList<Student> list = new ArrayList<Student>();
        for (Registration reg : this.registrations) {
            if (reg.getCourse().getCode().equals(courseCode))
                list.add(reg.getStudent());
        }
        return list;
    }
    
    public String getStudents() {
        String students = "";
        for(Student student : this.students) {
            students += student.toString() + " ";
        }
        return students;
    }

    public String getUnderGraduateStudents() {
        String list = "";
        for(Student student : this.students) {
            if(student instanceof UnderGraduateStudent)
                list += student.toString() + " ";
        }
        return list;
    }
    
    public Boolean deRegisterStudent(Long idStudent, String codeCourse) {
        for(Registration reg : this.registrations) {
            if ( reg.getStudent().getId() == idStudent && reg.getCourse().getCode() == codeCourse ) {
                return true;
            }
        }
        return false;
    }

    public List<Student> getStudentsArray() {
        return this.students;
    }
    
    public List<Course> getCoursesArray() {
        return this.courses;
    }
    
    public List<Registration> getRegistrationsArray() {
        return this.registrations;
    }
    
    public String getPostGraduateStudent() {
         String list = "";
        for(Student student : this.students) {
            if(student instanceof PostGraduateStudent)
                list += student.toString() + " ";
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
        return (ArrayList<Registration>) registrations;
    }

    public String getCourses() {
        String courses = "";
        
        for(Course course : this.courses) {
            courses += course.toString() + " ";
        }
        
        return courses;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
    public Student findStudent(Long id) {
        for(Student student : students) {
            if(student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
