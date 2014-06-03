
/**
 * @author Scott Dykstra
 */
public class Pet 
{
private String name, age, type;

public Pet( String pName, String pAge, String pType)
{
    name = pName;
    age = pAge;
    type = pType;
   
}

public void setName(String pName)
{
    name = pName;
}


public void setType(String pType)
{
  type = pType;  
}

public void setAge( String pAge)
{
    age= pAge;
}


public String getName()
{
    return name;
}

public String getType ()
{
    return type;
}

public String getAge()
{
    return age;
}

public String toString()
{
    String str  = " Your animals name is " + name + " , the type is a "
                    + type + " and the age of your aminal is " + age + " .";
    return str;
}

}




