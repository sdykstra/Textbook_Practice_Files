
public class Employee {

 
    private int idNumber;
    private String name;
    private String department;
    private String postion;
    

    public Employee(String employeeName, String employeeDept, int idNum, String jobTitle) 
    {
        name = employeeName;
        department = employeeDept;
        idNumber = idNum;
        postion = jobTitle;


    }
    
    public String getName()
    {
    return name;
    }
    
    public String getDepartment()
    {
    return department;
    }
    
    public String getPostion()
    {
        return postion;
    }
    
    public int getIDNumer()
    {
    return idNumber;
    }
            
}
