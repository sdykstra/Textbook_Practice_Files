


public class Rectangle {

    private double lenght;
    private double width;
    
    public Rectangle (double len, double w)
    {
    lenght = len;
    width = w;
    }
    
    
   public void setLength(double len) 
   {
       lenght = len;
   }
    
   public void setWidth(double w)
   {
       width = w; 
   }
    
   public double getLength()
   {
       return lenght;
   }
   
   public double getwidth()
   {
       return width;
   }
   
   public double getArea()
   {
       return lenght * width;
   }




}


