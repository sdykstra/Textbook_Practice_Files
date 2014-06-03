
public class RectangleDemo {
    
    public static void main(String[] args)
    {
    Rectangle box = new Rectangle(5.0, 15.0);
      
    double size = box.getLength();// we can set this call to a varible 
    
    System.out.println("Done. " + size);
    
     System.out.println("Done. " + box.getwidth()); // or use directly
     
     System.out.println("The area of the rectangle is " + box.getArea());  

    
    
    System.out.println(" Send value of 10.0 to the set lenght method. "+
            "Set the width to 20.0");
    box.setLength(10.0);
    box.setWidth(20.0);
    size = box.getLength();// we can set this call to a varible 
        
    System.out.println("Done. " + size);
    
     System.out.println("Done. " + box.getwidth()); // or use directly
     
     System.out.println("The area of the rectangle is " + box.getArea());
    
    }
    
}
