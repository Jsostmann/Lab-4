/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsmodel;

/**
 *
 * @author jamesostmann
 */
public class Client {
    
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String phone;
    private String email;
    
    public Client() {
    
        this(null,null,null,0,null,null);
        
    }
    
    public Client(String fn, String ln, String gndr, int age, String phone, String email) {
   
        this.firstName = fn;
        this.lastName = ln;
        this.gender = gndr;
        this.age = age;
        this.phone = phone;
        this.email = email;
        
        
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString() {
    
     //System.out.println(String.format("%-20s%-20s%-15s%-15d%-20s%-20s", this.firstName, this.lastName, this.gender, this.age, this.phone , this.email));   
     return this.firstName + "," + this.lastName + "," + this.gender + "," + this.age + "," + this.phone + "," + this.email;
    
    }
    
    public static void main(String[] args) {
   
        ContactList students = new ContactList();
        Client a = new Client("james","ostmann","male",20,"2244445555","dnd@gmail.com");
        Client b = new Client("hans","ostmann","male",19,"334445555","hans@gmail.com");
        students.loadContacts("contacts.txt");
       

        
        System.out.println(students.toString());
        students.saveContacts("contacts.txt");
        
        
        

        
       
    }
    
    
    
    
    
    
}
