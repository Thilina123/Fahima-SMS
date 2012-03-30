/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagementsystem;

/**
 *
 * @author Tiroshan
 */

public class Student {
    private int registration_number;
    private String first_name;
    private String last_name;
    private String address; 
    
    Student(){
        
    }

    public String getAddress() {
        return address;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getRegistration_number() {
        return registration_number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setRegistration_number(int registration_number) {
        this.registration_number = registration_number;
    }
    
            
}
