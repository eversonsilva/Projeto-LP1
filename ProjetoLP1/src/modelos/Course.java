package modelos;

public class Course {

    private String code;
    private String title;
    private Integer numCredits;
    private Integer maxStudents;

    public Course(String code, String title, Integer numCredits, Integer maxStudents) {
        this.code = code;
        this.title = title;
        this.numCredits = numCredits;
        this.maxStudents = maxStudents;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public Integer getNumCredits() {
        return numCredits;
    }

    public Integer getMaxStudents() {
        return maxStudents;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumCredits(Integer numCredits) {
        this.numCredits = numCredits;
    }

    public void setMaxStudents(Integer maxStudents) {
        this.maxStudents = maxStudents;
    }

    @Override
    public String toString() {
        return this.code + "#" + this.title + "#" + this.numCredits + "#" + this.maxStudents;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
}
