
public class CarDrive {

    
    
    public static void main(String[] args) {
        
       Car ford = new Car(1969 , "Mustang");
       
       System.out.println("The car is a Ford " + ford.getYearModel()+" " + ford.getMake() + "!");
       
       System.out.println("The car's traveling speed is "  + ford.getSpeed() );
        ford.Accelerate();     
       
       System.out.println("The car's traveling speed is "  + ford.getSpeed() );
       ford.Accelerate();
       
       System.out.println("The car's traveling speed is "  + ford.getSpeed() );
         ford.Accelerate();     
       
       System.out.println("The car's traveling speed is "  + ford.getSpeed() );
       ford.Accelerate();
       
       System.out.println("The car's traveling speed is "  + ford.getSpeed() );
         ford.Accelerate();     
       
       System.out.println("The car's traveling speed is "  + ford.getSpeed() );
       ford.brake();
       
       System.out.println("The car's traveling speed is "  + ford.getSpeed() );
        ford.brake();      
       
       System.out.println("The car's traveling speed is "  + ford.getSpeed() );
       ford.brake();
       
       System.out.println("The car's traveling speed is "  + ford.getSpeed() );
        ford.brake();      
       
       System.out.println("The car's traveling speed is "  + ford.getSpeed() );
       ford.brake();
       
       System.out.println("The car's traveling speed is "  + ford.getSpeed() );
       
    }
}
