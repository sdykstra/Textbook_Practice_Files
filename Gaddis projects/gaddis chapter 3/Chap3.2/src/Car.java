
public class Car {
    private int yearModel, speed;
    private String make;
    
    public Car(int year, String model)
    {
        yearModel = year;
        speed = 0;
        make = model;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public int getYearModel()
    {
        return yearModel;
    }
    
    public String getMake()
    {
        return make;
    }
        
    public void Accelerate()
    {
    speed +=5;
    }
    
    public void brake()
    {
    speed -=5;
    }
    
}
