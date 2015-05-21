package modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 *
 *
 * @author 41420081
 */
import java.io.*;
import java.util.ArrayList;
import modelos.*;

public class Reader {

    /*
     University
     */
    public University readUniversityFile(String fileName) {
        University university = null;
        try {
            BufferedReader r = new BufferedReader(new FileReader(fileName));
            if (r != null) {
                String name = r.readLine();
                university = new University(name);

                //Undergraduate Students
                String line = r.readLine();
                int n = Integer.parseInt(line);
                for (int i = 0; i < n; i++) {
                    line = r.readLine();
                    String[] str = line.split("#");
                    //id, name, address, phone, email, major, minor
                    university.addUnderGraduateStudent(
                            Long.parseLong(str[0]),
                            str[1],
                            str[2],
                            str[3],
                            str[4],
                            str[5],
                            str[6]
                    );
                }
                //PostGraduate Students
                line = r.readLine();
                n = Integer.parseInt(line);
                for (int i = 0; i < n; i++) {
                    line = r.readLine();
                    String[] str = line.split("#");
                    //id, name, address, phone, email, thesisTitle, supervisor
                    university.addPostGraduateStudent(
                            Long.parseLong(str[0]),
                            str[1],
                            str[2],
                            str[3],
                            str[4],
                            str[5],
                            str[6]
                    );
                }
            }
        } catch (Exception e) {

        }

        return university;
    }

    public void writeUniversityFile(String fileName, University university) {
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter(fileName));
            if (w != null) {
                w.write(university.getName());
                w.newLine();

                //UnderGraduate Students
                ArrayList<UnderGraduateStudent> lug = university.getUnderGraduateStudentsarray();
                w.write(String.valueOf(lug.size()));
                w.newLine();
                for (UnderGraduateStudent student : lug) {
                    w.write(student.toString());
                    w.newLine();
                }

                //PostGraduate Students
                ArrayList<PostGraduateStudent> lpg = university.getPostGraduateStudentarray();
                w.write(String.valueOf(lpg.size()));
                w.newLine();
                for (PostGraduateStudent student : lpg) {
                    w.write(student.toString());
                    w.newLine();
                }
                w.flush();
                w.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     Courses
     */
    public ArrayList<Course> readCoursesFile(String fileName) {
        ArrayList<Course> list = new ArrayList<Course>();
        try {
            BufferedReader r = new BufferedReader(new FileReader(fileName));
            if (r != null) {
                String line = r.readLine();
                int n = Integer.parseInt(line);

                for (int i = 0; i < n; i++) {
                    line = r.readLine();
                    String[] str = line.split("#");
                    list.add(new Course(
                            str[0],
                            str[1],
                            Integer.parseInt(str[2]),
                            Integer.parseInt(str[3])
                    ));
                }
            }
        } catch (Exception e) {

        }
        return list;
    }

    public void writeCoursesFile(String fileName, ArrayList<Course> courses) {
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter(fileName));
            if (w != null) {
                w.write(String.valueOf(courses.size()));
                w.newLine();
                for (Course course : courses) {
                    w.write(course.toString());
                    w.newLine();
                }
            }

            w.flush();
            w.close();
        } catch (Exception e) {

        }
    }

    /*
     Registration
     */
    public ArrayList<Registration> readRegistrationFile(String fileName, University university) {
        ArrayList<Registration> list = new ArrayList<Registration>();
        try {
            BufferedReader r = new BufferedReader(new FileReader(fileName));
            if (r != null) {
                String line = r.readLine();
                int n = Integer.parseInt(line);

                for (int i = 0; i < n; i++) {
                    line = r.readLine();
                    String[] str = line.split("#");
                    Student student = university.getStudent(Long.parseLong(str[0]));
                    Course course = university.getCourse(str[1]);
                    list.add(new Registration(
                            student,
                            course,
                            Integer.parseInt(str[2]),
                            Integer.parseInt(str[3])
                    ));
                }
            }
        } catch (Exception e) {

        }
        return list;
    }

    public void writeRegistrationFile(String fileName, ArrayList<Registration> registrations) {
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter(fileName));
            if (w != null) {
                w.write(String.valueOf(registrations.size()));
                w.newLine();
                for (Registration registration : registrations) {
                    w.write(registration.toString());
                    w.newLine();
                }
            }

            w.flush();
            w.close();
        } catch (Exception e) {

        }
    }

}
