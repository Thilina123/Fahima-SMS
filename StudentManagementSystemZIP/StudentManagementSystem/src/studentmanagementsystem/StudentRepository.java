/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

/**
 *
 * @author Tiroshan
 */
public interface StudentRepository {
    
    public void save(Student Student);
    public void update(Student Student);
    public void edit();
    public Student find(int Regno);
   
}
