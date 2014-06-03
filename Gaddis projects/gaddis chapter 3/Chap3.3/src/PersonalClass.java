/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scott Dykstra
 */
public class PersonalClass {
    
    public static void main(String[] args)
    {
        
        String name, age, address,phone;
        name = "Scott D";
        age = "34";
        address = "9983 Wagner lane";
        phone = "303-450-1365";
        
        PersonalInfo a = new PersonalInfo(name, address, age, phone);
        
        
        name = "Andreea T";
        age = "35";
        address = "1945 Hudson st";
        phone = "720-244-7172";
        
        PersonalInfo b = new PersonalInfo(name, address, age, phone);
        
        name = "Varvara T";
        age = "57";
        address = "Bia Maria, Romania";
        phone = "Skype me";
        
        PersonalInfo c = new PersonalInfo(name, address, age, phone);
        
        
        System.out.println("The frist name on the list is " + a.getName() );
        System.out.println("The second perons address is " + b.getAddress());
        System.out.println("The third persons age is " + c.getAge());
        System.out.print("here is a list of their phone numbers '1' "+ a.getPhoneNumber()  
               + " '2' " + b.getPhoneNumber() + " '3' " + c.getPhoneNumber());
        
        
    }
}
