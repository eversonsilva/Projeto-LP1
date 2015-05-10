
import modelos.University;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ezequieloliveira
 */
public class MyData {
    
    private University university;

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
    
    private MyData() {
    }
    
    public static MyData getInstance() {
        return DataHolder.INSTANCE;
    }
    
    private static class DataHolder {

        private static final MyData INSTANCE = new MyData();
    }
}
