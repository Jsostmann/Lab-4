/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsmodel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jamesostmann
 */
public class ContactList {

    private String listName;
    private ArrayList<Client> contacts;

    public ContactList() {
        
        listName = "";
        contacts = new ArrayList<>();

        

    }
    
    @Override
    public String toString() {

        String result = "";
        
        for(Client temp: contacts) {
        
            result += temp.toString() + System.lineSeparator();
        
        }
        
        return this.listName + System.lineSeparator() + result;

    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public Client getContact(int index) {
        if (index > -1 && index < contacts.size()) {
            return contacts.get(index);
        } else {

            return null;

        }
    }
    
    public void addContact(Client client){
    
        contacts.add(client);
    }
    
    public void deleteClient(int index) {
        if(index > -1 && index < contacts.size()){
            contacts.remove(index);
        }
    
    
    }
            
    public int size(){
    
        return contacts.size();
    
    }

    public void loadContacts(String fName){
        
        try {
            
            
             Scanner scan = new Scanner(new File(fName));
            
             this.listName = scan.nextLine();
            
             
             while(scan.hasNextLine()) {
             
             String[] clientString = scan.nextLine().split(",");
             Client temp = new Client(clientString[0],clientString[1],clientString[2],Integer.parseInt(clientString[3]),clientString[4],clientString[5]);
             contacts.add(temp);
             
             
             }
             
             scan.close();
             
        } catch (FileNotFoundException e) {
        
            System.err.println("Couldnt find file to read.");
            System.exit(-1);
        }
        
    }
    
    public void saveContacts(String fName){
        
        try {
        
            PrintWriter output = new PrintWriter(new File(fName));
            
            
            output.print(this.toString());
            
            output.close();
            
        
        } catch(IOException e) {
        
            System.err.println("Couldnt find file for writing.");
            System.exit(-1);
        
        }
    
    }
    

}
