package modelos;

public class PostGraduateStudent extends Student {

    private String thesisTitle;
    private String supervisor;

    public PostGraduateStudent(String thesisTitle, String supervisor, Long id, String name, String address, String phone, String email) {
        super(id, name, address, phone, email);
        this.thesisTitle = thesisTitle;
        this.supervisor = supervisor;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public String getSupervisor() {
        return supervisor;
    }


    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public String toString() {
        return super.toString() + "#" + thesisTitle + "#" + supervisor;
    }
}
