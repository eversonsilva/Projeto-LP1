package modelos;

public class UnderGraduateStudent extends Student {

    private String major;
    private String minor;

    public UnderGraduateStudent(long id, String name, String address, String phone, String email, String major, String minor) {
        super(id, name, address, phone, email);
        this.major = major;
        this.minor = minor;
    }

    public String getMajor() {
        return major;
    }

    public String getMinor() {
        return minor;
    }


    public void setMajor(String major) {
        this.major = major;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    @Override
    public String toString() {
        return super.toString() + " UnderGraduate (" + major + ", " + minor + ")"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
}
