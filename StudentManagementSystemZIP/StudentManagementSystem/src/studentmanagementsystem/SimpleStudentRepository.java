/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.util.HashMap;
import java.util.Iterator;
/**
 *
 * @author Tiroshan
 */
public class SimpleStudentRepository implements StudentRepository{
    HashMap<Integer,Student> studentDB;
    private Student tempStudent;
    public SimpleStudentRepository(){
        studentDB =new HashMap<Integer, Student>();
        tempStudent =new Student();
    }
     

    @Override
    public void save(Student Stdnt) {
        studentDB.put(Stdnt.getRegistration_number(), Stdnt);
    }

    @Override
    public void update(Student stdnt) {
        
        studentDB.put(stdnt.getRegistration_number(), stdnt);
        
    }

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Student find(int Regno) {
         return studentDB.get(Regno);
    }
    
    public void GetAll(){
        Iterator it=studentDB.keySet().iterator();
        while(it.hasNext()){
            tempStudent=(Student) it.next();
            System.out.println("Registration number:"+tempStudent.getRegistration_number()+"Name:"+tempStudent.getFirst_name()+" "+tempStudent.getLast_name()+" Address:"+tempStudent.getAddress());
        }
    }
    
}
