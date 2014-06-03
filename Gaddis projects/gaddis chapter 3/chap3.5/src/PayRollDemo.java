import java.util.Scanner;




public class PayRollDemo {
         

    
    public static void main (String [] args)
    {
                    
            String name;
            double hoursWorked, payRate, grossPay;
            int idNum;
           
        
        
        Scanner keys = new Scanner(System.in);

        System.out.println("Please enter emplyee name ");
        name = keys.nextLine();
        
        System.out.println("Please enter the employee ID number ");
        idNum = keys.nextInt();
        
        keys.nextLine();
        
        Payroll info = new Payroll(name, idNum);
        
        
        
        payRate = info.setPayRate(15.45);
        hoursWorked = info.setHoursWorked(45);
        
        grossPay = info.grossPay();
        
        System.out.printf("The employee name %s with an ID number of %d"+
                " his gross pay will be $%.2f this week. ", name, idNum, grossPay);
                
    }
    
    
}
