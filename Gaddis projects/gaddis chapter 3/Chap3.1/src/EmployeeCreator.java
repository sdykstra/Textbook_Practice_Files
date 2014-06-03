import java.util.Scanner;


public class EmployeeCreator {
    
    
    public static void main (String[] args){
     int num;
     String name;
     String dept;
     String postion;
     Scanner keyboard = new Scanner(System.in);
     
     
        
System.out.println("Please enter new Employee name ");
name = keyboard.nextLine();

System.out.println("Please enter new Employee ID number ");
num = keyboard.nextInt();

keyboard.nextLine();

System.out.println("Please enter new Employee's department ");
dept = keyboard.nextLine();

System.out.println("Please enter new Employee's postion in company ");
postion = keyboard.nextLine();
      
        Employee a = new Employee(name, dept, num, postion);
       
         
System.out.println("Please enter new Employee name ");
name = keyboard.nextLine();

System.out.println("Please enter new Employee ID number ");
num = keyboard.nextInt();

keyboard.nextLine();

System.out.println("Please enter new Employee's department ");
dept = keyboard.nextLine();

System.out.println("Please enter new Employee's postion in company ");
postion = keyboard.nextLine();
    
        Employee b = new Employee(name, dept, num, postion);     
        
         
System.out.println("Please enter new Employee name ");
name = keyboard.nextLine();

System.out.println("Please enter new Employee ID number ");
num = keyboard.nextInt();

keyboard.nextLine();

System.out.println("Please enter new Employee's department ");
dept = keyboard.nextLine();

System.out.println("Please enter new Employee's postion in company ");
postion = keyboard.nextLine();
   
        Employee c = new Employee(name, dept, num, postion);     
        
        
System.out.println("The first employee entered was "+ a.getName() + " with ID number"+ a.getIDNumer() +
        " who works in the "+ a.getDepartment()+ " and whos job title is" + a.getPostion());        
 
System.out.println("The second employee entered was "+ b.getName() + " with ID number"+ b.getIDNumer() +
        " who works in the "+ b.getDepartment()+ " and whos job title is" + b.getPostion());    
      
System.out.println("The thrid employee entered was "+ c.getName() + " with ID number"+ c.getIDNumer() +
        " who works in the "+ c.getDepartment()+ " and whos job title is" + c.getPostion());            
    
        
    }
}
