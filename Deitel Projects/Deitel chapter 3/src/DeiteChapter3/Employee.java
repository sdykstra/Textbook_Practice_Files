package DeiteChapter3;

/**
 *
 * @author ft
 */
public class Employee {

    String firstName, lastName;
    double salary;

    public void Employee() {
        firstName = null;
        lastName = null;
        salary = 0;
    }

    public void setLastName(String lastN) {
        lastName = lastN;
    }

    public void setFirstName(String firstN) {
        firstName = firstN;
    }

    public void setSalary(double wage) {
        if (wage > 0.0) {
            salary = wage;
        } else {
            System.out.println("You need to pay more!");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }

    public double yearlySalary() {
        double yearlySalary = 2080 * salary;
        return yearlySalary;
    }
    
    public void giveRaise(){
        salary = salary+(salary*.1);
    }
}// end Employee class
