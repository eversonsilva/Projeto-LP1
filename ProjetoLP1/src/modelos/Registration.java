package modelos;

public class Registration {

    private Student student;
    private Course course;
    private int acadYear;
    private int semester;

    public Registration(Student student, Course course, int acadYear, int semester) {
        this.student = student;
        this.course = course;
        this.acadYear = acadYear;
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public int getAcadYear() {
        return acadYear;
    }

    public int getSemester() {
        return semester;
    }


    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setAcadYear(int acadYear) {
        this.acadYear = acadYear;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
