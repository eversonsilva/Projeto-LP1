/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ezequieloliveira
 */
public class UniversityTest {
    
    public UniversityTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        String code = "";
        String title = "";
        Integer numCredits = null;
        Integer maxStudents = null;
        University instance = null;
        Course expResult = null;
        Course result = instance.addCourse(code, title, numCredits, maxStudents);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateCourse() {
        System.out.println("updateCourse");
        String code = "";
        String title = "";
        Integer numCredits = null;
        Integer maxStudents = null;
        University instance = null;
        Course expResult = null;
        Course result = instance.updateCourse(code, title, numCredits, maxStudents);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        University instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        University instance = null;
        instance.setName(name);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCourses() {
        System.out.println("getCourses");
        University instance = null;
        ArrayList<Course> expResult = null;
        ArrayList<Course> result = instance.getCourses();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCourses() {
        System.out.println("setCourses");
        ArrayList<Course> courses = null;
        University instance = null;
        instance.setCourses(courses);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        University instance = null;
        ArrayList<Student> expResult = null;
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetStudents() {
        System.out.println("setStudents");
        ArrayList<Student> students = null;
        University instance = null;
        instance.setStudents(students);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRegistrations() {
        System.out.println("getRegistrations");
        University instance = null;
        ArrayList<Registration> expResult = null;
        ArrayList<Registration> result = instance.getRegistrations();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRegistrations() {
        System.out.println("setRegistrations");
        ArrayList<Registration> registrations = null;
        University instance = null;
        instance.setRegistrations(registrations);
        fail("The test case is a prototype.");
    }
    
}
