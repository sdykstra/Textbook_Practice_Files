
public class PersonalInfo 
{

    private String name, address, age, phoneNum;

    public PersonalInfo(String newName, String newAddress, String currentAge, String phone) 
    {
        name = newName;
        address = newAddress;
        age = currentAge;
        phoneNum = phone;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getAge()
    {
        return age;
    }
    
    public String getPhoneNumber()
    {
        return phoneNum;
    }
}
