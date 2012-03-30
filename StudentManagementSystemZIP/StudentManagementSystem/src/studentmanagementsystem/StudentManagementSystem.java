/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

/**
 *
 * @author Tiroshan
 */
public class StudentManagementSystem {
    private SimpleStudentRepository DataBase;
    
    
    public StudentManagementSystem(SimpleStudentRepository DB){
        DataBase=DB;
               
    }
    
    public void ListAllStudents(){
        DataBase.GetAll();
    }
    public void savenewStudent(int reg, String fname, String lname, String add){
        Student st=new Student();
        st.setRegistration_number(reg);
        st.setFirst_name(fname);
        st.setLast_name(lname);
        st.setAddress(add);
        
        DataBase.save(st);
    }
}
