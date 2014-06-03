package DeiteChapter3;

/**
 *
 * @author ft
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setFirstName("Joe ");
        employee1.setLastName("Smith");
        employee1.setSalary(-10);

        employee1.setSalary(10);

        employee2.setFirstName("Jan ");
        employee2.setLastName("Tompson");
        employee2.setSalary(20);

        System.out.printf("The first employee's name is %s%s\n",
                employee1.firstName, employee1.lastName);

        System.out.printf("The second employee's name is %s%s\n",
                employee2.firstName, employee2.lastName);

        System.out.printf("%s%s is going to make $%.2f this year.\n",
                employee1.firstName, employee1.lastName, employee1.yearlySalary());
       
        System.out.printf("%s%s is going to make $%.2f this year.\n",
                employee2.firstName, employee2.lastName, employee2.yearlySalary());
        
     
        employee1.giveRaise();
        employee2.giveRaise();
        
          System.out.printf("Next year %s%s will make $%.2f after their raise.\n",
                  employee1.firstName, employee1.lastName, employee1.yearlySalary());
       
        System.out.printf("Next year %s%s will make $%.2f after their raise.\n",
                employee2.firstName, employee2.lastName, employee2.yearlySalary());
        
    }// end main
}// end employeeTest class
