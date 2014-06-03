
public class Widget
{
   private int numWidget;
  private double numHours, num, day, numDays; 
  
  
  public Widget(int widget)
  {
      numWidget = widget;
  }

    
    public double findNumDays()
    {
        numHours = numWidget/10;
         
        day = 16;
        numDays = numHours/day;
     return numDays;   
    }
}
